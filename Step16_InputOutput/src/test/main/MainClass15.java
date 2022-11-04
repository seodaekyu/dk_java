package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	public static void main(String[] args) {
		// 필요한 참조 값을 담을 지역변수를 미리 만든다.
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		try {
			// 파일에서 byte 를 읽어 낼 객체
			fis = new FileInputStream("c:/acorn202210/myFolder/bottle.png");
			// 파일에 byte 를 출력 할 객체
			fos = new FileOutputStream("c:/acorn202210/myFolder/copied.png");
			
			while(true) {
				// byte 알갱이 하나씩 읽어들인다.
				int data = fis.read();
				// 만일 더이상 읽을 byte 가 없다면 
				if(data == -1) { // 더이상 리턴해줄게 없을때 -1 리턴 되는걸 이용하여
					break; // 반복문 탈출
				}
				System.out.println(data);
				// 읽은 byte 알갱이 하나를 출력하기
				fos.write(data);
				fos.flush(); // 출력할 때는 flush 까지
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!= null)fos.close();
				if(fis!= null)fis.close();
			}catch(Exception e) {}
		}
	}
}
