package com.maqpro.control.statements;

public class ControlStatementsMain {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		int array2[] = { 3, 5, 8, 1, 3, 10, 6 };
		System.out.println("array1[0] = " + array1[0]);
		System.out.println("array2[5] = " + array2[5]);
		array1[0] = 82;
		array1[4] = 73;
		System.out.println("array2.length: " + array2.length);
		System.out.println("array2[7]:  " + array2[6]);

		int[][] students = new int[2][5];
		System.out.println("array2Dimen[1][4]: " + students[1][4]);
		students[0][0] = 11;
		students[0][1] = 22;
		students[0][2] = 33;
		students[0][3] = 44;
		students[0][4] = 55;

		students[1][0] = 66;
		students[1][1] = 77;
		students[1][2] = 5454;
		students[1][3] = 88;
		students[1][4] = 99;

		int[][] employeeIds = { { 12, 13, 14, 15 }, { 22, 23, 24, 25 } };

		double[][] cities = { { 23.32, 45.45 }, { -71.21, 90.23 } };
		System.out.println("students[0][4]: " + students[0][4]);
		System.out.println("employeeIds[1][1]: " + employeeIds[1][1]);

		double[] atlanta = cities[1];
		double AtlLat = atlanta[0];
		double AtlLon = atlanta[1];
		System.out.println("Atlanta lats: " + AtlLat + ", Atlanta longs: " + AtlLon);

		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

		for (int i = 0; i < employeeIds.length; i++) {
			for (int j = 0; j < employeeIds[i].length; j++) {
				System.out.println("employeeIds[" + i + "][" + j + "] = " + employeeIds[i][j]);
			}
		}
		System.out.println("End of main method");
	}

}
