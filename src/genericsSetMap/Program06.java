package genericsSetMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program06 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();//TreeSet<>();//HashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) >= 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
