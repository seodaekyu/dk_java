package test.main;

import java.util.Random;

public class MainClass08_2 {
	public static void main(String[] args) {
		/*
		 *  1. run 했을 때 cherry, apple, banana, melon, 7 5개의 문자열 중에서 1개가 랜덤 출력되게 해보세요.
		 *  
		 *  2. run 했을 때 5개의 문자열 중에서 3개가 한 줄에 한 번에 랜덤하게 출력되게 해보세요.
		 *  
		 *  3. 1번과 2번을 다 했다면 점수 내는 법도 만들어보세요
		 */
		
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		Random ran = new Random();
		
		System.out.println(items[ran.nextInt(5)]);
		
		String[] str = new String[3];
		
		
		for(int i=0; i<str.length; i++) {
			int ranNum = ran.nextInt(items.length);
			str[i] = items[ranNum];
		}
		System.out.println(str[0] +" | "+ str[1] +" | " +str[2]);
		
	}
}
