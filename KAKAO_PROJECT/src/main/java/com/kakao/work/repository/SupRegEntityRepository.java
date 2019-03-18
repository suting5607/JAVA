package com.kakao.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakao.work.entity.SupRegEntity;


public interface SupRegEntityRepository extends JpaRepository<SupRegEntity, Long> {
	
	public SupRegEntity findByRegion(String region);

}
