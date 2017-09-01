/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fumadores;

/**
 *
 * @author softtek
 */
class Cigarro {
    
    private Papel papel;
    private Tabaco tabaco;
    private Cerillo cerillo;

    public Cigarro() {
    }

    public Cigarro(Papel papel, Tabaco tabaco, Cerillo cerillo) {
        this.papel = papel;
        this.tabaco = tabaco;
        this.cerillo = cerillo;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public Tabaco getTabaco() {
        return tabaco;
    }

    public void setTabaco(Tabaco tabaco) {
        this.tabaco = tabaco;
    }

    public Cerillo getCerillo() {
        return cerillo;
    }

    public void setCerillo(Cerillo cerillo) {
        this.cerillo = cerillo;
    }

    @Override
    public String toString() {
        return "Cigarro{" + "papel=" + papel + ", tabaco=" + tabaco + ", cerillo=" + cerillo + '}';
    }
    
}
