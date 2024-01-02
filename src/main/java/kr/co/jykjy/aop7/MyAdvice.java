package kr.co.jykjy.aop7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	@Pointcut("execution(* one(..))")
	public void mypc(){}
	
	@Before("execution(* First.*(..)) && mypc()")
//	@After("mypc()")
	public void simpleBeforeAdv(JoinPoint joinPoint){
		System.out.println("before adv 실행");
	}
	
	public Object simpleAroundAdv(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("around's before");
		Object o = pjp.proceed();
		
		System.out.println("around's after");
		
		return o;
	}
	
	@After("mypc()")
	public void simpleAfter(JoinPoint jp){
		System.out.println("after 실행");
	}
}
