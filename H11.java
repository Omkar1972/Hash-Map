import java.util.HashMap;
import java.util.Set;

public class H11 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "Red");
		hs.put(2, "Green");
		hs.put(3, "Black");
		hs.put(4, "White");
		hs.put(5, "Blue");
		
		System.out.println(hs);
		
		
		Set<Integer> hs1= hs.keySet();
		
		
		System.out.println();
		System.out.println("Key set values are: "+hs1);
	}

}

