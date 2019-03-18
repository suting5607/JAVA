package com.kakao.work.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;


@Entity
@Table(name="SupReg")
public class SupReg {
	/**
	 *ID, 지자체 코드, 지원대상, 용도, 지원한도, 이차보전, 추천기관, 관리점, 취급점, 생성일자, 수정일자 
	 *엔티티
	 **/
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private @NonNull Integer id;  //id
	
	@Column(name="reg", nullable=true)
	private String reg;     //지자체코드
	
	@Column(name="target", nullable=true)
	private String target;     //지원대상
	
	@Column(name="usage", nullable=true)
	private String usage;      //용도
	
	@Column(name="lim", nullable=true)
	private String lim;      //지원한도
	
	@Column(name="rate", nullable=true)
	private String rate;       //이차보전

	@Column(name="institute", nullable=true)
	private String institute;  //추천기관
	
	@Column(name="mgmt", nullable=true)
	private String mgmt;       //관리점
	
	@Column(name="reception", nullable=true)
	private String reception;  //취급점
	
	@Column(name="fst_crt_dtti", nullable=true)
	private Date fst_crt_dtti;  //취급점
	
	@Column(name="lt_ch_dtti", nullable=true)
	private Date lt_ch_dtti;  //취급점
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getLim() {
		return lim;
	}

	public void setLim(String lim) {
		this.lim = lim;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getMgmt() {
		return mgmt;
	}

	public void setMgmt(String mgmt) {
		this.mgmt = mgmt;
	}

	public String getReception() {
		return reception;
	}

	public void setReception(String reception) {
		this.reception = reception;
	}

	public Date getFst_crt_dtti() {
		return fst_crt_dtti;
	}

	public void setFst_crt_dtti(Date fst_crt_dtti) {
		this.fst_crt_dtti = fst_crt_dtti;
	}

	public Date getLt_ch_dtti() {
		return lt_ch_dtti;
	}

	public void setLt_ch_dtti(Date lt_ch_dtti) {
		this.lt_ch_dtti = lt_ch_dtti;
	}
	public SupReg() {
		
	}
	
	public SupReg(String reg) {
		this();
		this.reg = reg;
	}
	
	public SupReg(SupReg supReg) {
		this();
		this.reg       = supReg.getReg();
		this.target    = supReg.getTarget();
		this.usage     = supReg.getUsage();
		this.lim       = supReg.getLim();
		this.rate      = supReg.getRate();
		this.institute = supReg.getInstitute();
		this.mgmt      = supReg.getMgmt();
		this.reception = supReg.getReception();
	}

	public SupReg(String reg, String region, String target, String usage, String lim, String rate, String institute,
			String mgmt, String reception) {
		this();
		this.reg = reg;
		this.target = target;
		this.usage = usage;
		this.lim = lim;
		this.rate = rate;
		this.institute = institute;
		this.mgmt = mgmt;
		this.reception = reception;
	}
}
