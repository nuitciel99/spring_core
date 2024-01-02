package kr.co.jykjy.aop7;

import org.springframework.stereotype.Service;

@Service
public class Second {
	public void one(){
		System.out.println("Second.one()");
	}
	public void two(){
		System.out.println("Second.two()");
	}
}
