package kr.co.jykjy.aop3;

import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import kr.co.jykjy.mart.adv.BeforeAdv;

public class App {
	public static void main(String[] args) {
		// pc : pointcut
		
		First first = new First();
		Second second = new Second();
		BeforeAdv adv = new BeforeAdv();
		
		ProxyFactory pf = null;
		
		pf = new ProxyFactory();
		pf.setTarget(first);
		pf.addAdvice(adv);
		
		First firstP1 = (First)pf.getProxy();
		
		pf = new ProxyFactory();
		pf.setTarget(second);
		pf.addAdvice(adv);
		
		Second secondP1 = (Second) pf.getProxy();
		
		firstP1.one();
		firstP1.two();
		secondP1.one();
		secondP1.two();
		System.out.println("===================================");
		
		Pointcut pointcut = new SimplePc();
		Advisor advisor = new DefaultPointcutAdvisor(pointcut, adv);
		
		pf = new ProxyFactory();
		pf.setTarget(first);
		pf.addAdvice(adv);
		pf.addAdvisor(advisor);
		First firstP2 = (First)pf.getProxy();
		
		pf = new ProxyFactory();
		pf.setTarget(second);
		pf.addAdvice(adv);
		pf.addAdvisor(advisor);
		Second secondP2 = (Second) pf.getProxy();
		
		firstP2.one();
		firstP2.two();
		secondP2.one();
		secondP2.two();
	}
}
