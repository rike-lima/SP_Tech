import java.util.Scanner;

public class CalculoRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 você possui?");
        Integer filhosAte3 = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 você possui?");
        Integer filhosAte16 = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 você possui?");
        Integer filhosAte18 = leitor.nextInt();

        Double bolsaFamilia = 0.00;
        Double bolsaAte4= 25.12;
        Double bolsaAte16= 15.88;
        Double bolsaAte18= 12.44;

        if (filhosAte3>=1){
            bolsaFamilia += (bolsaAte4*filhosAte3);
        } if (filhosAte16>=1) {
            bolsaFamilia += (bolsaAte16*filhosAte16);
        }if (filhosAte18>=1){
            bolsaFamilia += (bolsaAte18*filhosAte18);
        }

        Integer quantidadeFilhos = (filhosAte3+ filhosAte16+ filhosAte18);

        System.out.println(String.format("""
         Você tem um total de %d filhos e vai receber R$%.2f de bolsa""",quantidadeFilhos, bolsaFamilia));


    }
}
