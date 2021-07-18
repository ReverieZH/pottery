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
    public Map<String,Object> selectAll(){
        Map<String,Object> map=new HashMap<>();
        List<Pottery> potteries = potteryService.selectAll();
        System.out.println(potteries);
        if(potteries!=null){
            map.put("issuccess",true);
            map.put("potteries",potteries);
        }else{
            map.put("issuccess",false);
        }
        return map;
    }



}
