package com.kakao.work;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.kakao.work.entity.SupReg;
import com.kakao.work.repository.SupRegRepository;

@RunWith(MockitoJUnitRunner.class)
public class repositoryTest {
	/**
	 * H2 DB를 사용하기 때문에 repositoryTest는 불가
	 **/
	@Mock
	private SupRegRepository supRegRepository;
	
	
	@Test
	public void SupRegEntity_save_test() {
				
		final SupReg rSupRegEntity = supRegRepository.findByReg("reg1");
		
		assertThat(rSupRegEntity.getId(), is(notNullValue()));
	    
	  
	}


}
