package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		// 밑의 코드를 총 3단계로 줄일 수 있다. j1, j2, j3
		Joinner j1 = new Joinner() { 
			@Override
			public String join(String one, String two) {
				
				return one + two;
			}
		};
		
		String result1 = j1.join("안녕", "하세요");

		Joinner j2 = (one, two)->{
			
			return one + two;
		};
		
		// 메소드 안에서 특별히 실행할 코드가 없다면 아래와 같이 중괄호를 생략하고 리턴할 값만 명시하면 된다.
		Joinner j3 = (one, two)-> one + two; // 람다식
		
	}
}
