
public class Student extends Person{
	public String major;
	
	public Student(String n, String m, int bd){
		super(n, bd);
		major = m;
	}
	
	public String getMajor(){
		return major;
	}
}
