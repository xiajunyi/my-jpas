package com.xjy.study.myjpas.mapper;

import com.xjy.study.myjpas.entity.mybatis.PuppeteerCreateInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2021-08-09
 */
@Mapper
public interface PuppeteerCreateInfoMapper extends BaseMapper<PuppeteerCreateInfo> {
    @Insert({
            "<script>",
            "insert into puppeteer_create_info(puppeteer_id, url, oss_url, type, status, create_time, update_time, del_flag, message, remark, md5, retry, full_url) values ",
            "<foreach collection='list' item='item' index='index' separator=','>",
            "(#{item.puppeteerId}, #{item.url}, #{item.ossUrl}, #{item.type}, #{item.status}, #{item.createTime}, #{item.updateTime}, #{item.delFlag}, #{item.message}, #{item.remark},  #{item.md5}, #{item.retry}, #{item.fullUrl})",
            "</foreach>",
            "</script>"
    })
    int myInsertBatch(@Param(value = "list") List<PuppeteerCreateInfo> list);
}
