import java.util.Scanner;

class Student {
	int id;
	String name;
	boolean sec;
	float marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSec() {
		return sec;
	}

	public void setSec(boolean sec) {
		this.sec = sec;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Student(int id, String name, boolean sec) {
		this.id = id;
		this.name = name;
		this.sec = sec;
	}

	public static void identifyMarks(float marks) {
		System.out.println("marks scored in first chance are : " + marks);
	}

	public static void identifyMarks(float m1, float m2) {
		if (m1 < m2) {
			System.out.println(+m2 + " is maximum marks scored ");
		} else {
			System.out.println(+m1 + " is maximum marks scored ");
		}
	}
}

public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of students");
		int n = sc.nextInt();
		Student[] a = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter student id");
			int id = sc.nextInt();
			System.out.println("enter student name");
			String name = sc.next();
			System.out.println("enter second chance is true or false");
			boolean sec = sc.nextBoolean();
			a[i] = new Student(id, name, sec);
			if (a[i].sec == false) {
				System.out.println("enter first chance marks");
				float marks = sc.nextFloat();
				a[i].identifyMarks(marks);
			} else {
				System.out.println("enter first chance marks");
				float m1 = sc.nextFloat();
				System.out.println("enter second chance marks");
				float m2 = sc.nextFloat();
				a[i].identifyMarks(m1, m2);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Id of student is " + a[i].getId());
			System.out.println("Name of student is " + a[i].getName());
		}
	}

}
