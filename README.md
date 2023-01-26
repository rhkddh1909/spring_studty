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

## IoC 컨테이너

- Inversion of Control : 제어 역전
- 일반적으로 프로그래밍을 작성할 때 프로그램이 흘러가는 흐름이나 생성되는 객체에 대한 제어권을 개발자가 제어권을 가지는 것과 달리 프레임워크가 가지는 것
- 개발자가 코드의 흐름이나 객체 생성에 관련된 코드를 프로그래밍 코드에 직접 작성하는 것이 아닌 프레임워크가 사용하는 파일에 작성하면 이를 토대로 프레임워크가 객체를 생성하여 반환하고 코드가 동작하는 순서를 결정
- MetaData(xml이나 java코드)를 토대로 만들어 놓은 클래스에 객체를 만들어 반환 하는 역할
- BeanFactory(구)
  - 클래스를 통해 객체를 생성하고 이를 전달한다.
  - 상속 등 객체 간의 관계를 형성하고 관리한다.
  - Bean에 관련된 설정을 위한 xml 파일은 즉시 로딩하지만 객체는 개발자가 요구 할 때 생성
  - XmlBeanFactory
- ApplicationContest(신)
  - 클래스를 통해 객체를 생성하고 이를 전달한다.
  - 상속 등 객체 간의 관계를 형성하고 관리한다
  - 국제화 지원 등 문자열에 관련된 다양한 기능을 제공한다.
  - Bean에 관련된 설정을 위한 xml 파일은 즉시 로딩하면서 객체를 미리 생성해서 가지고 있다.
  - ClassPathXmlApplicationContext
  - FileSystemXmlApplicationContext
  - XmlWebApplicationContext

## POJO (자바에서는 bean이라 부른다)

- 오래된 방식의 간단한 [자](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_(%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D_%EC%96%B8%EC%96%B4))바 오브젝트
- 자바 모델이나, 기능 프레임워크 등에 따르지 않고 홀로 독립적이며 단순한 기능만을 가진 객체
- 특정한 환경과 기술에 종속되지 않고 필요에 따라 재사용 가능하다.

  →특정규약에 종속되지 않는다

  →특정환경에 종속되지 않는다

  →객체지향 원리에 충실해야한다.

- 어떠한 프로젝트에 직접적으로 의존하는 순간 pojo라고 할 수 없다. 특정 기술에 종속되기 때문이다.
- 어노테이션이 제거되었을 경우 pojo로 돌아간다면 이를 pojo로 간주함
- 특정 기술과 환경에 종속되어 의존하게 된 자바 코드는 가독성이 떨어져 유지보수에 어려움
- psa를 통해 pojo를 유지한다

```java
public class MyPojo {
    private String name;
    private int age;
    
    public String getName() {
    	return name;
    }
    public String getAge() {
    	return age;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
}
```

1) pojo의 장점

→ 깔끔한 코드

→ 테스트 용이

→ 객체지향 설계 자유롭게 활용

2)pojo프레임워크

→ hibernate pojo프레임워크의 가장 대표적인 예

### **Rich Domain Model**

- POJO의 자바 오브젝트가 가진 기본적인 특징은 하나의 오브젝트 안에 상태(State)와 행위(Behavior)을 모두 가지고 있습니다. 즉, **인스턴스 변수**와 **로직을 가진 메소드**가 있습니다.
- 객체지향 원리에 충실하게 도메인 모델을 만드는 것을 풍성한 도메인 모델(Rich Domain Model)이라고 이야기합니다.

## PSA**(Portable Service Abstraction)**

- 환경의 변화와 관계없이 일관된 방식의 기술로의 접근 환경을 제공하는 추상화 구조(POJO)
- 어노테이션을 활용하여 객체를 POJO기반으로 한번더 추상화
- Spring Web Mvc
  - **@Controller** 어노테이션을 사용하면 **요청을 매핑할 수 있는 컨트롤러 역할을 수행**
  - 서블릿을 Low level 로 개발하지 않고도, Spring Web MVC를 사용하면 이렇게 서블릿을 간편하게 개발
  - HttpServlet을 상속받고 **doGet(), doPost()**를 구현하는 등의 작업을 하지 않아도 됨
