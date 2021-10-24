package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Group {

	private Student[] students = new Student[10];

	public void addStudent(Student student) {
		try {
			for (int i = 0; i < students.length + 1; i++) {
				
				
				if (students[i] == null) {
					students[i] = student;
					break;
				} else if(i == 11) {
					throw new TooMuchStudentsException();
				}	
		}
		} catch (TooMuchStudentsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dellStudent(long id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
			}
		}
	}
	
	public Student filterStudents (String secondName) throws NotFoundStudentException {
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSecondName().equals(secondName)) {
				student = students[i];
				break;
			}
		}
		if (student==null) throw new NotFoundStudentException(secondName);
		return student;
	}
	
	@Override
	public String toString() {
		
		List<Student> stu = new ArrayList<>();
		for(Student s: students) {
			if(s != null) {
				stu.add(s);
			}
		}
		
		Collections.sort(stu, new Comparator<Student>() {
			public int compare(Student one, Student two) {
				return one.secondName.compareTo(two.secondName);
			}
		});
	
		return stu.toString();

	}

}
