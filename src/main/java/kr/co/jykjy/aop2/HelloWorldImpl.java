package kr.co.jykjy.aop2;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요 " + msg);
	}

}
