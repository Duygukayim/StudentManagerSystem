package workshop;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();

	public void add(Student addStudent) {
		if (students.contains(addStudent)) {
			System.out.println(
					addStudent.getFirstName() + " " + addStudent.getLastName() + " adlý öðrenci tekrar eklenemez!");
			return;
		}
		System.out.println(
				addStudent.getFirstName() + " " + addStudent.getLastName() + " adlý öðrenci baþarýyla eklenmiþtir.");
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
				toDelete.getFirstName() + " " + toDelete.getLastName() + " adlý öðrenci baþarýyla silinmiþtir.");
		this.students.remove(toDelete);

	}

	public void update(Student updateStudent) {
		for (Student student : students) {
			if (student.getId() == updateStudent.getId()) {
				student = updateStudent;
			}
		}
		System.out.println("-----------------------------");
		System.out.println(updateStudent.getId() + " Id no'lu öðrenci " + updateStudent.getFirstName() + " "
				+ updateStudent.getLastName() + " olarak baþarýyla güncellenmiþtir.");
	}

	public ArrayList<Student> getAll() {
		return this.students;
	}

	public void size(ArrayList<Student> students) {
		System.out.println("-----------------------------");
		System.out.println("Listedeki mevcut kiþi sayýsý: " + students.size());
	}

	public void list(ArrayList<Student> students) {
		System.out.println("-----------------------------\n" + "Güncel Öðrenci Listesi;");
		for (Student student : students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getIdentityNumber());
		}
	}

}