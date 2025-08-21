import java.util.HashMap;

public class H3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "Red");
		hs.put(2, "Green");
		hs.put(3, "Black");
		
		System.out.println("Values in first map: "+hs);
		
       HashMap<Integer,String> hs1=new HashMap<Integer,String>();
		
		hs1.put(4, "White");
		hs1.put(5, "Blue");
		hs1.put(6, "Orange");
		
		System.out.println();
		System.out.println("Values in second map: "+hs1);
		
		hs.putAll(hs1);
		
	    System.out.println();
		System.out.println("Now values in second map: "+hs);

	}

}
//Test input:
//{1=Red, 2=Green, 3=Black}
//
//{4=White, 5=Blue, 6=Orange}
//
//
//Sample output:Values in first map: {1=Red, 2=Green, 3=Black}
//Values in second map: {4=White, 5=Blue, 6=Orange}
//Now values in second map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue, 6=
//Orange}