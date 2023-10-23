import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         
        double a, b, c, X1, X2, delta;

        System.out.print("Typer coefficient A: ");
        a = sc.nextDouble();
        System.out.print("Typer coefficient B: ");
        b = sc.nextDouble();
        System.out.print("Typer coefficient C: ");
        c = sc.nextDouble();

        delta = (b * b) - 4 * a * c;

        if (delta > 0 ) {
            X1 = (-b + Math.sqrt(delta))/ (2 * a);
            X2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.4f%n", X1);
            System.out.printf("X2 = %.4f%n", X2);

        }
        else {
            System.out.println("This equation, does not have a real root.");
        }


        sc.close();
    }
}
