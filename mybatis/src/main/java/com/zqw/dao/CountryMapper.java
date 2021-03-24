package com.zqw.dao;

import com.zqw.pojo.Country;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CountryMapper {
    @Select("select * from country")
    List<Country> findAll();


    @Select("select * from country where Code = #{Code}")
    Country findByCode(@Param("Code") String Code);
}
