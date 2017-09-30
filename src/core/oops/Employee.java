package core.oops;

// Person is Parent or super class for Employee.
// Employee is Child class or sub class for person  
public class Employee extends Person{
	
	private String empno;
	private double salary;
	private String job;
	private float exp;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	
	public void setWieght(float wieght) {
		// TODO Auto-generated method stub
		super.setWieght(wieght);
		
	}
	
	
	

}
