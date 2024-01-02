package kr.co.jykjy.aop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdv implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("추가 작업1");
		Object obj = invocation.proceed();
		
		System.out.println("추가 작업2");
		
		return obj;
	}
	
}
