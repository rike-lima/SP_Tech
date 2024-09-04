import java.util.Scanner;

public class CalculoCalorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o tempo de aquecimento:");
        Integer tempoAquecimento = leitor.nextInt();
        System.out.println("Informe o tempo de exercício aeróbico:");
        Integer tempoAerobico = leitor.nextInt();
        System.out.println("Informe o tempo de musculação:");
        Integer tempoMusculacao = leitor.nextInt();

        Integer caloriasAquecimento = tempoAquecimento*12;
        Integer caloriasAerobico = tempoAerobico*20;
        Integer caloriasMusculacao = tempoMusculacao*25;
        Integer tempoTotal= (tempoAerobico+ tempoAquecimento+ tempoMusculacao);

        Integer caloriasGastas = (caloriasAerobico+ caloriasAquecimento + caloriasMusculacao);

        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", tempoTotal, caloriasGastas));


    }
}
