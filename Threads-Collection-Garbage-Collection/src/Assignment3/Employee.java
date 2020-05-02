package Assignment3;

public class Employee {

	private int eCode;
	private String EmpName;
	private float salary;
	private char gender;
	private String email;

	public Employee(int eCode, String empName, float salary, char gender, String email) {
		super();
		this.eCode = eCode;
		this.EmpName = empName;
		this.salary = salary;
		this.gender = gender;
		this.email = email;
	}

	public int geteCode() {
		return eCode;
	}

	public void seteCode(int eCode) {
		this.eCode = eCode;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.EmpName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeDetails() {
		return "Employee [EmpId=" + eCode + ", EmpName=" + EmpName + ", salary=" + salary + ", gender=" + gender
				+ ", email=" + email + "]";
	}

}
