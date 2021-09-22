package javaProgram;

public class Student01 {
	int stdId;
	String stdename;
	int stdClass;
	
	public static void main(String[] args) {
		Student01 std1 = new Student01();
		std1.stdId=101;
		std1.stdename="ROHIT";
		std1.stdClass=10;
		std1.display();
	}
void display() {
	System.out.println(stdId);
	System.out.println(stdename);
System.out.println(stdClass);

}
}