package javaProgram;

public class Employee {
	
	int empId;
	String ename;
	int salary;
	int deptno;
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId=101;
		emp1.ename="ROHIT";
		emp1.salary=10000;
		emp1.deptno=10;
		emp1.display();
		
	}
void display() {
	System.out.println(empId);
	System.out.println(ename);
System.out.println(salary);
System.out.println(deptno);
}
}
