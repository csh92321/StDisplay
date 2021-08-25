package stdisplay_modify_csh;

import java.util.*;
import stdisplay.*;

public class Modify {
	
		Scanner scan = new Scanner(System.in);
		Stdisplay s = new Stdisplay();
		StudentInfo st = new StudentInfo();
		
		public void modify() {
		System.out.print("수정할 학생의 이름을 입력해주세요 : ");
		String mody = scan.next();
		int cnt = 0;
		for (int i=0;i<s.std.size(); i++) {
			String stimo = s.std.get(i).getName();
			if(stimo.equals(mody)) {
				System.out.println("어느 정보를 수정하시겠습니까?");
				System.out.print("1.이름 2.나이");
				int se = scan.nextInt();
				cnt = 1;
				switch(se) {
				case 1 :
					System.out.print("수정할 이름을 입력하세요 \n>>>");
					String modname = scan.next();
					s.std.get(i).setName(modname);
					break;
				case 2 : 
					System.out.print("수정할 나이를 입력하세요 \n>>>");
					int modage = scan.nextInt();
					s.std.get(i).setAge(modage);
					break;
				}
			}
			
		} if (cnt==0) {
			System.out.println("이름이 발견되지 않았습니다.");
		}
			}
		
		
}