package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EmployeeDB {
	private int id;
	private String name;
	private String email;
	private String gender;
	private Double salary;
	
	public EmployeeDB(int id, String name, String email, String gender, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ",gender=" + gender + ", salary=" + salary + "]";
	}
}

public class Employee {

	public static void main(String[] args) {
		List<EmployeeDB> list = new ArrayList<>();
		
		list.add(new EmployeeDB(301, "sarvani", "g.v.sarvani@gmail.com","Female", 20000.0));
		list.add(new EmployeeDB(302, "Haritha", "haritha@gmail.com", "Female", 30000.0));
		list.add(new EmployeeDB(303, "Jayanth", "Jay@gmail.com","Male", 25000.0));
		
		
		Iterator<EmployeeDB> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			EmployeeDB emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}