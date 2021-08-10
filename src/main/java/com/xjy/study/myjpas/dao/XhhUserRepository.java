package com.xjy.study.myjpas.dao;

import com.xjy.study.myjpas.entity.hibernate.XhhUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface XhhUserRepository extends JpaRepository<XhhUser, Long>, JpaSpecificationExecutor<XhhUser> {

}