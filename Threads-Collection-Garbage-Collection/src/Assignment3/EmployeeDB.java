package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {

	List<Employee> emp = new ArrayList<Employee>();

	public boolean addEmployee(Employee e) {
		return emp.add(e);
	}

	public boolean deleteEmployee(int eCode) {
		boolean isRemoved = false;

		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.geteCode() == eCode) {
				isRemoved = true;
				it.remove();
			}
		}
		return isRemoved;
	}

	public String showPaySlip(int eCode) {
		String paySlip = "Invalid employee Id";
		for (Employee e : emp) {
			if (e.geteCode() == eCode) {
				paySlip = "Pay slip for employee id " + eCode + " is " + e.getSalary();
			}
			break;
		}

		return paySlip;
	}

	public Employee[] listAll() {
		Employee[] empArray = new Employee[emp.size()];
		for (int i = 0; i < emp.size(); i++)
			empArray[i] = emp.get(i);
		return empArray;
	}
}
