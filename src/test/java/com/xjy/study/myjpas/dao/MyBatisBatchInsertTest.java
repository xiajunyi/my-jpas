package com.xjy.study.myjpas.dao;

import com.xjy.study.myjpas.entity.mybatis.PuppeteerCreateInfo;
import com.xjy.study.myjpas.mapper.PuppeteerCreateInfoMapper;
import com.xjy.study.myjpas.service.IPuppeteerCreateInfoService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class MyBatisBatchInsertTest {
    @Autowired
    private IPuppeteerCreateInfoService puppeteerCreateInfoService;

    @Resource
    SqlSessionFactory sqlSessionFactory;

    @Test
    /**
     * 批量插入-MyBatis的拼接方式
     *
     * 如下插入方式1万条需要4.5秒左右，感觉还不是最优的
     * 在jdbc连接串中加入rewriteBatchedStatements=true后，1万条需要3秒左右
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/7/31 14:47
     */
    void testBatchInsertPinJie() {
        List<PuppeteerCreateInfo> list = new ArrayList<>();
        PuppeteerCreateInfo info = new PuppeteerCreateInfo();
        info.setUrl("www.baidu.com");
        info.setOssUrl("www.baidu.com");
        info.setType("1");
        info.setStatus("1");
        info.setCreateTime(LocalDateTime.now());
        info.setUpdateTime(LocalDateTime.now());
        info.setPuppeteerId("121");
        info.setDelFlag("1");
        info.setMessage("123456");
        info.setRemark("23456");
        info.setMd5("123456");
        for (int i = 0; i < 10000; i++) {
            list.add(info);
        }
        long begin = System.currentTimeMillis();
        puppeteerCreateInfoService.myInsertBatch(list);
        long tt = System.currentTimeMillis() - begin;
        System.out.println("MyBatis的拼接方式用时" + tt + "ms");
    }

    @Test
    /**
     * 批量插入-MyBatis的batch方式
     *
     * 如下插入方式在不设置额外配置的时候，相当于循环单条插入，1万条需要150秒左右
     * 在jdbc连接串中加入rewriteBatchedStatements=true后，1万条需要2秒左右
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/7/31 14:46
     */
    void testBatchInsertMP() {
        List<PuppeteerCreateInfo> list = new ArrayList<>();
        PuppeteerCreateInfo info = new PuppeteerCreateInfo();
        info.setUrl("www.baidu.com");
        info.setOssUrl("www.baidu.com");
        info.setType("1");
        info.setStatus("1");
        info.setCreateTime(LocalDateTime.now());
        info.setUpdateTime(LocalDateTime.now());
        info.setPuppeteerId("121");
        info.setDelFlag("1");
        info.setMessage("123456");
        info.setRemark("23456");
        info.setMd5("123456");
        for (int i = 0; i < 10000; i++) {
            list.add(info);
        }
        long begin = System.currentTimeMillis();
        puppeteerCreateInfoService.saveBatch(list);
        long tt = System.currentTimeMillis() - begin;
        System.out.println("MyBatis的batch方式用时" + tt + "ms");
    }

    @Test
    /**
     * 批量插入-SqlSession方式
     *
     * 如下插入方式在不设置额外配置的时候，相当于循环单条插入，1万条需要150秒左右
     * 在jdbc连接串中加入rewriteBatchedStatements=true后，1万条需要800毫秒左右
     * @author: xjy
     * @param:
     * @return: void
     * @exception:
     * @date: 2021/7/31 15:11
     */
    public void testBatchInsertJdbc() {
        SqlSession sqlsession = null;
        try {
            sqlsession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
            PuppeteerCreateInfoMapper mapper = sqlsession.getMapper(PuppeteerCreateInfoMapper.class);
            for (int i = 0; i < 10000; i++) {
                PuppeteerCreateInfo info = new PuppeteerCreateInfo();
                info.setUrl("www.baidu.com");
                info.setOssUrl("www.baidu.com");
                info.setType("1");
                info.setStatus("1");
                info.setCreateTime(LocalDateTime.now());
                info.setUpdateTime(LocalDateTime.now());
                info.setPuppeteerId("121");
                info.setDelFlag("1");
                info.setMessage("123456");
                info.setRemark("23456");
                info.setMd5("123456");
                mapper.insert(info);
            }
            long begin = System.currentTimeMillis();
            sqlsession.commit();
            sqlsession.clearCache();
            sqlsession.close();
            long tt = System.currentTimeMillis() - begin;
            System.out.println("SqlSession方式用时" + tt + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlsession != null) {
                sqlsession.clearCache();
                sqlsession.close();
            }
        }
    }
}