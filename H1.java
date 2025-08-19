import java.util.HashMap;

public class H1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "Red");
		hs.put(2, "Green");
		hs.put(3, "Black");
		hs.put(4, "White");
		hs.put(5, "Blue");
 
	    System.out.println("Test input= "+hs);
	    
	    System.out.println();
	    System.out.println("Sample Output:");
	    for(int i=1;i<1+hs.size();i++)
	    {
	    	System.out.println(""+i+" "+hs.get(i));
	    }
	}

}
//Test input:
//1 Red 2 Green 3 Black 4 White 5 Blue
//
//Sample Output:
//1 Red 
//2 Green
//3 Black
//4 White
//5 Blue