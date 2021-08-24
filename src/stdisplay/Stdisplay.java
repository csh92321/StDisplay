package stdisplay;

import java.util.*;

import stdisplay_delete_hjm.StdDelete;

public class Stdisplay {
	
	
	private static  ArrayList<StudentInfo> std = new ArrayList<>();
	
	public  ArrayList<StudentInfo> getaddr()
	{
		return std;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StdDelete hjm = new StdDelete();
			
		Stdisplay sp = new Stdisplay();
		ArrayList<StudentInfo> std = sp.getaddr();
		

		while (true) {
			System.out.println("==== 학생 관리 프로그램====");
			System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
			System.out.println("4.학생 삭제 5.성적 관리");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				StudentInfo st = new StudentInfo();
				System.out.println(">>>");
				String name = scan.next();
				st.setName(name);
				std.add(st);
				break;
			case 2:
				for (int i = 0; i < std.size(); i++) {
					StudentInfo d = std.get(i);
					System.out.println("asdfasdf:::" + d.getName());
				}
				break;
			case 3:
				break;
			// 학생 수정 / 성환님
			case 4:
				hjm.delete();
				System.out.println("================");
				hjm.stdSrc();
				System.out.println("================");
				hjm.print();
				System.out.println("222================");
				hjm.stdSrc();
				System.out.println("333================");
				break;

			case 5:
				// 성적 관리 / 소영님
				break;

			}

		}

	}

}
