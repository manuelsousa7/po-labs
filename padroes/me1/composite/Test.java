public class Test {
	public static void main(String [] args) {
		Employee ceo = new Employee("Manuel", "CEO", 100000);
		Employee cto = new Employee("Vitor", "CTO", 10);
		ceo.add(cto);
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}