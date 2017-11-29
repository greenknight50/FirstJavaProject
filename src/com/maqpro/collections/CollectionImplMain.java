package com.maqpro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.maqpro.model.Employee;

public class CollectionImplMain {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(104, "Bolbao", "Maintainance", 4000.00, "New York"));
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("John");
		emp1.setEmpCity("Chicago");
		emp1.setEmpDept("IT Dept");
		emp1.setEmpSalary(5000.0);
		employees.add(emp1);
		employees.add(new Employee(103, "Rocky", "R and D", 6000.00, "Boston"));
		employees.add(new Employee(102, "Rambo", "Human Resources", 4000.00, "Atlanta"));
		System.out.println("Employees before sorting.");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		System.out.println("\n");
		Collections.sort(employees);
		System.out.println("Employees after sorting by id.");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		Collections.sort(employees, new SortByName());
		System.out.println("\n");
		System.out.println("Employees after sorting by name:");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		Collections.sort(employees, new SortBySalary());
		System.out.println("\n");
		System.out.println("Employees after sorting by salary:");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		Collections.sort(employees, new SortingByCity());
		System.out.println("\n");
		System.out.println("Employees after sorting by city:");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpDept().compareTo(o2.getEmpDept());
			}
		});
		System.out.println("\n");
		System.out.println("Employees after sorting by Department:");
		for (Employee emp : employees) {
			System.out.println("empId: " + emp.getEmpId() + ", empName: " + emp.getEmpName() + ", empDept: "
					+ emp.getEmpDept() + ", empSalary: " + emp.getEmpSalary() + ", empCity: " + emp.getEmpCity());
		}
		System.out.println("End of main method");
	}
}

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getEmpSalary() - o2.getEmpSalary());
	}
	
}
