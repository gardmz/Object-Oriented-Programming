package composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements Employee {
	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void employeeToString() {
		for (Employee emp : employeeList) {
			emp.employeeToString();
		}
	}

	public void add(Employee emp) {
		employeeList.add(emp);
	}

	public void remove(Employee emp) {
		employeeList.remove(emp);
	}
}
