import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um número de 0 a 10:");
        Integer numeroEscolhido = leitor.nextInt();
        if (numeroEscolhido<0 || numeroEscolhido>10){
            System.out.println("Insira um número válido:");
            numeroEscolhido= leitor.nextInt();
        }

        Nivelamento metodo = new Nivelamento();

        Integer tentativas = metodo.loteria(numeroEscolhido);

        if (tentativas<=3){
            System.out.println("Você é muito sortudo");
        } else if (tentativas<=10) {
            System.out.println("Você é sortudo");
        } else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
