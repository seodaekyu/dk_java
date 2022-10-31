package test.main;

import test.mypac.Weapon;

public class TestMain {
	public static void main(String[] args) {
		// Weapon type 의 참조 값을 담을 수 있는 w 라는 지역변수 만들기(w는 비어있는 상태)
		Weapon w = null; // heap 영역에 찾아갈 참조 값이 없기때문에 error 뜸
		w.attack();
		w.prepare();
	}
}
