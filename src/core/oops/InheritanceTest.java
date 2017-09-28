package core.oops;

import core.oops.child.Student;


public class InheritanceTest {
	
	public static void main(String[] args) {
		// Class objectname = new Class()or constructor
		Person p1 = new Person();// new Person will allocate memory and create Object;
		
		p1.setName("Anees");
		p1.setGender("M");
		p1.setHight(5.9f);
		p1.setWieght(79);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		
		Employee e1 = new Employee();
		e1.setName("Anees1"); // setName method is coming from parent /super class;
		e1.setEmpno("123");
		
		System.out.println(e1.getName());
		System.out.println(e1.getEmpno());
		
		// Par5ent can hold all the Child Objects..
		Person e2 = new Employee();
		Person s2 = new Student();
		Object o = new Employee();
		
		
		// Type casting
		Student s3 = (Student)s2;
		s3.getStandard();
		Employee e3 = (Employee)e2;
		
		
		
		
	}
	
}
