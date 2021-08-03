package com.impi.mapper;

import com.impi.domain.Pottery;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface PotteryMapper extends Mapper<Pottery> {

    @Select("select count(*) from pottery")
    public int getCount();
}
