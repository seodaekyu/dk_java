package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums 에 담기 
		int[] nums = {0, 0, 0};
		// 0 번방에 10, 1번방에 20, 2번방에 30 을 저장해보세요.
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0 으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 num2 에 담기
		int[] nums2 = new int[3];
		nums2[0] = 100;
		nums2[1] = 200;
		nums2[2] = 300;
		// nums2[3] = 400; 4번방은 없는데 거기에 뭔가를 넣으려고하면 오류가 생긴다.
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
