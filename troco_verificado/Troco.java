import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int quantidade;
        double preco, dinheiroRecebido, troco, diferenca;

        System.out.print("Preco unitario do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.print("Dinheiro Recebido: ");
        dinheiroRecebido = sc.nextDouble();

        

        if (dinheiroRecebido >= (quantidade * preco)) {
            troco = dinheiroRecebido - (preco * quantidade);
            System.out.printf("TROCO = %.2f", troco);
        } 
        else {
            diferenca = preco * quantidade - dinheiroRecebido;
            System.out.printf("Dinheiro insuficiente. Faltam R$ %.2f Reais%n", diferenca);
        }


        sc.close();
    }
}
