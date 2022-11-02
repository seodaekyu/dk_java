package frame05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	// 생성자
	public MyFrame(String title) {
		super(title);
		// this 예약어를 이용해서 MyFrame 객체의 다형성 확인!
		MyFrame a = this;
		JFrame  b = this;
		Component c = this;
		Object d = this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		// ActionListener 인터페이스 type 의 참조 값 얻어내서
		ActionListener listner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼을 눌렀네?");
				
				// 바깥에서 생성된 객체의 참조 값을 불러와서 만든 것
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다.");
				
				ActionListener f = this; // actionPerformed 안에서의 this는 익명클래스로 생성한 객체의 참조 값을 가리킴
				// Component g = MyFrame.this; inner Class 안에서 Outer Class를 불러오는 법
			}
			
		};
		
		// 전송 버튼에 등록하기
		sendBtn.addActionListener(listner);
		
		/*
		 * 삭제 버튼도 프레임에 배치하고, 해당 버튼을 눌렀을때 "삭제 버튼을 눌렀네?" 라는
		 * 메시지를 콘솔창에 출력되도록 프로그래밍 해보세요.
		 */
		
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);
		ActionListener listner2 = new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제 버튼을 눌렀네?");
				
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다.");
			}
		};
		deleteBtn.addActionListener(listner2); // 지역변수에 안담고 listner2 대신 new ActionEvent e 담아도 됨
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame("나의 프레임5");
		f.setVisible(true);
	}
}
