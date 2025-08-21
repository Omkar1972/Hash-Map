import java.util.Collection;
import java.util.HashMap;

public class H12 {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "Red");
		hs.put(2, "Green");
		hs.put(3, "Black");
		hs.put(4, "White");
		hs.put(5, "Blue");
		
		System.out.println(hs);
		
		Collection<String> hs1=hs.values();
		
		System.out.println();
		System.out.println("Collection view is: "+hs1);

	}

}

