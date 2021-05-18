package exception;

public class ArrayOutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		int[] arr = new int[5];
		arr[0]=76;
		arr[1]=65;
		arr[2]=84;
		arr[3]=72;
		arr[4]=65;
		
		for(int i=0;i<5;i++)
		{
			System.out.print((char)arr[i]+" ");
		}

	}
		catch(Exception e)
		{
			System.out.println("out of length");
		}
	}

}
