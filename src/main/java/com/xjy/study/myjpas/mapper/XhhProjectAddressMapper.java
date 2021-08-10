package com.xjy.study.myjpas.mapper;

import com.xjy.study.myjpas.dto.XhhProjectAddressContainsProjectDto;
import com.xjy.study.myjpas.entity.mybatis.XhhProjectAddress;
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
public interface XhhProjectAddressMapper extends BaseMapper<XhhProjectAddress> {
    List<XhhProjectAddressContainsProjectDto> selectByAddressId(String addressId);

    List<XhhProjectAddressContainsProjectDto> selectByAddressId2(String addressId);
}
