package genericsSetMap;

import entities.Client1;

public class Program05 {

	public static void main(String[] args) {
		
		
		Client1 c1 = new Client1("Maria", "maria@gmail.com");
		Client1 c2 = new Client1("Maria", "maria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		System.out.println(s1 == s2);

	}

}
