import java.util.concurrent.ThreadLocalRandom;

public class Nivelamento {

    Integer loteria(Integer numeroEscolhido){
        Integer tentativas = 0;
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0,11);

        for (int i = 1; !numeroAleatorio.equals(numeroEscolhido) ; i++) {
            numeroAleatorio= ThreadLocalRandom.current().nextInt(0,11);
            tentativas= i;
            System.out.println(numeroAleatorio);
        }

        return tentativas;
    }


}
