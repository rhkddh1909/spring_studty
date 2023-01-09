## SpringFramework 소개

- 가장 많이 사용하는 java 기반 으용 프로그램
- 모든 java 애플리케이션 개발에 이용 가능

## SpringFramework의 특징

- 경량의 컨테이너
- POJO 방식의 프레임 워크
- IoC 지원
- DI 지원
- AOP 지원
- iBATIS, myBATIS, Hibernate 등의 데이터베이스 라이브러리 지원
- 스프링 장점 및 단점
    - java파일에서 java코드를 줄일 수 있다
    - 반복되는 작업을 줄일 수 있어 기능 개발에 집중 가능
    - 프로젝트 관리 용이
    - 다수의 개발자와 동시에 프로젝트 하기가 용이
    - 처음 프로젝트 셋팅이 다소 복잡
    - 개념을 제대로 숙지하지 못하면 코드 분석 조차 힘듦

## SpringFramework 주요 프로그램 설치

- JDK, java8이상 권장 → Oracle
    - 다운로드 후 압추 풀기
    - 내pc 우클릭 설정 → 고급설정 → 환경 변수 설정
    - 시스템 변수 → 새로만들기 → JAVA_HOME → jdk 선택
    - path → 새로만들기 → jdk의 bin 폴더
- Eclipse(IntelliJ)

## SpringFramework 개발 환경 구축

- 작업 폴더 생성 및 개발 툴 실행(한글 경로 x)
- 폰트 설정(eclipse)
    - 윈도우→preferences→appearance→colors and fonts → basic → text font
- 인코딩 설정(eclipse)
    - General → workspace → text file encoding → other → UTF-8(실행환경을 가리지 않고 잘나옴)

## 자바 프로젝트 생성

- 파일 → 새 프로젝트
- 자바 프로젝트의 문제점
  - 기존에 사용하던 클래스를 다른 사용법으로 사용하려면 해당 클래스가 사용된 모든 파일을 수정하여야 함

## 다형성

- 자바에서 모든 객체는 부모 클래스형 참조변수나 구현한 인터페이스 변수에 담을 수 있다.
- 참조벼수를 통해 메서드를 호출하면 오버라이딩된 메서드가 호출된다
- 다형성의 문제점
  - 객체를 생성하는 코드는 변경이 되어야 한다.
  - 문제점을 해결하기위해 스프링 프레임워크를 활용

## 스프링 프레임 워크 사용

- 자바 코드 작성 부분을 줄일 수 있는 효과
- 초기 프로젝트 셋팅이 다소 복잡하므로 충분한 연습 필요
- 스프링 프레임 워크 사용은 xml을 이용하는 방법과 자바 어노테이션을 이용하는 방법 두가지로 구분
- Maven
  - 자바 프로젝트의 빌드를 자동으로 해주는 도구
  - 개발자가 xml에 작성한 프로젝트 정보를 토대로 컴파일하고 라이브러리를 연력하는 등의 작업 수행
  - Maven 서버를 통해 라이브러리를 다운받아 설정하는 작업 수행
  - maven project 생성
  - [spring.is](http://spring.is) → projects → learn → 버전 확인
  - maven resourcies → 의존성 복사 → pom.xml에 의존성 추가
  - beans.xml과 같이 xml파일들은 resource 폴더 내에 있어야함
  - class를 beans.xml파일에  <bean>tag 를 활용하여 등록하여

