package com.lou.springboot.louspringboot.dao;

import com.lou.springboot.louspringboot.entity.GeneratorTest;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface GeneratorTestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GeneratorTest record);

    int insertSelective(GeneratorTest record);

    GeneratorTest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GeneratorTest record);

    int updateByPrimaryKey(GeneratorTest record);
}