# sec01.ex01
- Servlet생성주기
- web.xml mapping
- Annotation mapping
## destroy() 
```
서블릿이 기능을 수행하고 메모리에서 소멸될 때 호출 
서블릿의 마무리 작업을 주로 수행
```
# sec02.ex01
- JS login
- DB ORACLE Connect

# sec03.ex01
- Statement

# sec03.ex02
- PreparedStatement
# sec03.ex03
- DataSource(JNDI(Java Naming and Directory Interface))
# sec03.ex04
- DataSource 이용해 회원 정보 등록하기
# sec04.ex01
- 바인딩 dispatch
# sec04.ex02
- ServletContext -> method()확인
# sec04.ex03
- ServletContext -> file load
# Popup test
- 쿠키 팝업 테스트
# sec05.ex01
- 세션 만들기
# sec05.ex02
- 세션을 이용한 로그인
#sec05.ex03
- encodeURL 이용한 로그인
# sec06.ex01
- URL 패턴(/URLPattern/first/test)
- URL 패턴(이름만 일치하는 경우 -> /URLPattern/first)
- URL 패턴(이름만 일치하는 경우 -> /URLPattern/first/base.do)
- URL 패턴(이름만 일치하는 경우 -> /URLPattern/first/base)
- URL 패턴(확장자가 일치했을 경우 -> /URLPattern/base.do)
- URL 패턴(확장자가 일치했을 경우 -> /URLPattern/second/base.do)
# sec06.ex02
- Seesion Listener
## init
```
 1. servlet은 모든 브라우저들이 하나의 servlet을 재사용한다.
 2. Seesion을 생성할 때는 브라우저 마다 다르기 때문에 isNew가 반응을한다. 
 3. 바인딩 된 data type중 refernce Type을 가져올 때 refernce Type은 주소를 반환하기 때문에 
 refernce Type 수정 시 바인딩된 refernce Type도 수정이 된다.
 ```
# sec06.ex03
- Binding Listener
# sec07.ex01
- 스크립트 요소 이용해 회원 정보 조회하기
# sec07.ex02
- Filter
