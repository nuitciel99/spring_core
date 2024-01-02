package kr.co.jykjy.aop4;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimplePc extends StaticMethodMatcherPointcut{
	// First, one 
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		
		return targetClass == First.class && method.getName().equals("one");
	}
	
}
