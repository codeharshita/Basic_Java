package Programs;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		 Map<String, Integer> numbers = new HashMap<>();
		
		 
		 numbers.put("one", 1);
		  numbers.put("two", 2);
		  numbers.put("five", 5);
		  
		  System.out.println(numbers);
		  System.out.println(numbers.get("two"));
		  
		 numbers.put("India", 104);
		 numbers.put("five", 56);
		 numbers.put("Utopia", 98);
		 
		 System.out.println(numbers);
		 System.out.println(numbers.get("Utopia"));
		 System.out.println(numbers.containsKey("Ireland"));
		 System.out.println(numbers.containsKey("India"));
		  //Set 
		 
		 Set<String> keys = numbers.keySet();
		 
		System.out.println(keys);
		
		for(String key: numbers.keySet()) {
			Integer val = numbers.get(key);
			System.out.println(key+ " " + val);
		}
		  
	//TimeComplexity of hashmap is always O(1).	 
		 
//		 System.out.println(numbers);
//	
//		System.out.println(numbers.values());
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.entrySet());
		
		
		
	}

}
