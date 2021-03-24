package com.zqw.dao;

import com.zqw.pojo.City;

import java.util.List;
import java.util.Map;

public interface CityMapper {
//    查询全部城市
    List<City> findAll();

//    根据ID查城市
    City findByid(int ID);

//    分页查询
    List<City> findByLimit(Map<String,Integer> map);


}
