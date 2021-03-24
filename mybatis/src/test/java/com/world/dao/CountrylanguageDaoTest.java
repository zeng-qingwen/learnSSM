package com.world.dao;

import com.world.Dao.CountrylanguageMapper;
import com.world.Pojo.Countrylanguage;
import com.world.Utils.WorldDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class CountrylanguageDaoTest {
    @Test
    public void TestFindAll(){
        SqlSession sqlSession = WorldDBUtils.getSqlSession();
        CountrylanguageMapper countrylanguageMapper = sqlSession.getMapper(CountrylanguageMapper.class);
        List<Countrylanguage> countrylanguages = countrylanguageMapper.findAll();
        for (Countrylanguage countrylanguage : countrylanguages) {
            System.out.println(countrylanguage);
        }
        sqlSession.close();
    }
}
