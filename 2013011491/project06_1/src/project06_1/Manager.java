package project06_1;

public class Manager extends Employee {
	int officeNum;
	String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.officeNum=officeNum;
		this.team=team;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else if(getClass()!=obj.getClass()){
			Employee otherEmp =(Employee)obj;
			return super.equals(otherEmp);
		}else {
			Manager compare=(Manager)obj;
			return super.equals(compare) && officeNum==compare.officeNum && team.equals(compare.team);
		}
	}
	
	public String toString() {
		return "Name : " + name+"\nlocation : "+department+", "+officeNum;
	}
}