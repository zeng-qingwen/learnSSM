package com.zqw.dao;

import com.zqw.pojo.City;
import com.zqw.utils.WorldDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
public class CityDaoTest {

    @Test
    public void testFindAll(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities= cityMapper.findAll();
        for (City c: cities) {
            System.out.println(c);
        }
        sqlSession.close();
    }

    @Test
    public void testFindByid(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CityMapper cityMapper =  sqlSession.getMapper(CityMapper.class);
        City city = cityMapper.findByid(123);
        System.out.println(city);
        sqlSession.close();
    }


    @Test
    public void testFindByLimit(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        HashMap<String,Integer> map =new HashMap<String, Integer>();
//        startIndex:起始也;pageSize:每一页的大小;
        map.put("startIndex",10);
        map.put("pageSize",10);
        List<City> cities = cityMapper.findByLimit(map);
        for (City city: cities) {
            System.out.println(city);
        }
        sqlSession.close();
    }
}
