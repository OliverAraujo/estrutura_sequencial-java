import java.util.Locale;
import java.util.Scanner;

public class Menor_tres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, small;

        System.out.print("First number: ");
        a = sc.nextDouble();
        System.out.print("Second number: ");
        b = sc.nextDouble();
        System.out.print("Third number: ");
        c = sc.nextDouble();
                
        if (a <= b && a <= c) {
            small = a;
            System.out.println("MENOR = " + small);
            
        } 
        else if  (b <= c) {
            small = b;
            System.out.println("MENOR = " + small);
            
        } else {
            System.out.println("MENOR = ");
        }


        sc.close();
    }
}
