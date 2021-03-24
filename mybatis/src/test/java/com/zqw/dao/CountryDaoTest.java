package com.zqw.dao;

import com.zqw.pojo.Country;
import com.zqw.utils.WorldDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CountryDaoTest {
    @Test
    public void testFindAll(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        List<Country> countries = countryMapper.findAll();
        for (Country country : countries) {
            System.out.println(country);
        }

        sqlSession.close();
    }

    @Test
    public void testFindByCode(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Country country = countryMapper.findByCode("ZAF");
        System.out.println(country);
        sqlSession.close();
    }
}
