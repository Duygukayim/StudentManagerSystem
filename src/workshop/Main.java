package workshop;

public class Main {

	public static void main(String[] args) {

		StudentManager manager = new StudentManager();

		Student �grenci1 = new Student(1, "Duygu", "Kay�m", 823671);
		Student �grenci2 = new Student(2, "Ali", "Akp�nar", 456735);
		Student �grenci3 = new Student(3, "Damla", "Do�umsel", 764923);
		Student newStudent = new Student(1, "Ay�e", "S�nmez", 563279);

		manager.add(�grenci1);
		manager.add(�grenci3);
		manager.add(�grenci2);
		manager.add(�grenci3);

		manager.delete(1);

		manager.size(manager.getAll());
		manager.update(newStudent);
		manager.list(manager.getAll());

	}

}
