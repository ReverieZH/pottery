package com.impi.pottery;

import com.impi.domain.Pottery;
import com.impi.mapper.PotteryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PotteryMapperTest {
    @Autowired
    private PotteryMapper potteryMapper;

    @Test
    public void testAdd(){
        Pottery pottery=new Pottery();
        pottery.setName("test测试");
        potteryMapper.insert(pottery);
    }
}
