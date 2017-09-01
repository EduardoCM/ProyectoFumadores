
package fumadores;

public class Fumalongo extends Thread{
    private Mesa mesa;
    public Fumalongo(Mesa mesa, String name) {
        super(name);
        this.mesa = mesa;
    }
    public boolean estaVivo(){
        return true;
    }

    @Override
    public void run() {
        while(true){
            Cigarro c=mesa.obtenerCigarro();
        }
    }
    
}
