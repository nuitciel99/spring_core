package kr.co.jykjy.aop7;

import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jykjy.mart.adv.BeforeAdv;

public class App {
	public static void main(String[] args) {
		// pc : pointcut
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop7.xml");
		First first = ctx.getBean("first", First.class);
		first.one();
		first.two();
		
		Second second = ctx.getBean("second", Second.class);
		second.one();
		second.two();
	}
}
