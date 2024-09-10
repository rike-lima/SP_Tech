import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOperacoesMatematicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<String> operacoes = List.of("Somar", "Subtrair", "Multiplicar", "Sair");

        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println(String.format("""
                   %d - %s """,(i+1), operacoes.get(i)));
        }

        System.out.println("\nDigite a opção escolhida:");
        Integer opcao = leitor.nextInt();
        System.out.println("\nInforme o primeiro número:");
        Integer primeiroNumero = leitor.nextInt();
        System.out.println("\nInforme o segundo número:");
        Integer segundoNumero = leitor.nextInt();
        Integer resultado = 0;

while(opcao!=4) {
    for (int i = 0; i < operacoes.size(); i++) {
        System.out.println(String.format("""
                   %d - %s """,(i+1), operacoes.get(i)));
    }

    System.out.println("\nDigite a opção escolhida:");
    opcao = leitor.nextInt();
    System.out.println("\nInforme o primeiro número:");
    primeiroNumero = leitor.nextInt();
    System.out.println("\nInforme o segundo número:");
    segundoNumero = leitor.nextInt();
    resultado = 0;

    switch (opcao) {
        case 1:
            resultado = (primeiroNumero + segundoNumero);
            System.out.println("O resultado soma é %d".formatted(resultado));
            break;
        case 2:
            resultado = (primeiroNumero - segundoNumero);
            System.out.println("O resultado subtração é %d".formatted(resultado));
            break;
        case 3:
            resultado = (primeiroNumero * segundoNumero);
            System.out.println("O resultado multiplicação é %d".formatted(resultado));
            break;

        case 4:
            System.out.println("Programa encerrado!");
            break;
        default:
            System.out.println("Opção inválida, coloque outra");
    }

}
    }
}
