package stdisplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Stdisplay {
	public static void main(String[] args) {
		
		ArrayList<StudentInfo> std= new ArrayList<>(); 
		
		Scanner scan =new Scanner(System.in);
		System.out.println("==== 학생성적 관리 프로그램====");
		System.out.println("1.성적 추가 2.성적 수정 3.성적 검색 ");
		System.out.println("4.성적 삭제 5.모든 성적 확인");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			break;
				//성적 추가
		case 2:
			break;
			// 성적 수정
		case 3:
			break;
			//성적 검색
		case 4:
			break;
			// 성적 삭제
		case 5:
			//모든 성적 확인
			break;
		
		}
		
		
		
		
		
		
	
	}
		
	
}
