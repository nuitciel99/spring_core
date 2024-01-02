package kr.co.jykjy.ioc.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
	public static void main(String[] args) {
		// 차량 판매 
		// 금액, 차량, 판매 로직 : 실제 차량 브랜드, 주문 
		
//		OrderManager manager = new OrderManager();
//		manager.order();
		
		// DL : dependency lookup
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc2.xml");
		OrderManager manager = ctx.getBean("orderManager", OrderManager.class);
		manager.order();
		
//		Money money = ctx.getBean("money1", Money.class);
//		log.info("{}", money.getAmount());
//		log.info("{}", money);
//		
//		// bean 모두 싱글톤 : 주소가 값음 : 따라서 xml에 scope가 없으면 true
//		Money money2 = ctx.getBean("money1", Money.class);
//		log.info("{}", money == money2);
	}
}
