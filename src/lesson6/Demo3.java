package lesson6;

import java.util.ArrayList;

import lesson6.lab3.*;

public class Demo3 {

	public static void main(String[] args) {
		Employee fixedSalary = new FixedSalary("Clark", "Kent", "555-999-5555", 15000);
		Employee hourlySalary = new HourlySalary("Bruce", "Wayne", "555-111-5555", 20, 165);
		Employee commissionPay = new CommissionPay("Peter", "Parker", "555-111-5555", 95000, 0.06);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(fixedSalary);
		employees.add(hourlySalary);
		employees.add(commissionPay);
		
		for (Employee emp : employees) {
			System.out.println(emp);
			System.out.printf("earned $%.2f\n\n", emp.earnings());
		}
	}

}
