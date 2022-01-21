package workshop;

public class Main {

	public static void main(String[] args) {

		StudentManager manager = new StudentManager();

		Student ögrenci1 = new Student(1, "Duygu", "Kayım", 823671);
		Student ögrenci2 = new Student(2, "Ali", "Akpınar", 456735);
		Student ögrenci3 = new Student(3, "Damla", "Doğumsel", 764923);
		Student newStudent = new Student(1, "Ayşe", "Sönmez", 563279);

		manager.add(ögrenci1);
		manager.add(ögrenci3);
		manager.add(ögrenci2);
		manager.add(ögrenci3);

		manager.delete(1);

		manager.size(manager.getAll());
		manager.update(newStudent);
		manager.list(manager.getAll());

	}

}
