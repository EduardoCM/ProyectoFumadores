/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fumadores;

public class Mesa {

    private Papel papel;
    private Tabaco tabaco;
    private Cerillo cerillo;

    public synchronized Cigarro obtenerCigarro() {
        while (papel == null || tabaco == null || cerillo == null) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        Cigarro c = new Cigarro(papel, tabaco, cerillo);
        papel = null;
        tabaco = null;
        cerillo = null;
        System.out.println("Me voy a echar este cigarrin: " + c);
        notifyAll();
        return c;
    }

    public void colocarProducto(Producto p) {
        if (p instanceof Papel) {
            setPapel((Papel) p);
        } else if (p instanceof Tabaco) {
            setTabaco((Tabaco) p);
        } else if (p instanceof Cerillo) {
            setCerillo((Cerillo) p);
        }
    }

    public synchronized void setPapel(Papel papel) {
        while (this.papel != null) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.papel = papel;
        System.out.println("Se creo papel");
        notifyAll();
    }

    public synchronized void setTabaco(Tabaco tabaco) {
        while (this.tabaco != null) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.tabaco = tabaco;
        System.out.println("Se creo tabaco");
        notifyAll();
    }

    public synchronized void setCerillo(Cerillo cerillo) {
        while (this.cerillo != null) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.cerillo = cerillo;
        System.out.println("Se creo cerillo");
        notifyAll();
    }
}
