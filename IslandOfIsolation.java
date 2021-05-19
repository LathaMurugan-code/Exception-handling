package garbagecollector;

public class IslandOfIsolation {
	IslandOfIsolation l;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandOfIsolation i = new IslandOfIsolation();
		IslandOfIsolation j = new IslandOfIsolation();
		IslandOfIsolation k = new IslandOfIsolation();
		i.l = j;
		j.l = k;
		k.l = i;
		i= null;
		j=null;
		k=null;
		System.gc();
		
		

	}
	protected void finalize() {
		System.out.println("garbage collected");
	}

}
