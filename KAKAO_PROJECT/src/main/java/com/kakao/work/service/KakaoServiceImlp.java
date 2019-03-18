package com.kakao.work.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.work.entity.SupReg;
import com.kakao.work.entity.SupRegEntity;
import com.kakao.work.entity.tempEntity;
import com.kakao.work.repository.SupRegEntityRepository;
import com.kakao.work.repository.SupRegRepository;

@Service("KakaoService")
public class KakaoServiceImlp implements KakaoService{
	
	@Autowired
    private SupRegRepository supRegRepository;
	
	@Autowired
    private SupRegEntityRepository supRegEntityRepository;
	
	public @ResponseBody List<tempEntity> insert() {

		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
		int flag = 0;
		List<tempEntity> list = new ArrayList<tempEntity>();
		BufferedReader br = null;
		
		try{
            br = Files.newBufferedReader(Paths.get("C:\\Users\\Kang Woo Suk\\Desktop\\kakao_sample1.csv"));
            Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
            	if(flag > 0) {
            		SupReg supReg = new SupReg();
            		SupRegEntity sre = new SupRegEntity();
            		tempEntity tmp = new tempEntity();
            		
                    //쌍따옴표 제거는 쿼리에서 정규식으로
                    String array[] = line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*(?![^\\\"]*\\\"))");
                    
                    supReg.setReg(   "reg" + array[0]);
                    supReg.setTarget(        array[2]);
                    supReg.setUsage(         array[3]);
                    supReg.setLim(           array[4]);
                    supReg.setRate(          array[5]);
                    supReg.setInstitute(     array[6]);
                    supReg.setMgmt(          array[7]);
                    supReg.setReception(     array[8]);
                    supReg.setFst_crt_dtti(new Date());
                    supReg.setLt_ch_dtti(  new Date());
                    
                    sre.setReg_c(    "reg" + array[0]);
                    sre.setRegion(           array[1]);
                    
                    supRegRepository.save(supReg);
                    supRegEntityRepository.save(sre);
                    
                    tmp.setRegion(   array[1]);
                    tmp.setTarget(   array[2]);
                    tmp.setUsage(    array[3]);
                    tmp.setLimit(    array[4]);
                    tmp.setRate(     array[5]);
                    tmp.setInstitute(array[6]);
                    tmp.setMgmt(     array[7]);
                    tmp.setReception(array[8]);
                    
                    list.add(tmp);
            	}
            	flag++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        } 

		return list;
	}

	public @ResponseBody tempEntity search(String region) {
		
		SupReg supReg = new SupReg();
		SupRegEntity supRegEntity = new SupRegEntity();
		tempEntity tmp = new tempEntity();
		
		supRegEntity = supRegEntityRepository.findByRegion(region);
		supReg = supRegRepository.findByReg(supRegEntity.getReg_c());
		
		tmp.setRegion(supRegEntity.getRegion());
		tmp.setTarget(supReg.getTarget());
		tmp.setUsage(supReg.getUsage());
		tmp.setLimit(supReg.getLim());
		tmp.setRate(supReg.getRate());
		tmp.setInstitute(supReg.getInstitute());
		tmp.setMgmt(supReg.getMgmt());
		tmp.setReception(supReg.getReception());
		
		System.out.println(tmp);
		
		return tmp;
	}
}
