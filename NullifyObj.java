package garbagecollector;

public class NullifyObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullifyObj n = new NullifyObj();
		n=null;
		Runtime r =Runtime.getRuntime();
	     r.gc();
	     
		

	}
public void finalize() {
	System.out.println("nullify object");
	
}
}
