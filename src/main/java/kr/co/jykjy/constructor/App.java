package kr.co.jykjy.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cons.xml");
		ctx.getBean("develope", Develope.class).work();
	}
}
