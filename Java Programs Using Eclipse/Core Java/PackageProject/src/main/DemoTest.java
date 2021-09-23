package main;
import abc.Employee;
import abc.Manager;
import xyz.Department;
import xyz.Developer;
public class DemoTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.dis();
		Manager mgr = new Manager();
		mgr.disMgr();
		Developer dv = new Developer();
		dv.disDev();
		Department dd = new Department();
		dd.disEmpInfo();
	}

}
