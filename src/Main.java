import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Date data = new Date();
		Calendar c = Calendar.getInstance();
		int y = 5;
		double x = 10.35784;
		String unidadeMedida = "metros";
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		int x1;
		double y1;
		//double b, B, h, area;
		float b, B, h, area;
		int a1, b1;
		double resultado;
		double a2;
		int b2;
		
		System.out.println("Olá mundo!");
		System.out.println("Tchau mundo!");
		System.out.print("São "+data.getHours()+" "+c.get(Calendar.HOUR_OF_DAY)+" horas da manhã.");
		System.out.println();
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = "+x+" metros.");
		System.out.printf("Resultado = %.2f metros.%n", x);
		System.out.printf("Resultado = %.2f %s.%n", x,unidadeMedida);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome,idade,renda);
		JOptionPane.showMessageDialog(null,"teste");
		
		x1 = 5;
		y1 = 2 * x1;
		
		System.out.println(x1);
		System.out.println(y1);

		/*b = 6.0;
		B = 8.0;
		h = 5.0;*/
		
		b = 6f;
		B = 8f;
		h = 5f;
		
		area = (b + B) / 2f * h;
		
		System.out.println("A área do trapézio é igual a "+area);
		
		a1 = 5;
		b1 = 2;
		
		resultado = (double) a1 / b1;
		
		System.out.println(resultado);
		
		a2 = 5.0;
		b2 = (int) a2;
		
		System.out.println(a2);
		
	}

}
