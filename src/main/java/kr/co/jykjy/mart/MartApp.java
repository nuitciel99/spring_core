package kr.co.jykjy.mart;

import org.springframework.aop.framework.ProxyFactory;

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
		pf.addAdvice(new AroundAdv());
		pf.addAdvice(new BeforeAdv());
		pf.addAdvice(new AfterAdv());
		pf.addAdvice(new ThrowAdv());
		
		MartInter proxy = (MartInter) pf.getProxy();
//		proxy.getProduct("전자제품");
		proxy.getProduct("예외");
		
	}
}
