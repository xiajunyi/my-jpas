package com.xjy.study.myjpas.dto;

import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import com.xjy.study.myjpas.entity.mybatis.XhhProjectAddress;
import lombok.Data;

import java.util.List;

@Data
public class XhhProjectContainsAddressDto extends XhhProject {
    private List<XhhProjectAddress> xhhProjectAddressList;
}
