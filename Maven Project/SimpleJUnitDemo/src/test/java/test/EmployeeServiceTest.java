package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Employee;
import service.EmployeeService;

public class EmployeeServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This call only once before all test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This call only once after all test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("it call before every test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("it call after every test");
	}

	@Test
	public void testGetEmployee() {
		EmployeeService es = new EmployeeService();
		Employee emp  = es.getEmployee();
		assertNotNull(emp);
		assertEquals(emp.getId(), 100);
		assertEquals(emp.getName(), "Raj");
		assertEquals(emp.getSalary(), 12000,0.01);
	}
	@Test
	public void testPassListInfo() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ramesh", 14000));
		listOfEmp.add(new Employee(2, "Raj", 16000));
		listOfEmp.add(new Employee(3, "Lokesh", 18000));
		String msg = es.passListInfo(listOfEmp);
		assertEquals("done", msg);
	}
	@Test
	public void testGetAllEmployeeDetails() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.getAllEmployeeDetails();
		Employee emp = listOfEmp.get(0);
		assertEquals(listOfEmp.size(), 4);
		assertEquals(100, emp.getId());
		assertEquals("Raj", emp.getName());
		assertEquals(12000, emp.getSalary(),0.01);
	}
	@Test
	public void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		boolean res = es.checkUser("Raj", "123");
		assertTrue(res);
		
	}

}
