import java.util.Random;

public class Pedido {
    private int id;
    private String prato;
    private String cliente;

    public Pedido(int id, String prato, String cliente) {
        this.id = id;
        this.prato = prato;
        this.cliente = cliente;

        Random random = new Random();
        int tempo = random.nextInt(5000) + 1000;
    }

    public int getId() {
        return id;
    }
    public String getPrato() {
        return prato;
    }
    public String getCliente() {
        this.cliente = cliente;
        return cliente;
    }

}
