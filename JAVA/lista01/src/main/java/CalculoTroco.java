import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Double precoLeite = 12.90;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade comprada do produto:");
        Integer quantidade = leitor.nextInt();
        Double valorTotal = (quantidade*precoLeite);
        System.out.println("Valor total da compra é de R$%.2f". formatted(valorTotal));
        System.out.println("Pagamento recebido:");
        Double pagamento = leitor.nextDouble();

        Double troco = (pagamento-valorTotal);

        System.out.println("Seu troco será de R$%.2f".formatted(troco));

    }
}
