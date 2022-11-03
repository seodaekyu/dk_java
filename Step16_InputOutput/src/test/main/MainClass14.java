package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainClass14 {
	public static void main(String[] args) {
		// File 객체
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");
		// 필요한 객체를 담을 지역 변수를 미리 만들어 준다.
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 미리 만들어 둔 지역 변수에 참조 값 대입하기
			fr = new FileReader(memoFile);
			br = new BufferedReader(fr);
			
			// 정확한 횟수를 모르기때문에 while 반복문 돌면서
			while(true) {
				// 개행 기호를 기준으로 한 줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				String line = br.readLine();
				if(line == null) { // 더 이상 읽어올게 없으면 null 이 담기기때문에
					break;
				}
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 마무리 작업을 해줘야 된다.
			try {
				// 단는 작업은 열린 순서의 역순으로 하면 좋다.
				if(br!=null)br.close();
				if(br!=null)fr.close();
			}catch(Exception e) {
				
			}
		}
	}
}
