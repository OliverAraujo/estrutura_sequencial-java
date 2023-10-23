import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        double soma, media;
    
        System.out.print("How many number will you typer? ");
        n = sc.nextInt();

        double [] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Enter a number: ");
            vetor[i] = sc.nextDouble();
        }

        // valores 
        soma = 0;

        for (int i=0; i<n; i++) {
            soma = soma + vetor[i];
        }

        media = soma / n;
        System.out.print("VALORES: ");
        
        for (int i=0; i<n; i++) {
            System.out.printf("%.1f%n", vetor[i]);
        }
        
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);


        sc.close();
    }
}
