package com.xjy.study.myjpas.service;

import com.github.pagehelper.PageInfo;
import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 项目详情表 服务类
 * </p>
 *
 * @author author
 * @since 2021-08-08
 */
public interface IXhhProjectService extends IService<XhhProject> {
    /**
     * PageHelper方式分页：嵌套select
     *
     * @author: xjy
     * @param: page
     * @param: num
     * @param: userId
     * @return: com.github.pagehelper.PageInfo<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 10:41
     */
    PageInfo<XhhProjectContainsAddressDto> getPage2(int page, int num, String userId);

    /**
     * PageHelper方式分页：嵌套resultMap
     *
     * @author: xjy
     * @param: page
     * @param: num
     * @param: userId
     * @return: com.github.pagehelper.PageInfo<com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto>
     * @exception:
     * @date: 2021/8/9 10:41
     */
    PageInfo<XhhProjectContainsAddressDto> getPage3(int page, int num, String userId);
}
