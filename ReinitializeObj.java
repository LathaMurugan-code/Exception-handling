package garbagecollector;

public class ReinitializeObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReinitializeObj r = new ReinitializeObj();
		ReinitializeObj s=r;
		s=null;
		r=null;
	    Runtime.getRuntime().gc();
	}
	public void finalize() {
		System.out.println("collect 'r' object");
	}

}
