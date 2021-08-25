package stdisplay_registration_joohui;


import java.util.ArrayList;
import java.util.Scanner;

import stdisplay.Stdisplay;
import stdisplay.StudentInfo;

public class Registration_joohui {
	private ArrayList<StudentInfo> list;
	Stdisplay s = new Stdisplay();
	
	public Registration_joohui(){	
}
	Scanner input = new Scanner(System.in);
	
	
	public void display() {
		int num;
		while(true) {
		System.out.println("1.등록을 시작합니다.");
		System.out.println("2.목록으로 돌아가기");
		System.out.print(">>>> : ");
		num = input.nextInt();
		switch(num) {
		case 1:
			StudentInfo st = new StudentInfo();
		System.out.println("학생 등록을 시작합니다.");
		System.out.println("이름 : ");
		String name = input.next();
		System.out.println("나이 : ");
		int age = input.nextInt();
		st.setName(name); st.setAge(age);
		s.std.add(st);
		System.out.println("등록 되었습니다.");
		break;
		
		case 2:
			System.out.println("목록으로 되돌아갑니다.");
			return;
				}	
			}
		} 
	}

