package com.impi.mapper;

import com.impi.domain.Pottery;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface PotteryMapper extends Mapper<Pottery> {
}
