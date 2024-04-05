package org.emp;
import org.flip.FlipKart;
public class EmployeeDetails extends FlipKart {
	public void empName() {
		System.out.println("Employee name is Maryam");
		}
		public void empId() {
		System.out.println("Employee Id is 24");
		}
		public void empRole() {
		System.out.println("Employee Role is Tester");
		}
		public static void main(String[] args) {
		EmployeeDetails ed= new EmployeeDetails();
		ed.empName();
		ed.empId();
		ed.empName();
		ed.cmpId();
		ed.cmpName();
		ed.login();
		ed.homepage();
		ed.smartphone();
		}

}
