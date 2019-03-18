package com.kakao.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakao.work.entity.SupReg;
import com.kakao.work.entity.SupRegEntity;

public interface SupRegRepository extends JpaRepository<SupReg, Long> {
	/**
	 *SupReg 테이블 저장을 위한 리파지토리
	 **/
	public SupReg findByReg(String reg);
}

