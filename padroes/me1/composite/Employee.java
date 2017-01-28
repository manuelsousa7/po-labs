import java.util.*;

public class Employee {
	private String _name;
	private Integer _salary;
	private String _depart;
	private List<Employee> _subordinates;

	public Employee(String name, String dep, Integer sal) {
		_name = name;
		_depart = dep;
		_salary = sal;
		_subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		_subordinates.add(e);
	}

	public void remove(Employee e) {
		_subordinates.remove(e);
	}
	public List<Employee> getSubordinates() {
		// I dont give a fuck about privacy leaks
		return _subordinates;
	}

	public String toStringg() {
		return "~ Name: " + _name + " ~ Salary: " + _salary + " ~ Department: " + _depart;
	}
}