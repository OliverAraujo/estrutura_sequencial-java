import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, maior;

        System.out.print("Digite as tres distancias: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a > b && a > c) {
            maior = a;
            System.out.printf("Maior distancia = %.2f%n", maior);
        }
        else if (b > c ) {
            maior = b;
            System.out.printf("Maior distancia = %.2f%n", maior);
        }
        else {
            maior = c;
            System.out.printf("Maior distancia = %.2f%n", maior);
        }

        sc.close();
    }
}
