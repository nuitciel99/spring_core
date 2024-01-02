package kr.co.jykjy.aop2;

public class HelloWorldImpl2 implements HelloWorld{

	@Override
	public void sayHello(String msg) {
		System.out.println("Hello " + msg);
	}

}
