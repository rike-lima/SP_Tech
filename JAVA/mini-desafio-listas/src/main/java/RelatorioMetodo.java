import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelatorioMetodo {

    Integer buscarQuantidadeVendas (List<Double> precos ){
        Integer quantidadeVenda = precos.size();
        return quantidadeVenda;
    }

    Double somarVendas (List<Double> soma){
        Double resultadoSoma = 0.0;

        for (int i = 0; i < soma.size(); i++) {
            resultadoSoma += soma.get(i);
        }
        return resultadoSoma;
    }

    Boolean buscarPreco(List<Double> precos){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor que deseja pesquisar:");
        Double pesquisa = leitor.nextDouble();

        for (int i = 0; i < precos.size(); i++) {
            Double precoAtual = precos.get(i);
             if (pesquisa.equals(precoAtual)){
                return true;
             }
        }
           return false;
    }

    Double buscarMaiorPreco(List<Double> precos){
        Double maiorPrecoDaLista = 0.0;

        for (int i = 0; i < precos.size(); i++) {
            Double precoAtual = precos.get(i);
            if (precoAtual>maiorPrecoDaLista){
                maiorPrecoDaLista = precoAtual;
            }
        }

        return maiorPrecoDaLista;
    }

    Double buscarMenorPreco(List<Double> precos){
        Double menorPrecoDaLista = precos.get(1);

        for (int i = 0; i < precos.size(); i++) {
            Double precoAtual = precos.get(i);
            if (precoAtual<menorPrecoDaLista){
                menorPrecoDaLista = precoAtual;
            }
        }

        return menorPrecoDaLista;
    }

    List<Double> buscarPorPrecoMinimo (List<Double> precos){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor minimo que deseja pesquisar:");
        Double pesquisa = leitor.nextDouble();

        List<Double> resultadoPesquisa = new ArrayList<>();

        for (int i = 0; i < precos.size(); i++) {
            Double precoAtual = precos.get(i);

            if (precoAtual>=pesquisa){
                resultadoPesquisa.add(precoAtual);
            }

        }

        return resultadoPesquisa;


    }




}
