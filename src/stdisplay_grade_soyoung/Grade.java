package stdisplay_grade_soyoung;

import java.util.Scanner;

import stdisplay.StudentInfo;

public class Grade {

	StudentInfo si = new StudentInfo();

	
	public void display() {
		
		while(true) {
			System.out.println("=== 성적관리 ===");
			System.out.println("1.학생 성적 등록");
			System.out.println("2.학생 성적 확인");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.메인으로 이동");
			System.out.print(">> ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.print("학생 이름 입력 : ");
				String stName = sc.next();
				
				if (si.getName().equals(stName)) {
					putGrade();
				} else {
					System.out.println(stName+" 학생은 존재하지 않습니다");
				}
				break;
			case 2 : 
				System.out.print("학생 이름 입력 : ");
				stName = sc.next();
				
				if (si.getName().equals(stName)) {
					System.out.println("<< "+stName+" 학생 성적표 >>");
					checkGrade();
				} else {
					System.out.println(stName + " 학생은 존재하지 않습니다");
				}
				break;
			case 3 :
				System.out.print("학생 이름 입력 : ");
				stName = sc.next();
				
				if (si.getName().equals(stName)) {
					System.out.println("수정할 과목 입력 (전과목 재입력시 '전과목'작성)");
					System.out.print(">> ");
					String subject = sc.next();
					correctGrade(subject);
				}
				break;
			case 4 :
				return;
			}
		}
	}
	
	public void putGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적 입력 : ");
		int kor = sc.nextInt();
		si.setKor(kor);
		System.out.print("영어 성적 입력 : ");
		int eng = sc.nextInt();
		si.setEng(eng);
		System.out.print("수학 성적 입력 : ");
		int math = sc.nextInt();
		si.setKor(math);
		double avg = kor+eng+math /3.0;
		si.setAvg(avg);
	}
	
	public void checkGrade() {
		System.out.println("국어 : " + si.getKor() + "영어 : " + si.getEng() 
		+ "수학 : " + si.getMath() + "평균 : " + si.getAge());
	}
	
	public void correctGrade(String subject) {
		Scanner sc = new Scanner(System.in);
		
		if (subject.equals("국어")) {
			System.out.print("국어 점수 재입력 : ");
			int kor = sc.nextInt();
			si.setKor(kor);
			double avg = (si.getKor()+si.getEng()+si.getMath())/3.0;
			si.setAvg(avg);
		} else if (subject.equals("수학")) {
			System.out.print("수학 점수 재입력 : ");
			int math = sc.nextInt();
			si.setMath(math);
			double avg = (si.getKor()+si.getEng()+si.getMath())/3.0;
			si.setAvg(avg);
		} else if (subject.equals("영어")) {
			System.out.print("영어 점수 재입력 : ");
			int eng = sc.nextInt();
			si.setEng(eng);
			double avg = (si.getKor()+si.getEng()+si.getMath())/3.0;
			si.setAvg(avg);
		} else if (subject.equals("전과목")) {
			putGrade();
		} else {
			System.out.println("잘못된 입력입니다");
		}
	}
	

}
