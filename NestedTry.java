package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedTry n = new NestedTry();
		n.methodCall();
		}

	public void methodCall() {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Roll no");
				 sc.nextInt();
				
			}
			catch(InputMismatchException i)
			{
				System.out.println("Enter Integer type");
				System.out.println(i);
				System.out.println(i.getMessage());
				i.printStackTrace();
			}
			try
			{
				int n1=10;
				int n2=0;
				n2=n1/n2;
			}
			catch (ArithmeticException ae)
			{
				System.out.println("check divisor");
				System.out.println(ae);
				System.out.println(ae.getMessage());
				ae.printStackTrace();
			}
		}
		catch(Exception ex) {
			System.out.println("trapped exception");
			System.out.println(ex);
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
		
	}

}
