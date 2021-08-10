package com.xjy.study.myjpas.mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 项目详情表 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2021-08-07
 */
@Mapper
public interface XhhProjectMapper extends BaseMapper<XhhProject> {
    /**
     * 普通查询语句
     *
     * @author: xjy
     * @param: userId
     * @return: java.util.List<com.xjy.study.myjpas.entity.mybatis.XhhProject>
     * @exception:
     * @date: 2021/8/9 16:46
     */
    List<XhhProject> selectByUserId(String userId);

    /**
     * <collection>嵌套结果映射
     *
     * @author: xjy
     * @param: userId
     * @return: java.util.List<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 16:43
     */
    List<XhhProjectContainsAddressDto> selectByUserId2(String userId);

    /**
     * <collection>嵌套select
     *
     * @author: xjy
     * @param: userId
     * @return: java.util.List<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 16:43
     */
    List<XhhProjectContainsAddressDto> selectByUserId3(String userId);

    /**
     * 插件自动生成的代码
     *
     * @author: xjy
     * @param: creatorId
     * @return: java.util.List<com.xjy.study.myjpas.entity.mybatis.XhhProject>
     * @exception:
     * @date: 2021/8/9 16:46
     */
    List<XhhProject> selectByCreatorIdLike(@Param("creatorId") String creatorId);

    /**
     * <collection>嵌套结果映射-分页
     *
     * @author: xjy
     * @param: page
     * @param: userId
     * @return: com.baomidou.mybatisplus.core.metadata.IPage<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 16:44
     */
    IPage<XhhProjectContainsAddressDto> selectByUserId2(IPage<XhhProjectContainsAddressDto> page, String userId);

    /**
     * <collection>嵌套select-分页
     *
     * @author: xjy
     * @param: page
     * @param: userId
     * @return: com.baomidou.mybatisplus.core.metadata.IPage<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 16:44
     */
    IPage<XhhProjectContainsAddressDto> selectByUserId3(IPage<XhhProjectContainsAddressDto> page, String userId);
}
