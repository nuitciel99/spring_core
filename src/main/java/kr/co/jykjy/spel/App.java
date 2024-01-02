package kr.co.jykjy.spel;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Setter
public class App {
	private Person person;
	
	private String name;
	private int age;
	
	// 자료구조 지정
	private List<Integer> list;
	private Set<Person> set;
	private Map<String, Object> map;
	private String[] strs;
	private Properties props;
	
	public static void main(String[] args) {
		String str = "abcd";
//		String s = new 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spel.xml");
		App app = ctx.getBean("app", App.class);
		log.info("{}", app);
		log.info("{}", ctx.getBean("name"));
	}
}
