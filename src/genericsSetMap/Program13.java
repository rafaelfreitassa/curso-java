package genericsSetMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> total = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String candidato = fields[0];
				Integer votos = Integer.parseInt(fields[1]);
				
				if (total.containsKey(candidato)) {
					votos += total.get(candidato);
				}
				
				total.put(candidato, votos);
				
				line = br.readLine();
				
			}
			
			for (String key : total.keySet()) {
				System.out.println(key + ": " + total.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
		
		sc.close();

	}

}
