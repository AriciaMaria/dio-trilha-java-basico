import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            Double ValorDoce = valorAleatorio();
            if (ValorDoce > mesada)
            ValorDoce = mesada;

            System.out.println("Doce do valor: " + ValorDoce + " Adicionado no carrinho");
            mesada = mesada -ValorDoce;

        }

              System.out.println("Mesada:" + mesada);
              System.out.println("Joãozinho gastou toda a sua mesado em doces");

    }

    private static double  valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);


    }

}