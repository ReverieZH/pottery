package com.impi.controller;

import com.impi.domain.Pottery;
import com.impi.service.PotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pottery")
@CrossOrigin
public class PotteryController {

    @Autowired
    private PotteryService potteryService;

    @RequestMapping("/dataMain")
    @ResponseBody
    public Map<String,Object> selectByPage(Integer pageNum,Integer pageSize){
        System.out.println("pageNum:"+pageNum+"pageSize:"+pageSize);
        Map<String,Object> map=new HashMap<>();
        List<Pottery> potteries = potteryService.findAllByPage(pageNum,pageSize);
//        System.out.println(potteries);
        int total=potteryService.getCount();
        if(potteries!=null){
            map.put("issuccess",true);
            map.put("potteries",potteries);
            map.put("total",total);
        }else{
            map.put("issuccess",false);
        }
        return map;
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String,Object> selectAll(){
        Map<String,Object> map=new HashMap<>();
        List<Pottery> potteries = potteryService.selectAll();
        int total=potteryService.getCount();
        if(potteries!=null){
            map.put("issuccess",true);
            map.put("potteries",potteries);
            map.put("total",total);
        }else{
            map.put("issuccess",false);
        }
        return map;
    }


    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> addPottery(Pottery pottery){
        Map<String,Object> map=new HashMap<>();
        System.out.println(pottery);
        int insert=potteryService.insert(pottery);
        if(insert>0){
            System.out.println("成功");
            map.put("issuccess",true);
        }else{
            System.out.println("失败");
            map.put("issuccess",false);
        }
        return map;
    }

    @RequestMapping("/check")
    @ResponseBody
    public Map<String,Object> checkInfo(Integer code){
        Map<String,Object> map=new HashMap<>();
        Pottery pottery=potteryService.selectByKey(code);
        if(pottery!=null){
            map.put("issuccess",true);
            map.put("pottery",pottery);
        }else{
            map.put("issuccess",false);
        }
        return map;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Map<String,Object> editInfo(Pottery pottery){
        Map<String,Object> map=new HashMap<>();
        int edit=potteryService.update(pottery);
        if(edit>0){
            System.out.println("成功");
            map.put("issuccess",true);
        }else{
            System.out.println("失败");
            map.put("issuccess",false);
        }
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map<String,Object> deleteInfo(Integer code){
        Map<String,Object> map=new HashMap<>();
        int delete=potteryService.delete(code);
        if(delete>0){
            System.out.println("成功");
            map.put("issuccess",true);
        }else{
            System.out.println("失败");
            map.put("issuccess",false);
        }
        return map;
    }
}
