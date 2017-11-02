package com.maqpro.somepackage;

import com.maqpro.www.FirstMain;

public class DemoMain extends FirstMain {

	public static void main(String[] args) {
		
		/*FirstMain firstMain = new FirstMain();
		firstMain.us*/
		DemoMain demoMain = new DemoMain();
		demoMain.userName = "Ashraf";
		
		/*for (int i = 0; i < 10; i++) {
			System.out.println(i);	// 0 to 9
		}
		System.out.println("Same for loop with preincrement.\n");
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);  // 1 to 9
		}*/
		boolean boolValue = true;
		boolean someBool = !boolValue;
		int val1 = 50, val2 = 55;
		int val3;
		if (val1 > val2 || val1 == val2) {
			val3 = val1;
		} else {
			val3 = val2;
		}
		val3 = (val1 > val2) ? val1 : (val1 == val2 ? val1 : val2 );
		System.out.println("highest: " + val3);
	}

}
