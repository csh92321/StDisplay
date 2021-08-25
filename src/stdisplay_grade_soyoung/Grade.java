package stdisplay_grade_soyoung;

import java.util.Scanner;

import stdisplay.Stdisplay;
import stdisplay.StudentInfo;

public class Grade {

	StudentInfo si = new StudentInfo();
	Stdisplay sd = new Stdisplay();
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		
		while(true) {
			System.out.println("=== 성적관리 ===");
			System.out.println("1.학생 성적 등록");
			System.out.println("2.학생 성적 확인");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.메인으로 이동");
			System.out.print(">> ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.print("학생 이름 입력 : ");
				String stName = sc.next();
				
				for(int i=0; i<sd.std.size();i++) {
					String name = sd.std.get(i).getName();
					if (name.equals(stName)) {
						putGrade(i);
						
					} else {
						System.out.println(stName+" 학생은 존재하지 않습니다");
					}
					
				}
				break;
			case 2 : 
				System.out.print("학생 이름 입력 : ");
				stName = sc.next();
				
				for(int i=0; i<sd.std.size();i++) {
					String name = sd.std.get(i).getName();
					if (name.equals(stName)) {
					System.out.println("<< "+stName+" 학생 성적표 >>");
					checkGrade(i);
					} else {
						System.out.println(stName + " 학생은 존재하지 않습니다");
					}
				}
				break;
				
			case 3 :
				System.out.print("학생 이름 입력 : ");
				stName = sc.next();
				
				for(int i=0; i<sd.std.size();i++) {
					String name = sd.std.get(i).getName();
					if (name.equals(stName)) {
						System.out.println("수정할 과목 입력 (전과목 재입력시 '전과목'작성)");
						System.out.print(">> ");
						String subject = sc.next();
						correctGrade(subject,i);
					}
				}
				break;
			case 4 :
				return;
			}
		}
	}
	
	public void putGrade(int num) {
	
		System.out.print("국어 성적 입력 : ");
		int kor = sc.nextInt();
		sd.std.get(num).setKor(kor);
		System.out.print("영어 성적 입력 : ");
		int eng = sc.nextInt();
		sd.std.get(num).setEng(eng);
		System.out.print("수학 성적 입력 : ");
		int math = sc.nextInt();
		sd.std.get(num).setMath(math);

		double avg = (kor+eng+math)/3.0;
		sd.std.get(num).setAvg(avg);

		
	}
	
	public void checkGrade(int num) {
		System.out.printf("국어 : %d 영어 : %d 수학 : %d 평균 : %.2f \n",sd.std.get(num).getKor(), sd.std.get(num).getEng() 
		,sd.std.get(num).getMath(),sd.std.get(num).getAvg());
	}
	
	public void correctGrade(String subject,int num) {
		
		if (subject.equals("국어")) {
			System.out.print("국어 점수 재입력 : ");
			int kor = sc.nextInt();
			sd.std.get(num).setKor(kor);
			double avg = (sd.std.get(num).getKor()+sd.std.get(num).getEng()+sd.std.get(num).getMath())/3.0;
			sd.std.get(num).setAvg(avg);
		} else if (subject.equals("수학")) {
			System.out.print("수학 점수 재입력 : ");
			int math = sc.nextInt();
			sd.std.get(num).setMath(math);
			double avg = (sd.std.get(num).getKor()+sd.std.get(num).getEng()+sd.std.get(num).getMath())/3.0;
			sd.std.get(num).setAvg(avg);
		} else if (subject.equals("영어")) {
			System.out.print("영어 점수 재입력 : ");
			int eng = sc.nextInt();
			sd.std.get(num).setEng(eng);
			double avg = (sd.std.get(num).getKor()+sd.std.get(num).getEng()+sd.std.get(num).getMath())/3.0;
			sd.std.get(num).setAvg(avg);
		} else if (subject.equals("전과목")) {
			putGrade(num);
		} else {
			System.out.println("잘못된 입력입니다");
		}
	}
	

}
