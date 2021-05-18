package exception;

import java.util.InputMismatchException;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCatch m = new MultipleCatch();
		m.getDetails();
	}

	

	public void getDetails() {
		// TODO Auto-generated method stub
		try
		{   
	    Scanner sc = new Scanner(System.in);
		   String name = sc.next();
		Scanner sc1 = new Scanner(System.in);
		    int id = sc1.nextInt();
		
			int EmpSalary[] = new int[5];
			for(int i=0;i<5;i++)
			{
				EmpSalary[i] =10000;
			}
			
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Type mismatch");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("check array length");
		}
		catch (Exception e)
		{
			System.out.println("incorrect");
		}
		
		finally
		{
			System.out.println("close program");
		}
		
	}

}
