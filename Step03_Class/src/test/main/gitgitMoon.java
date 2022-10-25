package test.main;

import test.mypac.Dog;
import test.mypac.Figure;

public class gitgitMoon {
	public static void main(String[] args) {
		/*
		 * dog클래스 만들고 개종류 type 개이름 name 그리고 짖다 메소드 만들어보삼
		 * 짖다실행시 "왈왈" 텍스트 출력
		 */
		
		Dog msh = new Dog();
		
		msh.type = "fitbull";
		msh.name = "black";
		
		msh.bark();
		
		Figure s1 = new Figure();
		Figure s2 = new Figure();
		Figure s3 = new Figure();
		
		s1.side = 3;
		
		s1.isTriangle();
		System.out.println(s1.isTriangle());
		
		///////////
		
		s2.side = 4;
		
		s2.isSquare();
		System.out.println(s2.isSquare());
		
		System.out.println(s1.isTriangle());
		
		System.out.println(s1.sumInternalAngle());
		
		s3.side = 2;
		System.out.println(s3.sumAngle());
	}
}
