package project06_1;

public class Employee {
	String name;
	int employeeNum;
	String department;
	
	public Employee(String name, int employeeNum) {
		this.name=name;
		this.employeeNum=employeeNum;
		this.department="No Dept.";
	}
	
	public String getDepartment() { return department;}
	public void setDepartment(String dept) { this.department=dept; }
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		else {
			Employee otherEmp = (Employee)obj;
			return (name.equals(otherEmp.name)&&employeeNum==otherEmp.employeeNum);
		}
	}
	
	public String toString() {return "Name : " + name+"\nEmp# : "+employeeNum; }
}