- Spring Transaction
  - **@Transactional** 어노테이션을 사용하면 conn.setAutoCommit(false) 이나 conn.commit() 등을 사용하지 않고 트랜잭션 관리가 가능
- Spring Cache
  - JCacheManager, ConcurrentMapCacheManager, EhCacheCacheManager와 같은 여러가지 구현체 사용 가능
  - **@Cacheable** 어노테이션을 붙여줌으로써 구현체를 크게 신경쓰지 않아도 필요에 따라 바꿔 사용 가능

## Bean 생성하기

- Bean은 singleton
- Spring에서는 사용할 Bean 객체를 Bean configurtion file에 정의를 하고 필요할 때 객체를 가져와 사용하는 방벙
- bean 태그 : 사용할 bean을 정의하는 태그
- bean 태그의 기본 속성
  - calss : 객체를 생성하기 위해 사용할 클래스를 지정한다.
  - id : Bean 객체를 가져오기 위해 사용하는 이름
  - lazy-init : 싱글톤인 경우 xml을 로딩할 때 객체 생성 여부를 설정
    - true : xml 로딩 시 객체를 생성하지 않고 객체를 가져올 떄 생성
  - scope : 객체의 범위를 설정
    - singleton : 객체를 하나만 생성해서 사용
    - prototype : 객체를 가져올 때 마다 객체를 생성
- Spring 에서는 프로그램에서 사용할 객체를 bean configuration 파일에 정의하여 사용

## Bean 객체의 생명주기

- Spring의 Bean은 다음과 같은 상황일 때 객체가 생성
  - Singleton인 경우 xml 파일을 로딩 할 때 객체가 생성
  - Singleton이고 lazy-init 속성이 true인 경우 getBean 메서드를 사용할 대 객체가 생성
  - prototype 일 경우 getBean 메서드를 사용할 때 객체 생성
- Spring Bean은 IoC 컨테이너가 종료 될 때 객체가 소멸
- init-method : 생성자 호출 이후 자동 호출
- destroy-method : 객체가 소멸할 때 자동 호출
- default-init-method : init-methdo를 설정하지 않은 경우 자동으로 호출
- default-destroy-method : destroy-method를 설정하지 않은 경우 자동으로 호출
- 메서드가 없을 경우
  - 모든 메서드(init-method, destroy-method, default-init-method , default-destroy-method )에서 각 메서드가 정의 되어 있지 않을때 오류가 발생

## BeanPostProcessor

- bean 객체를 정의할 때 init-method 속성을 설정하면 객체가 생성될 때 자동으로 호출될 메서드를 지정
- 이 때 BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면 Bean 객체를 생성할 때 호출될 init 메서드 호출을 가로채 다른 메서드를 호출할 수 있음
  - postProcessBeforeInitialization → init-method에 지정된 메서드가 호출되기 전에 호출
  - postProcessAfterInitialization → init-method에 지정된 메서드가 호출된 후에 호출
  - init-method 가 지정되어 있지 않더라도 자동으로 호출
- Spring 에서는 객체가 생성될 때 init-method로 지정된 메서드가 호출되기 전, 후에 다른 메서드를 호출할 수 있도록 지원하고 있다.

## 생성자를 통한 주입

- 의존성 주입(Dependency Injection)
  - 의존성 주입은 Spring에서 아주 중요한 개념이자 장점
  - Bean 객체를 생성할 때 Bean 객체가 관리할 값이나 객체를 주입하는 것을 의미
  - Bean 객체를 생성 후 Bean 객체가 가질 기본 값을 자바 코드로 설정하는 것이 아닌 Bean을 정의하는 xml 코드에서 정의하는 개념