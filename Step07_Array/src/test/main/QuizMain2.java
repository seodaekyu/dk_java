package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		// 1.
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		
		
		// 2.
		for(int i=0; i<3; i++) {
			// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum = ran.nextInt(5); // ran.nextInt(items.length); 도 가능
			// 배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			if(i<2) { // i != 2
				System.out.print(" | ");
			}
			
		}
		
		
		
		
	}
}
