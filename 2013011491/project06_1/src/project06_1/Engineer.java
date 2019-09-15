package project06_1;

public class Engineer extends Employee {
	String workZone;
	String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name,employeeNum);
		this.workZone=workZone;
		this.project=project;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else if(getClass()!=obj.getClass()){
			Employee otherEmp =(Employee)obj;
			return super.equals(otherEmp);
		}else {
			Engineer compare=(Engineer)obj;
			return super.equals(compare) && workZone.equals(compare.workZone) && project.equals(compare.project);
		}
		}
	
	public String toString() {
		return "Name : " + name+"\nEmp# : "+employeeNum+"\nlocation : "+department+", "+workZone;
	}
}