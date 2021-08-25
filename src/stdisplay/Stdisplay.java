

package stdisplay;
import java.util.ArrayList;
import java.util.Scanner;

<<<<<<< HEAD
import stdisplay_check_jch.Check;
public class Stdisplay {
	public static void main(String[] args) {
		
		ArrayList<StudentInfo> std= new ArrayList<>(); 

		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("==== 학생성적 관리 프로그램====");
		System.out.println("1.성적 추가 2.성적 수정 3.성적 검색 ");
		System.out.println("4.성적 삭제 5.모든 성적 확인");
		System.out.println("==== 학생 관리 프로그램====");
		System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
		System.out.println("4.학생 삭제 5.성적 관리");
		int choice = scan.nextInt();

		switch(choice) {
		case 1:
			break;
				//성적 추가
				//학생등록 / 주희님
		case 2:
			System.out.println("모든 학생 보기 기능");
			System.out.println("학생 관리 연결");
			
			break;
			// 성적 수정
			// 학생 확인  / 청하님
		case 3:
			break;
			//성적 검색
			//학생 수정  / 성환님 
		case 4:
			break;
			// 성적 삭제
			// 학생 삭제
		case 5:
			break;
			//모든 성적 확인
		}
=======
import java.util.*;

import stdisplay_delete_hjm.StdDelete;

import stdisplay_registration_joohui.Registration_joohui;

import stdisplay_grade_soyoung.Grade;

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
>>>>>>> cbfe33aac84ff25ed08a2d79d618392db802b706
	}
}


