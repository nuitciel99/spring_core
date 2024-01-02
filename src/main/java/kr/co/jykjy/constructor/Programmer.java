package kr.co.jykjy.constructor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Programmer implements Emp{

	@Override
	public void goToOffice() {
		log.info("프로그래머 출근");
	}

	@Override
	public void goOffWork() {
		log.info("프로그래머 퇴근");
	}
	
}
