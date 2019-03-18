package com.kakao.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name="SupRegEntity")
public class SupRegEntity {
	/**
	 *지자체명, 지자체 코드
	 **/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private @NonNull Integer id;  //id 
	
	@Column(name="reg_c", nullable=true)
	private String reg_c;     //지자체코드

	@Column(name="region", nullable=true)
	private String region;     //지자체명

	public SupRegEntity() {
		
	}
	public SupRegEntity(String reg_c, String region) {
		this();
		this.reg_c = reg_c;
		this.region = region;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReg_c() {
		return reg_c;
	}

	public void setReg_c(String reg_c) {
		this.reg_c = reg_c;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
