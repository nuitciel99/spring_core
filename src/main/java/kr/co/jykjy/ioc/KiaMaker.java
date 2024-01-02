package kr.co.jykjy.ioc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KiaMaker implements CarMaker{
	private Car car = new Car("K5");

	@Override
	public Car sell(Money money) {
		
		log.info("차량 판매");
		log.info("{} 차량을 {}에 판매", car.getName(), money.getAmount());
		return car;
	}

}
