package arraysListas;

import java.util.Scanner;

public class ExercicioMatriz01 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (number == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
						if (j-1 >= 0) {
							System.out.println("Left: " + mat[i][j-1]);
						}
						if (j < mat[i].length) {
							System.out.println("Right: " + mat[i][j+1]);
						}
						if (i-1 >= 0) {
							System.out.println("Up: " + mat[i-1][j]);
						}
						if (i < mat.length) {
							System.out.println("Down: " + mat[i+1][j]);
						}
				}
			}
		}
		
		sc.close();
	
	}
	
}
