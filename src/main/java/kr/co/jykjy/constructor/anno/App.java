package kr.co.jykjy.constructor.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cons2.xml");
		ctx.getBean("develope", Develope.class).work();
	}
}
