package stdisplay_check_jch;

import java.util.*;

import stdisplay.*;


public class Check {
	
	Stdisplay sd = new Stdisplay();
	StudentInfo st = new StudentInfo();
	Scanner scanner = new Scanner(System.in);
	
	
	public void member() {
		int cnt = 0;
		if (0==sd.std.size()) {
			System.out.println("등록된 학생이 없습니다.");
		}else {
		System.out.println("찾을 학생의 이름을 입력하세요");
		String name = scanner.next();
		for (int i=0;i<sd.std.size(); i++) {
			String stdname = sd.std.get(i).getName();
			if(name.equals(stdname)) {
			System.out.println("이름 : "+stdname);
			System.out.println("나이 : "+sd.std.get(i).getAge());
			cnt = 1;
		}
	} if(cnt!=1) {
		System.out.println("해당 학생은 없습니다.");
	}
	}
	}
	

	public void members() {
		if(sd.std.size() != 0) {
			for (int i=0;i<sd.std.size(); i++) {
				System.out.println("이름 : "+sd.std.get(i).getName());
				System.out.println("나이 : "+sd.std.get(i).getAge());
				System.out.println("---------------------"); 
			}
		}
		else
			System.out.println("등록된 학생이 없습니다.");
	}
	
	public void display() {
		while(true) {
			System.out.print("1.학생 검색 2.학생 리스트 표시 3.확인 종료 \n>>>");
			int num = scanner.nextInt();
			switch(num) {
			case 1 :
				member();
				break;
			case 2 :
				members();
				break;
			case 3 :
				System.out.println("확인을 종료합니다.");
				return;
			}
			
		}
	}

}
