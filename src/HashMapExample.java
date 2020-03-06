
// Java program illustrating use of HashMap methods - 
// put(), get(), isEmpty() and size() 
import java.util.*; 
public class HashMapExample 
{ 
	public static void main(String args[]) 
	{ 
		// Creation of HashMap
		HashMap<String, List<String>> hash = new HashMap<>();
		List<String> map = new ArrayList<String>();
		
		// Adding values to HashMap as ("keys", "values") 
		
		map.add("Java");
		map.add("C++");
		hash.put("Language", map); 
//		hash.put("Platform", map); 
//		hash.put("Code", map); 
//		hash.put("Learn", map); 
		

		System.out.println("Testing .isEmpty() method"); 

		// Checks whether the HashMap is empty or not 
		// Not empty so printing the values 
		if (!hash.isEmpty()) 
		{ 
			System.out.println("HashMap  is notempty"); 

			// Accessing the contents of HashMap through Keys 
			System.out.println("Langauge : " + hash.get("Language")); 
//			System.out.println("YYYY : " + hash.get("Platform")); 
//			System.out.println("ZZZZ : " + hash.get("Code")); 
//			System.out.println("WWWW : " + hash.get("Learn")); 

			// size() method prints the size of HashMap. 
			System.out.println("Size Of HashMap : " + hash.size()); 
		} 
	} 
} 
