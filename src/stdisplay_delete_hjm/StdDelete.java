package stdisplay_delete_hjm;

import java.util.ArrayList;
import java.util.Scanner;

import stdisplay.Stdisplay;
import stdisplay.StudentInfo;

public class StdDelete {

	Scanner scan = new Scanner(System.in);
	StudentInfo st = new StudentInfo();
	Stdisplay aa = new Stdisplay();

	public void delete() {

		for (int i = 0; i < 1; i++) {
			StudentInfo st = new StudentInfo();
			System.out.println(">>>");
			String name = scan.next();
			st.setName(name);
			aa.getaddr().add(st);
		}
	}

	public void stdSrc() {
		for (int i = 0; i < aa.getaddr().size(); i++) {
		StudentInfo d = aa.getaddr().get(i);
		System.out.println("#######:" + d.getName());
	}
		

	}

	public void print() {
				aa.getaddr().remove(0);

	}
}
