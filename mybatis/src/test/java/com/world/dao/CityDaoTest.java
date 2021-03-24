package com.world.dao;

import com.world.Dao.CityMapper;
import com.world.Pojo.City;
import com.world.Utils.WorldDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CityDaoTest {
    @Test
    public void TestFindAll(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities = cityMapper.findAll();
        for (City city : cities) {
            System.out.println(city);
        }
        sqlSession.close();
    }
}
