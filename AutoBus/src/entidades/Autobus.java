/*
 * identificación, capacidad máxima de pasajeros, capacidad actual de pasajeros y cantidad de paradas.
Luego agregar constructores, setters y getters.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Autobus {
    private int CapMax;
    private int CapAct;
    private int ParasCant;

    public Autobus(int CapMax, int CapAct, int ParasCant) {
        this.CapMax = CapMax;
        this.CapAct = CapAct;
        this.ParasCant = ParasCant;
    }

    public int getCapMax() {
        return CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }

    public int getParasCant() {
        return ParasCant;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }

    public void setParasCant(int ParasCant) {
        this.ParasCant = ParasCant;
    }
    
}
