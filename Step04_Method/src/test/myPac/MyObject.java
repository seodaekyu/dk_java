package test.myPac;
/*
 *  [ 메소드를 만들 때 고려 해야 되는 것 ]
 *  
 *  1. 접근 지정자
 *  2. static or non static
 *  3. return type
 *  4. method name
 *  5. method 에 전달하는 인자의 갯수와 data type
 */
public class MyObject {
	
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
}
