package com.kakao.work.service;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.work.entity.tempEntity;

public interface KakaoService {
	
	public @ResponseBody List<tempEntity> insert();
	
	
	public @ResponseBody tempEntity search(String region);
}
