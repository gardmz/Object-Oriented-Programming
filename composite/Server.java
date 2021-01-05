package composite;

public class Server implements Employee {
	private String name;
	private long empId;
	private String position;
	private int salary;

	public Server(long empId, String name, String position, int salary) {
		this.empId = empId;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public void employeeToString() {
		System.out.println("Employee ID: " + empId + "\nEmployee Name/Posistion: " + name + " / " + position + "\nSalary: " + salary+"K\n");
	}
}
