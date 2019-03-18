package com.kakao.work;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import com.kakao.work.entity.tempEntity;
import com.kakao.work.repository.SupRegEntityRepository;
import com.kakao.work.service.KakaoService;

@RunWith(SpringRunner.class)
@RestClientTest(KakaoService.class)
public class ServiceTest {

	
	@Mock
	private SupRegEntityRepository supRegEntityRepository;
	
	@Autowired
	private KakaoService kakaoService;
	
	@Autowired
	private MockRestServiceServer server;
	
	@Test
	public void rest_test() {
		server.expect(requestTo("/search?region=강릉시"))
        .andRespond(
                withSuccess(new ClassPathResource("/search.json", getClass()), MediaType.APPLICATION_JSON));
		
		tempEntity tmp = kakaoService.search("강릉시");

		assertThat(tmp.getTarget(), is("강릉시 소재 중소기업으로서 강릉시장이 추천한 자"));
		
	}
}
