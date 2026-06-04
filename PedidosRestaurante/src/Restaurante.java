import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Restaurante {
    public static void main(String[] args) {
        ExecutorService cozinha =
                newFixedThreadPool(2);

        cozinha.execute(
                new Cozinheiro(
                        new Pedido(1, "Lasanha", "David")));

        cozinha.execute(
                new Cozinheiro(
                        new Pedido(2, "Feijoada", "Maria")));

        cozinha.execute(
                new Cozinheiro(
                        new Pedido(3, "Hambúrguer", "João")));

        cozinha.shutdown();
    }
}
