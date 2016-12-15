
public class Tester {

	public static void main(String[] args) {

		Student One = new Student("Tim", "Computer Science", 1975);
		Person Two = new Student("Tay", "Engineering", 1983);
		
		Instructor Three = new Instructor("Mr. Man", 80000, 1965);
		Person Four = new Instructor("Mrs. Mad", 75000, 1969);
		
		System.out.println(One.name + ", " + One.major);
		System.out.println(((Student) Two).major);
		System.out.println(Three.sal);
		System.out.println(Four.bday);

	}
}
