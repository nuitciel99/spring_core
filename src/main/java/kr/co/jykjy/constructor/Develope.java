package kr.co.jykjy.constructor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Develope {
	private Emp emp;
	
	public Develope(Emp emp) {
		this.emp = emp;
	}


	void work(){
		emp.goToOffice();
		log.info("일 시작");
		emp.goOffWork();
	}
}
