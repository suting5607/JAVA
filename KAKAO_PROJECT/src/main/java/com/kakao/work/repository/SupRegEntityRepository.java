package com.kakao.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakao.work.entity.SupRegEntity;


public interface SupRegEntityRepository extends JpaRepository<SupRegEntity, Long> {
	/**
	 *SupRegEntity 테이블 저장을 위한 리파지토리
	 **/
	public SupRegEntity findByRegion(String region);

}
