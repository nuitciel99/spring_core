package kr.co.jykjy.method;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public class Magician {
	private MagicBox magicBox; 
	
	public void magic(){
		log.info("상자의 내용물은 {}", magicBox.getCount());
	}
}
