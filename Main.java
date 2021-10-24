package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Group group = new Group();
		Student student = null;

		System.out.println("Do you whant to add student? (Yes/No)");

		while (sc.next().equals("Yes")) {
			student = new Student();
			System.out.println("Input name student");
			student.setName(sc.next());
			System.out.println("Input second name student");
			student.setSecondName(sc.next());
			System.out.println("Input age student");
			student.setAge(sc.nextInt());
			System.out.println("Input sex student");
			Sex sex = sc.next().equals("Male") ? Sex.MALE : Sex.FEMALE;
			student.setSex(sex);
			System.out.println("Input id student");
			student.setId(sc.nextLong());
			System.out.println("Input students Group name");
			student.setGroupName(sc.next());
			
			group.addStudent(student);

			System.out.println("Do you whant to add student? (Yes/No)");
		}
		
		System.out.println(group.toString());

	}
}
