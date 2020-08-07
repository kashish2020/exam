import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentMain {
	Set<Student> store = new HashSet<Student>();

	public static void main(String args[]) {

		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		Student std1 = new Student("S1", 22);
		set.add(std1);
		Student std2 = new Student("K1", 14);
		set.add(std2);
		Student std3 = new Student("S2", 26);
		set.add(std3);
		Student std4 = new Student("K2", 29);
		set.add(std4);
		
		
		List<Student> studentage = new ArrayList<Student>(set);
		display(studentage);
	}
	
	private void display(List<Student> studentage) {
		for (Student stobject : studentage) {
			int age=stobject.getAge();
			if(age>21) {
			System.out.println(age);
		}
	}
}
}
