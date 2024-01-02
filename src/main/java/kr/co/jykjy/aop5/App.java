package kr.co.jykjy.aop5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop5.xml");
		
		MyBean bean = ctx.getBean("myBean", MyBean.class);
		bean.run();
		
		// advice만 적용 
		MyBean bean1 = ctx.getBean("bean1", MyBean.class);
		bean1.run();
		
		// advisor 적용 
		MyBean bean2 = ctx.getBean("bean2", MyBean.class);
		bean2.run();
	}
}
