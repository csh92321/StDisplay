package stdisplay_check_jch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Check {
	private Scanner scanner;
	private ArrayList arr;
	
	public Check() {
		scanner = new Scanner(System.in);
		ArrayList arr= new ArrayList();
		
	}
	
	
	
	//학생 검색
	public void member() {
		System.out.println("찾을 학생의 이름을 입력하세요");
		String stNum = scanner.next();
		if(arr.contains(stNum)) {
			BSt st = arr(stNum);
			System.out.println("이름 : "+st.getName());
			System.out.println("주소 : "+st.getAddr());
		}else{
			System.out.println("해당 학생은 없습니다.");
		}
	}
	private BSt arr(String stNum) {
		return null;
	}



	public void members() {
		if(arr.size() != 0) {
			Iterator<String> it = ((Map<String, BSt>) arr).keySet().iterator();
			while(it.hasNext()) {
				BSt st = new BSt();
				System.out.println("이름 : "+st.getName());
				System.out.println("주소 : "+st.getAddr());
				System.out.println("---------------------");
			}
		}
		else
			System.out.println("저장 데이터 없음");
	}
	public void regster() {
		BSt b = new BSt();
		String name, addr;

		if(arr.size() != 0) {
			while(true) {
				System.out.println("이름입력");
				name = scanner.next();
				if(arr.contains(name)) {
					System.out.println("동일한 이름이 존재합니다.");
					continue;
				}
				break;
			}
		}else {
			System.out.println("이름을 입력하세요.");
			name = scanner.next();
		}
		System.out.println("이름 입력");
		name = scanner.next();
		System.out.println("주소 입력");
		addr = scanner.next();

		b.setAddr(addr); b.setName(name);
		((Map<String, BSt>) arr).put(name, b);

		System.out.println("저장 완료");
	}
}
