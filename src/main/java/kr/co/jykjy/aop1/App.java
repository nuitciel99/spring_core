package kr.co.jykjy.aop1;

import java.lang.reflect.Proxy;

public class App {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorldImpl();
		helloWorld.sayHello("AOP");
		
		// 현재코드
		// helloWorld :: target
		
		// 추가 작업
		
		
		
		// 프록시 : 기존 객체 + 추가 작업 
		
		HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(
				HelloWorld.class.getClassLoader(), 
				new Class[] {HelloWorld.class}, 
				new HelloWorldHandler(helloWorld)
				);
		System.out.println("===========================");
		
		proxy.sayHello("PROXY AOP");
		
		System.out.println(helloWorld);
		// 같은거 처럼 
		System.out.println(proxy == helloWorld);
		
		System.out.println("===========================");
		proxy = (HelloWorld) Proxy.newProxyInstance(
				HelloWorld.class.getClassLoader(), 
				new Class[] {HelloWorld.class}, 
				new HelloWorldHandler(new HelloWorldImpl2())
				);
		
		proxy.sayHello("PROXY2 AOP");
	}
}
