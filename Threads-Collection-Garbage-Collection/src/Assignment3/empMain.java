package Assignment3;

public class empMain {

	public static void main(String[] args) {

		EmployeeDB empDB = new EmployeeDB();

		Employee emp1 = new Employee(101, "Rahul", 25000, 'M', "rahul@abc.com");
		Employee emp2 = new Employee(102, "Shubha", 30000, 'F', "shubha@abc.com");
		Employee emp3 = new Employee(103, "John", 20000, 'M', "john@abc.com");

		empDB.addEmployee(emp1);
		empDB.addEmployee(emp2);
		empDB.addEmployee(emp3);

		for (Employee emp : empDB.listAll())
			System.out.println(emp.getEmployeeDetails());

		System.out.println();
		
		empDB.deleteEmployee(103);

		for (Employee emp : empDB.listAll())
			System.out.println(emp.getEmployeeDetails());

		System.out.println();

		System.out.println(empDB.showPaySlip(101));
	}
}
