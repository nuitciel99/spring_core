package kr.co.jykjy.mart2;

import java.lang.reflect.Method;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import kr.co.jykjy.mart.adv.AfterAdv;
import kr.co.jykjy.mart.adv.AroundAdv;
import kr.co.jykjy.mart.adv.BeforeAdv;
import kr.co.jykjy.mart.adv.ThrowAdv;

public class MartApp {
	public static void main(String[] args) {
		
		
		MartInter mart = new Mart();
		mart.getProduct("생필품");
		
//		System.out.println("=============================");
//		
//		mart.getProduct("예외");
		
		System.out.println("============================= proxy");
		
		// before, around, after return, after, throw
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(mart);
		
//		pf.addAdvice(new BeforeAdv());
		// advice 대신 advisor를 적용 pc의 조건, getProduct2에만 적용
		// pointcut 추가 
		
		pf.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return method.getName().endsWith("2");
			}
		}, new BeforeAdv()));
		
		MartInter proxy = (MartInter) pf.getProxy();
		proxy.getProduct("전자제품");
		proxy.getProduct2("식품");
		proxy.getProduct3("가구");
		
		// pointcut 구현 클래스 aspectJ expression 사용에는 라이브러리 
		// aspectjrt.jar aspectjweaver.jar 
		
	}
}
