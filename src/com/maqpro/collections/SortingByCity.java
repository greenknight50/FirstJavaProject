package com.maqpro.collections;

import java.util.Comparator;

import com.maqpro.model.Employee;

public class SortingByCity implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpCity().compareTo(o2.getEmpCity());
	}

}
