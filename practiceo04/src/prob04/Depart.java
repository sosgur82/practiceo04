package prob04;

public class Depart extends Employee {
	private String department;
	public Depart(String name, int salary) {
		super(name,salary);
	}
	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Depart(String name, int salary, String dept) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		this.department = dept;
	}
	
	public void getInformation() {
		System.out.println( "이름: " + getName() + " 연봉: " + getSalary() + " 부서 : " + this.department );
	}
}
