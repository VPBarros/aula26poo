import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
		//Vetores POO Alturas
		//Programa para ler nome,idade e altura de N pessoas.Depois mostrar na tela altura media das pessoas
		//e mostar too a porcentagem de pessoas com menos de 16 anos bem como os nomes dessas pessoas se houver.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[]alturas  = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();

		}
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		double mediaAlturas = soma /n;
		
		System.out.println();
		System.out.printf("Altura media: %.2f%n", mediaAlturas);
		
		int cont = 0;
		for(int i=0; i<n; i++) {
			if(idades[i]< 16) {
				cont = cont + 1;
			}
		}
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent );
		for (int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		
       sc.close();
    }
}
