package com.xjy.study.myjpas.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import com.xjy.study.myjpas.mapper.XhhProjectMapper;
import com.xjy.study.myjpas.service.IXhhProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 项目详情表 服务实现类
 * </p>
 *
 * @author author
 * @since 2021-08-08
 */
@Service
public class XhhProjectServiceImpl extends ServiceImpl<XhhProjectMapper, XhhProject> implements IXhhProjectService {
    @Override
    public PageInfo getPage2(int page, int num, String userId) {
        PageHelper.startPage(page,num);
        List<XhhProjectContainsAddressDto> dtoList = this.baseMapper.selectByUserId2(userId);
        return new PageInfo(dtoList);
    }

    @Override
    public PageInfo<XhhProjectContainsAddressDto> getPage3(int page, int num, String userId) {
        PageHelper.startPage(page,num);
        List<XhhProjectContainsAddressDto> dtoList = this.baseMapper.selectByUserId3(userId);
        return new PageInfo(dtoList);
    }
}
