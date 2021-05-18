package exception;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t = new ThrowsExample();
		try
		{
		t.demoVidhya();
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public void demoVidhya()throws Exception
	{
		int []arr = new int[4];
		arr[-2]=-4;
	}

	
}
