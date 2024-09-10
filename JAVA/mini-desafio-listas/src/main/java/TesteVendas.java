import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVendas {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>(List.of(10.0,15.0,20.0,25.0,30.0,5.0,35.0,40.0,45.0,50.0));


        RelatorioMetodo metodo = new RelatorioMetodo();
        Integer buscaQtdeVendas = metodo.buscarQuantidadeVendas(precos);

        Double buscaSoma = metodo.somarVendas(precos);

        Boolean buscaDePreco = metodo.buscarPreco(precos);

        Double buscaMaiorPreco = metodo.buscarMaiorPreco(precos);

        Double buscaMenorPreco = metodo.buscarMenorPreco(precos);

        List<Double> resultadoPesquisa = metodo.buscarPorPrecoMinimo(precos);


        System.out.println(buscaQtdeVendas);
        System.out.println(buscaSoma);
        System.out.println(buscaDePreco);
        System.out.println(buscaMaiorPreco);
        System.out.println(buscaMenorPreco);
        System.out.println(resultadoPesquisa);



    }
}
