package kr.co.jykjy.mart4;

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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mart4.xml");
		
		
		System.out.println("============================= proxy");
		
		MartInter proxy = ctx.getBean("mart", MartInter.class);
		proxy.getProduct("전자제품");
		proxy.getProduct2("식품");
		proxy.getProduct3("가구");
		
		
	}
}
