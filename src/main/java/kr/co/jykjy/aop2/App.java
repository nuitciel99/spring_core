package kr.co.jykjy.aop2;

import java.lang.reflect.Proxy;

import org.springframework.aop.framework.ProxyFactory;

public class App {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorldImpl();
		helloWorld.sayHello("AOP");
		
		// 현재코드
		// helloWorld :: target
		
		// 추가 작업
		
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new AroundAdv());
		pf.setTarget(helloWorld);
		
		
		// 프록시 : 기존 객체 + 추가 작업 
		HelloWorld proxy = (HelloWorld) pf.getProxy();
		
		System.out.println("===========================");
		proxy.sayHello("spring AOP");
		
		// AOP spring 2.0 이전 스타일 
		
		// aspectJ 라이브러리 
		
		// 타겟, 프록시, 어드바이스 
		
		// weaving : 프록시를 만드는 과정 
		// AOP 용어
		// 무엇을 : advice
		// 누구 : target
		// 어디 : joinpoint
		// 언제 : pointcut
		
		// AOP는 OOP의 보조도구  
		
		// advice 5가지
		// before, around, after, return, after(finally), throws
		
	}
}
