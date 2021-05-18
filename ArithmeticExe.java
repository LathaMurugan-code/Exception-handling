package exception;

import java.util.Scanner;

public class ArithmeticExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExe a = new ArithmeticExe();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend");
		int n1= sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter divisor");
		int n2= sc1.nextInt();
		
		a.divide(n1,n2);

	}

	public void divide(int  n1, int n2) {
		// TODO Auto-generated method stub
		try 
		{
		int res =n1/n2;
		System.out.println(res);
		}
		catch(ArithmeticException ae) {
			//System.out.println(ae.getMessage());
			System.out.println("enter divisor other than Zero");
		}
			
		System.out.println("latha");
		
	}

}
