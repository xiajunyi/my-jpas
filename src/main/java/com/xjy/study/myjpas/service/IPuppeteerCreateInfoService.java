package com.xjy.study.myjpas.service;

import com.xjy.study.myjpas.entity.mybatis.PuppeteerCreateInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2021-08-09
 */
public interface IPuppeteerCreateInfoService extends IService<PuppeteerCreateInfo> {
    void myInsertBatch (List<PuppeteerCreateInfo> list);
}
