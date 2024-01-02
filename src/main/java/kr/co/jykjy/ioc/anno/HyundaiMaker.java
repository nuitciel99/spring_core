package kr.co.jykjy.ioc.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Service
public class HyundaiMaker implements CarMaker{
	@Autowired
	private Car car;
	public Car sell(Money money){
//		System.out.println("차량 판매");
//		System.out.println(car.getName() + "차량을 " + money.getAmount() + "에 판매");
//		log.info(car);
		log.info("차량 판매");
		log.info("{} 차량을 {}에 판매", car.getName(), money.getAmount());
		return car;
	}
}
