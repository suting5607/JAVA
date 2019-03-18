package com.kakao.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakao.work.entity.SupReg;
import com.kakao.work.entity.SupRegEntity;

public interface SupRegRepository extends JpaRepository<SupReg, Long> {
	
	public SupReg findByReg(String reg);
}

