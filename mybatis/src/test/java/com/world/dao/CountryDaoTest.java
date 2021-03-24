package com.world.dao;

import com.world.Dao.CountryMapper;
import com.world.Pojo.Country;
import com.world.Utils.WorldDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CountryDaoTest {

    @Test
    public void TestFindAll(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        List<Country> countries = countryMapper.findAll();
        for (Country country : countries) {
            System.out.println(country);
        }
        sqlSession.close();
    }
}
