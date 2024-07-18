/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabores;

/**
 * @author lizandro garcia
 */
public class SaboresH2 {

protected double saldolni;
protected double totalV;

    public SaboresH2(double saldolni, double totalV) {
        this.saldolni = saldolni;
        this.totalV = totalV;
    }

    public double getSaldolni() {
        return saldolni;
    }

    public void setSaldolni(double saldolni) {
        this.saldolni = saldolni;
    }

    public double getTotalV() {
        return totalV;
    }

    public void setTotalV(double totalV) {
        this.totalV = totalV;
    }
    
}
