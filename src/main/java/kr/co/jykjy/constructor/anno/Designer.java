package kr.co.jykjy.constructor.anno;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Component
public class Designer implements Emp{

	@Override
	public void goToOffice() {
		log.info("디자이너 출근");
	}

	@Override
	public void goOffWork() {
		log.info("디자이너 퇴근");
	}
	
}
