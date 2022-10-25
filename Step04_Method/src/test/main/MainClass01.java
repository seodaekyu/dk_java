package test.main;

import test.myPac.Car;
import test.myPac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  1. MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는
		 *  2. walk(), getNumber(), getGreeting() 메소드를 차례로 호출해 보세요.
		 *  3. 단, 메소드가 어떤 data 를 리턴하면 해당 데이터를 지역변수에 담으세요.
		 */
		
		// 1.
		MyObject mo = new MyObject();
		// 2.
		mo.walk(); // void 이기때문에 return type 이 없음
		// 3.
		int num = mo.getNumber(); // return 값에 10이 들어가 있음 = return type int
		String greet = mo.getGreeting(); // return 값 "안녕하세요" = return type String
		Car car = mo.getCar();
		
		// setNum(), setName(), useCar() 메소드도 호출해 보세요.
		
		// 메소드 호출하면서 인자로 전달 할 데이터를 즉석에서 만들어서 전달하기
		mo.setNum(5);
		mo.setName("김구라");
		mo.useCar(new Car());
		
		// 메소드 호출하면서 인자로 전달 할 값이 지역변수에 이미 존재하는 경우라고 가정하자
		int a = 999;
		String b = "누구게";
		Car c1 = new Car();
		
		// 전달 할 값이 들어있는 변수명으로 전달 할 수도 있다.
		mo.setNum(a); // int num 이 필요한데 int a = 999 가 담겨있으니 사용가능
		mo.setName(b); // String Name 이 필요한데 String b = "누구게" 가 담겨있으니 사용가능
		mo.useCar(c1); // 참조값 new Car() 필요한데 c1 = new Car(); 니까 사용가능
		
		// doSomething() 메소드를 호출해 보세요.
		mo.doSomething(1, "원숭이", new Car());
		mo.doSomething(a, b, c1);
	}
}
