package kr.co.jykjy.mart4;

public class Mart implements MartInter{

	@Override
	public void getProduct(String name){
		System.out.println("getProduct() " + name);
		if(name.equals("예외")){
			throw new RuntimeException(name);
		}
	}

	@Override
	public void getProduct2(String name) {
		System.out.println("getProduct() " + name);
		if(name.equals("예외")){
			throw new RuntimeException(name);
		}
	}

	@Override
	public void getProduct3(String name) {
		System.out.println("getProduct() " + name);
		if(name.equals("예외")){
			throw new RuntimeException(name);
		}
	}
	
}
