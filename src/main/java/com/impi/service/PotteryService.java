package com.impi.service;

import com.impi.domain.Pottery;

import java.util.List;

public interface PotteryService {

    List<Pottery>  selectAll();

    public Pottery selectByKey(Integer code);

    public int insert(Pottery pottery);

    public int update(Pottery pottery);

    public int delete(Integer code);

}
