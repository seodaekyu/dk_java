package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		// 자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		
		// 나도 SmartPhone 갖고 싶어!!
		
		// 새로운 설명서를 가지고 왔어 이제 그 폰은 SmartPhone 이야
		SmartPhone p2 = (SmartPhone)p1; // ClassCastException 오류발생!
		
		// 이제 인터넷 가능하다!!
		p2.doInternet();
	}
}
