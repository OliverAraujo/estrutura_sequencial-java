import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // media igual a 60.0 - fazer programa com media de nota, maior que 60 = aprovado, menor que 60 = reprovado
        double primeiro, segundo, notaFinal;

        System.out.printf("Digite a primeira nota: ");
        primeiro = sc.nextDouble();
        System.out.println();
        System.out.printf("Digite a segunda nota: ");
        segundo = sc.nextDouble();
        System.out.println();

        notaFinal = primeiro + segundo;


        if (notaFinal > 60.0) {
            System.out.printf("Nota final =  " + notaFinal);
            System.out.println(" APROVADO"); 
        }
        else {
            System.out.printf("Nota final =  " + notaFinal);
            System.out.println(" REPROVADO");
        }
        
        sc.close();
    }
}
