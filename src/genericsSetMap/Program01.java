package genericsSetMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product5;
import services.CalculationService;

public class Program01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product5> list = new ArrayList<>();
		
		String path = "C:\\temp\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product5(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product5 x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
