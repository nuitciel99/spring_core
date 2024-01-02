package kr.co.jykjy.aop1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelloWorldHandler implements InvocationHandler{
	
	private Object target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// 추가 작업 1은 HelloWorldImpl에서만 동작
		if(target.getClass() == HelloWorldImpl.class){
			
			System.out.println("추가 작업1");
		}
		
		Object obj = method.invoke(target, args);
		
		System.out.println("추가 작업2");
		return obj;
	}

}
