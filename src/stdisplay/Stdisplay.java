package stdisplay;

import java.util.ArrayList;
import java.util.Scanner;


import stdisplay_registration_joohui.Registration_joohui;

import stdisplay_grade_soyoung.Grade;
import stdisplay_modify_csh.Modify;


public class Stdisplay {
	
	
	public static  ArrayList<StudentInfo> std = new ArrayList<>();
	
	public  ArrayList<StudentInfo> getAddr() {	
		return std;
	}
	
	public void setAddr(ArrayList<StudentInfo> std) {
		this.std = std;
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Registration_joohui re = new Registration_joohui();
		Modify mod = new Modify();
		Grade grade = new Grade();
		
		
		
		while(true) {
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
			mod.modify();
			break;
			//학생 수정  / 성환님 
		case 4:
			break;
			// 학생 삭제
		case 5:
			grade.display();
			break;
		}
		
	
		}
	
		
	
	}
		
	
}
