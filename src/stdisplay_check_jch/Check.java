package stdisplay_check_jch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import stdisplay.Stdisplay;


public class Check {
	private static final String std = null;
	private Scanner scanner;
	private ArrayList arr;
	
	public Check() {
		scanner = new Scanner(System.in);
		Stdisplay sd = new Stdisplay();
		ArrayList arr= new ArrayList();
		
	}
	
	
	
	//학생 검색
	public void member() {
		System.out.println("찾을 학생의 이름을 입력하세요");
		String stNum = scanner.next();
		Stdisplay sd = new Stdisplay();
		
		if(arr.contains(stNum)) {
			Std std = arr(stNum);
			System.out.println("이름 : "+std.getName());
			System.out.println("주소 : "+std.getAddr());
		}else{
			System.out.println("해당 학생은 없습니다.");
		}
	}
	



	private Std arr(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}



	public void members() {
		if(arr.size() != 0) {
			Iterator<String> it = ((Map<String, Std>) arr).keySet().iterator();
			while(it.hasNext()) {
				Std std = new Std();
				System.out.println("이름 : "+std.getName());
				System.out.println("주소 : "+std.getAddr());
				System.out.println("---------------------"); 
			}
		}
		else
			System.out.println("저장 데이터 없음");
	}
	public void regster() {
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

		std.setAddr(addr); std.setName(name);

		System.out.println("저장 완료");
	}



	public void display() {
		// TODO Auto-generated method stub
		
	}
}
