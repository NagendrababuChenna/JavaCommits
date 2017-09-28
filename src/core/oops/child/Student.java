package core.oops.child;

import core.oops.Person;




public class Student extends Person{

	//private String id;
	protected int stno;
	private String standard;
	
	public String getStandard() {
		return standard;
	}
	
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	// OVer RIde..
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id + "ABC"); 
	}
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	
	
}
