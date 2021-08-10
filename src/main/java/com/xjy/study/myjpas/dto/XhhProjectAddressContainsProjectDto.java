package com.xjy.study.myjpas.dto;

import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import com.xjy.study.myjpas.entity.mybatis.XhhProjectAddress;
import lombok.Data;

@Data
public class XhhProjectAddressContainsProjectDto extends XhhProjectAddress {
    private XhhProject xhhProject;
}
