package kr.co.jykjy.mart.adv;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdv implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		System.out.println("before advice 실행됨");
	}

}
