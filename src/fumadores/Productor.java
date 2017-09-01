package fumadores;

public class Productor<T extends Producto> extends Thread {

    private Mesa mesa;
    private T producto;

    public Productor(Mesa mesa, String name,T producto) {
        super(name);
        this.mesa = mesa;
        this.producto=producto;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (Exception e) {
            }
            mesa.colocarProducto(producto);
        }
    }
}
