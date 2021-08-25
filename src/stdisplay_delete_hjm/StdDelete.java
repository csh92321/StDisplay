package stdisplay_delete_hjm;

import java.util.Scanner;
import stdisplay.Stdisplay;
import stdisplay.StudentInfo;

public class StdDelete {
	boolean flag = false;
	Scanner scan = new Scanner(System.in);
	StudentInfo st = new StudentInfo();
	Stdisplay aa = new Stdisplay();

	public void check() {
		flag = false;
		System.out.print("이름 입력 :");
		String name = scan.next();
		for (int i = 0; i < aa.getAddr().size(); i++) {
			StudentInfo d = aa.getAddr().get(i);
			if (name.equals(d.getName())) {
				aa.getAddr().remove(i);
				System.out.println("삭제완료");
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag != true) {
			System.out.println("없는 학생 정보");

		}
	}

	public void print() {

		System.out.println("==== 학생 삭제 ====");
		System.out.println("학생 이름 입력 ");
		check();
	}
}