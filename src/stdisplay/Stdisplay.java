package stdisplay;

import java.util.ArrayList;
import java.util.Scanner;

import stdisplay_registration_joohui.Registration_joohui;

public class Stdisplay {
	public static void main(String[] args) {
		
		ArrayList<StudentInfo> std= new ArrayList<>(); 
		Registration_joohui re = new Registration_joohui();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("==== 학생 관리 프로그램====");
		System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
		System.out.println("4.학생 삭제 5.성적 관리");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			re.display();
			break;
				//학생등록 / 주희님
		case 2:
			break;
			// 학생 확인  / 청하님
		case 3:
			break;
			//학생 수정  / 성환님 
		case 4:
			break;
			// 학생 삭제
		case 5:
			// 성적 관리 / 소영님
			break;
		
		}
		
		
		
		
		
		
	
	}
		
	
}
