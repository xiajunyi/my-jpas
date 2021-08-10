package com.xjy.study.myjpas.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.xjy.study.myjpas.dto.XhhProjectAddressContainsProjectDto;
import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
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
public class XhhProjectMybatisTest {
    @Autowired
    private SqlSessionFactory factory;

    @Autowired
    private XhhProjectMapper xhhProjectMapper;

    @Autowired
    private XhhProjectAddressMapper xhhProjectAddressMapper;

    @Autowired
    private IXhhProjectService xhhProjectService;

    /**
     * SqlSession方式查询
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:34
     */
    @Test
    public void test11() {
        SqlSession sqlSession = factory.openSession();
        XhhProjectMapper xhhProjectDao = sqlSession.getMapper(XhhProjectMapper.class);
        System.out.println(xhhProjectDao.selectByUserId("6"));
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * <collection>-嵌套映射
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:35
     */
    @Test
    public void test12() {
        List<XhhProjectContainsAddressDto> xhhProjectContainsAddressDtos = xhhProjectMapper.selectByUserId2("6");
        System.out.println(xhhProjectContainsAddressDtos);
    }

    /**
     * <collection>-嵌套select
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:36
     */
    @Test
    public void test13() {
        List<XhhProjectContainsAddressDto> xhhProjectContainsAddressDtos = xhhProjectMapper.selectByUserId3("6");
        System.out.println(xhhProjectContainsAddressDtos);
    }

    /**
     * <association>-嵌套映射
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:36
     */
    @Test
    public void test21() {
        List<XhhProjectAddressContainsProjectDto> list = xhhProjectAddressMapper.selectByAddressId("1");
        System.out.println(list);
    }

    /**
     * <association>-嵌套select
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:38
     */
    @Test
    public void test22() {
        List<XhhProjectAddressContainsProjectDto> list = xhhProjectAddressMapper.selectByAddressId2("1");
        System.out.println(list);
    }

    /**
     * pageHelper方式分页
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:38
     */
    @Test
    public void testPage1() {
        // 嵌套映射(因为没有从主表count，达不到预期分页效果)
        PageInfo<XhhProjectContainsAddressDto> pageInfo = xhhProjectService.getPage2(2, 2, "6");
        // 嵌套select(貌似只对嵌套select的一对多才能正确分页)
        // PageInfo<XhhProjectContainsAddressDto> pageInfo = xhhProjectService.getPage3(1, 2, "6");
        System.out.println(pageInfo);
    }

    /**
     * mybatis-plus插件方式分页
     *
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/8/9 16:38
     */
    @Test
    public void testPage2() {
        Page<XhhProjectContainsAddressDto> page = new Page<>(1, 2);
        IPage<XhhProjectContainsAddressDto> pageInfo = xhhProjectMapper.selectByUserId2(page, "6");
        // IPage<XhhProjectContainsAddressDto> pageInfo = xhhProjectMapper.selectByUserId3(page, "6");
        System.out.println(pageInfo);
    }
}
