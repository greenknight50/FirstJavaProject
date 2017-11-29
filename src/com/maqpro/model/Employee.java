package com.maqpro.model;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String empDept;
	private double empSalary;
	private String empCity;

	public Employee() {

	}

	public Employee(int empId, String empName, String empDept, double empSalary, String empCity) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
		this.empCity = empCity;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}

}
