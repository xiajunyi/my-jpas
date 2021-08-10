package com.xjy.study.myjpas.dao;

import com.xjy.study.myjpas.dto.XhhProjectContainsAddressDto;
import com.xjy.study.myjpas.entity.hibernate.XhhProjectEntity;
import com.xjy.study.myjpas.entity.mybatis.XhhProject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface XhhProjectRepository extends Repository<XhhProjectEntity, Long> {
    List<XhhProjectEntity> findByUserId(Long userId);

    @Query(value = "select a.*, b.project_id, b.id as address_id, b.address as address from xhh_project a left join xhh_project_address b on a.id = b.project_id where a.user_id = :userId", nativeQuery = true)
    List<XhhProjectContainsAddressDto> findContainsAddressByUserNative(String userId);
}
