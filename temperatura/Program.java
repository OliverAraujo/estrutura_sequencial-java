import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char tipo;
        double C, F;

        System.out.print("Voce vai a temperatura em qual escala (C/F)? ");
        tipo = sc.next().charAt(0);

        if (tipo == 'F') {
            System.out.print("Digite a temperatura em Farenheit: ");
            F = sc.nextDouble();
            C = (F-32.0) / 1.8;
            System.out.printf("Temperatura equivalente em celsius: %.2f%n", C);
        }
        else if (tipo == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            C = sc.nextDouble();
            F = (C * 1.8) + 32.0;
            System.out.printf("Temperatura equivalente a Farenheit: %.2f%n", F);
        }
        else {
            System.out.println("Valor invalido\n");
        }

        sc.close();
    }
}
