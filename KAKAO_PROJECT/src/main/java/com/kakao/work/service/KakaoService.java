package com.kakao.work.service;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.work.entity.tempEntity;

public interface KakaoService {
	/**
	 * 서비스 연결을 위한 인터페이스 
	 **/
	
	public @ResponseBody List<tempEntity> insert();
	
	
	public @ResponseBody tempEntity search(String region);
}
