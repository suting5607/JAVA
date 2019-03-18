package com.kakao.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kakao.work.entity.tempEntity;
import com.kakao.work.service.KakaoService;

@RestController
public class KakaoController {

	@Autowired
	private KakaoService kakaoService;

	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, Kakao!";
	}
	
	
	//조회
	@GetMapping("search")
	public @ResponseBody tempEntity get(@RequestParam("region") String region) {
		
		System.out.println(region);
		
		tempEntity tmp = kakaoService.search(region);
		
		return tmp;
	}
	
	//입력
	@GetMapping("/insert")
	public @ResponseBody List<tempEntity> insert() {
		
		List<tempEntity> list = kakaoService.insert();
		
		return list;
	}
}

