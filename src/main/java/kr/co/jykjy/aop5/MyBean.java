package kr.co.jykjy.aop5;

import lombok.Setter;

@Setter
public class MyBean {
	private MyDependency myDependency;
	
	public void run(){
		myDependency.hello();
		myDependency.bye();
	}
}
