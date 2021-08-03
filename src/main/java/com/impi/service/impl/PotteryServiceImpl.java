package com.impi.service.impl;

import com.github.pagehelper.PageHelper;
import com.impi.domain.Pottery;
import com.impi.mapper.PotteryMapper;
import com.impi.service.PotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("potteryService")
public class PotteryServiceImpl implements PotteryService {
    @Autowired
    private PotteryMapper potteryMapper;

    @Override
    public List<Pottery> selectAll() {
        return potteryMapper.selectAll();
    }

    @Override
    public List<Pottery> findAllByPage(int pageNum, int pageSize) {
        long startTime = System.currentTimeMillis();
        System.out.println();
        PageHelper.startPage(pageNum, pageSize);
        List<Pottery> potteries=potteryMapper.selectAll();
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        return potteries;
    }

    @Override
    public Pottery selectByKey(Integer code) {
        return potteryMapper.selectByPrimaryKey(code);
    }

    @Override
    public int insert(Pottery pottery) {
        return potteryMapper.insert(pottery);
    }

    @Override
    public int update(Pottery pottery) {
        return potteryMapper.updateByPrimaryKey(pottery);
    }

    @Override
    public int delete(Integer code) {
        return potteryMapper.deleteByPrimaryKey(code);
    }

    @Override
    public int getCount() {
        return potteryMapper.getCount();
    }
}
