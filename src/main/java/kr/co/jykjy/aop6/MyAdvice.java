package kr.co.jykjy.aop6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void simpleBeforeAdv(JoinPoint joinPoint){
		System.out.println("before adv 실행");
	}
	
	public Object simpleAroundAdv(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("around's before");
		Object o = pjp.proceed();
		
		System.out.println("around's after");
		
		return o;
	}
}
