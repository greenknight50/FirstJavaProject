package com.maqpro.exceptions;

public class TryCatchExceptionMain {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 6, 2 };
		try {
			System.out.println("Start of try block");
			System.out.println("arr at index 0: " + arr[115]);
			System.out.println("End of try block");
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Message from ArrayIndexOutOfBoundsException catch: " + ex.getMessage());
			//System.exit(0);
		} catch (Exception ex) {
			System.out.println("Message from Exception catch: " + ex.getMessage());
		} finally {
			//close data base conn, file i/o stream. 
			System.out.println("Inside finally block");
		}
	}

}
