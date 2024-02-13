package edu.kh.opp.methode.run;

import edu.kh.opp.methode.model.service.MemberService;

public class MemberRun {
	public 			static 		void 		main		(String[] args) {
// [접근제한자] 	[예약어] 	반환형 		메서드명 	([매개변수])
			// 대괄호 안 => 생략 가능
		
		MemberService service = new MemberService();
		
		// MemberService의 기본생성자가 작성되어 있지 않지만
		// 컴파일러가 코드를 번역 시
		// 클래스 내부에 생성자가 하나도 없으면
		// 자동으로 기본생성자를 추가하기에
		// 문제없이 사용가능
		// ** 주의사항 ** 
		// 
		
		service.displayMenu();
	}
}
