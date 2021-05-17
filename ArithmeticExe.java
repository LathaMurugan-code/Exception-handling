package exception;

import java.util.Scanner;

public class ArithmeticExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExe a = new ArithmeticExe();
		a.divide(100,0);

	}

	public void divide(int  n1, int n2) {
		// TODO Auto-generated method stub
		try 
		{
		int result =n1/n2;
		System.out.println(result);
		}
		catch(ArithmeticException ae) {
			System.out.println("enter divisor other than Zero");
		}
		
	}

}
