import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int code, quantity;
        double pagar;
        
        System.out.print("Purchased product code: ");
        code = sc.nextInt();
        System.out.print("Enter the quantity purchased: ");
        quantity = sc.nextInt();

        pagar = 0;
        if (code == 1) {
            pagar = quantity * 5.00;
        }
        else if (code == 2) {
            pagar = quantity * 3.50;
        }
        else if (code == 3 ) {
            pagar = quantity * 4.80;
        }
        else if (code == 4) {
            pagar = quantity * 8.90;
        }
        else if (code == 5) {
            pagar = quantity * 7.32;
        }

        System.out.printf("Amount payable: R$ %.2f\n", pagar);
        
        sc.close();
    }
}
