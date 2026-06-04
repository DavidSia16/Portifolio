import java.util.Random;

public class Cozinheiro implements Runnable {
    private Pedido pedido;

    public Cozinheiro(Pedido pedido) {
        this.pedido = pedido;
    }


    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        int tempoPreparo = 0;
        System.out.println(nomeThread + " iniciou o preparo do pedido" +
                pedido.getId() + " de " + pedido.getCliente());
        try {
            Random random = new Random();

              tempoPreparo = random.nextInt(5000) + 1000;

            Thread.sleep(tempoPreparo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(nomeThread + " finalizou o pedido" +
                pedido.getId() +" tempo: " + tempoPreparo + " segundos");
    }
    }
