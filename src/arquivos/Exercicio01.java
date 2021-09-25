package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String pathIn = sc.nextLine();
		
		if (pathIn != null) {
			
			File folderIn = new File(pathIn);
			
			if (folderIn.exists()) {
				
				File[] files = folderIn.listFiles(File::isFile);
				
				for (File file: files) {

					if (getFileExtension(file.toString()).equals("csv")) {
						
						try (BufferedReader br = new BufferedReader(new FileReader(file))) {
							
							String line = br.readLine();
							List<Sale> sales = new ArrayList<>();
							String[] vect;
							
							while (line != null) {
								vect = line.split(",");
								try {
									sales.add(new Sale(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2])));
								}
								catch (NumberFormatException e) {
									e.getMessage();
								}
								line = br.readLine();
							}
							
							if (sales != null) {
								
								String pathOut = pathIn + "\\out";
								String fileOut = pathOut + "\\summary.csv";
								File folderOut = new File(pathOut);
								boolean folderOutOk = folderOut.exists();
								
								if (!folderOutOk) {
									folderOutOk = new File(pathOut).mkdir();
								}
								
								if (folderOutOk) {
									try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
										for (Sale prod : sales) {
											bw.write(prod.toString());
											bw.newLine();
										}
										System.out.println("File created successfully: " + fileOut);
									}
									catch (IOException e) {
										e.printStackTrace();
									}
								}
								else {
									System.out.println("It wasn't possible to create the directory: " + pathOut);
								}
								
							}
							
							/*for (Sale prod: sales) {
								System.out.println(prod);
							}*/
						
						}
						catch (IOException e) {
							System.out.println("Error: " + e.getMessage());
						}
						
					}
				}
				
			}
		}
		
		

		/*try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
			String line = br.readLine();
			List<Sale> sales = new ArrayList<>();
			String[] vect;
			
			while (line != null) {
				vect = line.split(",");
				sales.add(new Sale(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2])));
				//System.out.println(line);
				line = br.readLine();
			}
			
			if (sales != null) {
				
			}
			
			for (Sale prod: sales) {
				System.out.println(prod);
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}*/
		
		sc.close();

	}
	
    static String getFileExtension(String filename) {
        if (filename.contains("."))
            return filename.substring(filename.lastIndexOf(".") + 1);
        else
            return "";
    }

}
