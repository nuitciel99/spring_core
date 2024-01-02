package kr.co.jykjy.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jykjy.constructor.Develope;

public class App {
	public static void main(String[] args) {
		
		// xml 기반 setter
		ApplicationContext ctx = new ClassPathXmlApplicationContext("magic.xml");
		Magician magician = ctx.getBean("magician", Magician.class);
		magician.magic();
		
		
	}
}
