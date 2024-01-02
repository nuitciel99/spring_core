package kr.co.jykjy.constructor.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

// spring 4.3 : 단일 생성자를 통한 자동 주입 

@AllArgsConstructor
public class Develope {
	
	private Emp emp;
	
	void work(){
		emp.goToOffice();
		log.info("일 시작");
		emp.goOffWork();
	}

	
}
