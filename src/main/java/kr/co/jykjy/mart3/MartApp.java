package kr.co.jykjy.mart3;

import java.lang.reflect.Method;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jykjy.mart.adv.AfterAdv;
import kr.co.jykjy.mart.adv.AroundAdv;
import kr.co.jykjy.mart.adv.BeforeAdv;
import kr.co.jykjy.mart.adv.ThrowAdv;

public class MartApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mart3.xml");
		
		MartInter mart = ctx.getBean("mart", Mart.class);
		mart.getProduct("생필품");
		
//		System.out.println("=============================");
//		
//		mart.getProduct("예외");
		
		System.out.println("============================= proxy");
		
		MartInter proxy = ctx.getBean("proxy", MartInter.class);
		proxy.getProduct("전자제품");
		proxy.getProduct2("식품");
		proxy.getProduct3("가구");
		
		System.out.println("============================= proxy");
		
		MartInter proxy2 = ctx.getBean("proxy2", MartInter.class);
		proxy2.getProduct("전자제품");
		proxy2.getProduct2("식품");
		proxy2.getProduct3("가구");
		
		// before, around, after return, after, throw
		
//		ProxyFactory pf = new ProxyFactory();
//		pf.setTarget(mart);
//		
////		pf.addAdvice(new BeforeAdv());
//		// advice 대신 advisor를 적용 pc의 조건, getProduct2에만 적용
//		// pointcut 추가 
//		
//		pf.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {
//			@Override
//			public boolean matches(Method method, Class<?> targetClass) {
//				return method.getName().endsWith("getProduct2");
//			}
//		}, new BeforeAdv()));
//		
//		MartInter proxy = (MartInter) pf.getProxy();
//		proxy.getProduct("전자제품");
//		proxy.getProduct2("식품");
//		proxy.getProduct3("가구");
		
		// pointcut 구현 클래스 aspectJ expression 사용에는 라이브러리 
		// aspectjrt.jar aspectjweaver.jar 
		
	}
}
