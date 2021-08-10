package com.xjy.study.myjpas.service.impl;

import com.xjy.study.myjpas.entity.mybatis.PuppeteerCreateInfo;
import com.xjy.study.myjpas.mapper.PuppeteerCreateInfoMapper;
import com.xjy.study.myjpas.service.IPuppeteerCreateInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2021-08-09
 */
@Service
public class PuppeteerCreateInfoServiceImpl extends ServiceImpl<PuppeteerCreateInfoMapper, PuppeteerCreateInfo> implements IPuppeteerCreateInfoService {

    @Override
    public void myInsertBatch(List<PuppeteerCreateInfo> list) {
        this.baseMapper.myInsertBatch(list);
    }
}
