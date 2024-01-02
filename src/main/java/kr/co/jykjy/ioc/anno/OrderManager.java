package kr.co.jykjy.ioc.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Setter
@Service
public class OrderManager {
	// s가 붙음 빈 
	// OrderManager, HyundaiMaker는 정적 결합 
	// 결합도 낮추기 1단계 : 구현을 인터페이스 뒤로 숨기기 
	@Autowired
	private CarMaker maker;
	@Autowired
	private Money money;
	
	public void order(){
		
		maker.sell(money);
	}
}
