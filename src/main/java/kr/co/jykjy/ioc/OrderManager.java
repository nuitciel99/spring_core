package kr.co.jykjy.ioc;

import lombok.Setter;

@Setter
public class OrderManager {
	
	// OrderManager, HyundaiMaker는 정적 결합 
	// 결합도 낮추기 1단계 : 구현을 인터페이스 뒤로 숨기기 
	private CarMaker maker;
	private Money money;
	
	public void order(){
		
		maker.sell(money);
	}
}
