package kr.co.jykjy.aop7;

import org.springframework.stereotype.Component;

@Component
public class First {
	public void one(){
		System.out.println("First.one()");
	}
	public void two(){
		System.out.println("First.two()");
	}
}
