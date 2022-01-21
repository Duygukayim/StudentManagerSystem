package workshop;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();

	public void add(Student addStudent) {
		if (students.contains(addStudent)) {
			System.out.println(
					addStudent.getFirstName() + " " + addStudent.getLastName() + " adl� ��renci tekrar eklenemez!");
			return;
		}
		System.out.println(
				addStudent.getFirstName() + " " + addStudent.getLastName() + " adl� ��renci ba�ar�yla eklenmi�tir.");
		this.students.add(addStudent);
	}

	public void delete(int id) {
		Student toDelete = null;
		for (Student student : students) {
			if (student.getId() == id) {
				toDelete = student;
			}
		}
		System.out.println(
				toDelete.getFirstName() + " " + toDelete.getLastName() + " adl� ��renci ba�ar�yla silinmi�tir.");
		this.students.remove(toDelete);

	}

	public void update(Student updateStudent) {
		for (Student student : students) {
			if (student.getId() == updateStudent.getId()) {
				student = updateStudent;
			}
		}
		System.out.println("-----------------------------");
		System.out.println(updateStudent.getId() + " Id no'lu ��renci " + updateStudent.getFirstName() + " "
				+ updateStudent.getLastName() + " olarak ba�ar�yla g�ncellenmi�tir.");
	}

	public ArrayList<Student> getAll() {
		return this.students;
	}

	public void size(ArrayList<Student> students) {
		System.out.println("-----------------------------");
		System.out.println("Listedeki mevcut ki�i say�s�: " + students.size());
	}

	public void list(ArrayList<Student> students) {
		System.out.println("-----------------------------\n" + "G�ncel ��renci Listesi;");
		for (Student student : students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getIdentityNumber());
		}
	}

}