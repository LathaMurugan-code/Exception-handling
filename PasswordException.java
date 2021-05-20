package exception;

import java.util.Scanner;

public class PasswordException extends Exception{

	public static void main(String[] args){
		// TODO Auto-generated method stub

		PasswordException p = new PasswordException();
		try {
		p.verifyPwd();
		}
		catch(PasswordException pe)
		{
			System.out.println("password is too short");
		}
		
			
		}
	public void verifyPwd()throws PasswordException
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		if(s.length()<8)
		{
			throw this;
		}
	}

}
