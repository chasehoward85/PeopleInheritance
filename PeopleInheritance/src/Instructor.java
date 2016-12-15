
public class Instructor extends Person{
	public double sal;
	
	public Instructor(String n, double s, int bd){
		super(n, bd);
		sal = s;
	}
	
	public double getSal(){
		return sal;
	}
}
