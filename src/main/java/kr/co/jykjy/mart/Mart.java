package kr.co.jykjy.mart;

public class Mart implements MartInter{

	@Override
	public void getProduct(String name){
		System.out.println("getProduct() " + name);
		if(name.equals("예외")){
			throw new RuntimeException(name);
		}
	}
	
}
