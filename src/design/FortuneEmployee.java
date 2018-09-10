package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		// create a Employee object



		Person employee = new EmployeeGO("Test Incorporated","Jewell");

		System.out.println(((EmployeeGo) employee).employeeId());

		System.out.println(((EmployeeGo) employee).employeeName());

		System.out.println(((EmployeeGo) employee).getDept());

		System.out.println(((EmployeeGO) employee).getGender());

		System.out.println(((EmployeeGo) employee).getLocation());

		System.out.println(((EmployeeGo) employee).calculateSalary());

		System.out.println(((EmployeeGo) employee).calculateCommission());

		employee.personalDevelopmentBudget();

		((EmployeeGo) employee).benefitLayout();

		employee.job();

		employee.function();

		System.out.println();

		((EmployeeGo) employee).calculateEmployeePension();

		((EmployeeGO) employee).calculateEmployeeBonus();


	}
