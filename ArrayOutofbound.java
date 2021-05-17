package exception;

public class ArrayOutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		int[] arr = new int[4];
		for(int i=0;i<5;i++)
		{
			arr[i]=5;
		}

	}
		catch(Exception e)
		{
			System.out.println("out of length");
		}
	}

}
