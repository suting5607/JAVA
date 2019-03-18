# Getting Started

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### 개발 프레임워크
* spring-boot, maven, JPA, H2 

### 빌드 및 실행 방법

* TestApplication.java 파일 마우스 오른쪽 -> Run As -> String Boot App 클릭

* 브라우져에서 http://localhost:8080 접속 확인 (INDEX 화면 확인)
* http://localhost:8080/hello 접속하여 컨트롤러 @RequestMapping 정상 작동 확인
* 파일은 로컬 바탕화면 경로에 하드코딩으로 두어서 구현(바탕화면 kakao_sample1.csv 파일)
* http://localhost:8080/insert 접속하여 csv파일 H2 DB에 적재 처리 및 json응답 확인
* http://localhost:8080/console/ 접속
    Saved Settings: Generic H2 (Embedded) 
    Setting Name: Generic H2 (Embedded)
    Driver Class: org.h2.Driver
    JDBC URL: jdbc:h2:mem:testdb
    User Name: sa
    Password: 
    
 * 생성된 SupReg, SpuRegEntity 테이블 확인 및 쿼리 수행
	SELECT * 
	  FROM  SUP_REG_ENTITY  A
          , SUP_REG B
     WHERE A.REG_c = B.REG

 
 * DB적재 확인 후, 조회 수행
 * http://localhost:8080/search?region=강릉시
 * json리턴된 정보 확인