package com.xjy.study.myjpas.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.xjy.study.myjpas.dto.XhhProjectAddressContainsProjectDto;
import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
import com.xjy.study.myjpas.entity.hibernate.XhhProjectEntity;
import com.xjy.study.myjpas.mapper.XhhProjectAddressMapper;
import com.xjy.study.myjpas.mapper.XhhProjectMapper;
import com.xjy.study.myjpas.service.IXhhProjectService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class XhhProjectJPATest {
    @Autowired
    private XhhProjectRepository xhhProjectRepository;

    /**
     * jpa方式-简单查询
     *
     * @author: xjy 
     * @param: 
     * @return: void
     * @exception: 
     * @date: 2021/8/9 18:47
     */
    @Test
    public void testJPA() {
        List<XhhProjectEntity> list = xhhProjectRepository.findByUserId(6L);
        System.out.println(list);
    }

    @Test
    public  void testJPANativeSql(){
        List<XhhProjectContainsAddressDto> list = xhhProjectRepository.findContainsAddressByUserNative("6");
        System.out.println(list);
    }

}
