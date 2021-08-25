package stdisplay;

import java.util.*;
<<<<<<< HEAD


//성적 추가
//학생등록 / 주희님

// 성적 수정
// 학생 확인  / 청하님

//성적 검색
//학생 수정  / 성환님 

// 성적 삭제
// 학생 삭제

//모든 성적 확인
import java.util.ArrayList;
import java.util.Scanner;

import stdisplay_check_jch.Check;
import stdisplay_delete_hjm.StdDelete;
import stdisplay_grade_soyoung.Grade;
import stdisplay_registration_joohui.Registration_joohui;

public class Stdisplay {

	private static ArrayList<StudentInfo> std = new ArrayList<>();

	public ArrayList<StudentInfo> getaddr() {
		return std;
	}

	public static void main(String[] args) {
		
		ArrayList<StudentInfo> std= new ArrayList<>(); 
		Registration_joohui re = new Registration_joohui();
		Grade grade = new Grade();	
		StdDelete hjm = new StdDelete();
		Check jch = new Check();
		Scanner scan =new Scanner(System.in);

		while (true) {

			System.out.println("==== 학생 관리 프로그램====");
			System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
			System.out.println("4.학생 삭제 5.성적 관리 6.종료");
			System.out.print(">> ");
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
				grade.display();
				break;
			case 6:
				return;
			}
		}	
	}

import stdisplay_delete_hjm.StdDelete;
import stdisplay_registration_joohui.Registration_joohui;
import stdisplay_grade_soyoung.Grade;
import stdisplay_modify_csh.Modify;

public class Stdisplay {

	public static ArrayList<StudentInfo> std = new ArrayList<>();

	// main arraylist에 접근이 불가능해서 메소드로 주소값 리턴하는 메소드
	public ArrayList<StudentInfo> getAddr() {
		return std;
	}

	public void setAddr(ArrayList<StudentInfo> std) {
		this.std = std;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StdDelete hjm = new StdDelete();
		Registration_joohui re = new Registration_joohui();
		Grade grade = new Grade();
		Modify mod = new Modify();

		while (true) {
			System.out.println("==== 학생 관리 프로그램====");
			System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
			System.out.println("4.학생 삭제 5.성적 관리 6.종료");
			System.out.print(">> ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				re.display();
				break;
			// 학생등록 / 주희님
			case 2:
				jch.print();
				break;
			// 학생 확인 / 청하님
			case 3:
				mod.modify();
				break;
			// 학생 수정 / 성환님
			case 4:
				hjm.print();
				break;
			// 학생 삭제
			case 5:
				grade.display();
				break;
				//성적 수정
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
