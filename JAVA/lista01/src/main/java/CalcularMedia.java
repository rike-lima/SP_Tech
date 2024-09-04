import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nomeUser = leitor.next();
        System.out.println("Informe a primeira nota:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota:");
        Double nota2 = leitor.nextDouble();

        Double media = (nota1+nota2)/2;

        System.out.println(String.format("Olá, %s. Sua média foi de %.2f.", nomeUser, media));


    }
}
