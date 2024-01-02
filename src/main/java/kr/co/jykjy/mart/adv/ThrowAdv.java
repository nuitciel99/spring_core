package kr.co.jykjy.mart.adv;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdv implements ThrowsAdvice{
	public void afterThrowing(Throwable throwable){
		System.out.println("예외 발생");
	}
}
