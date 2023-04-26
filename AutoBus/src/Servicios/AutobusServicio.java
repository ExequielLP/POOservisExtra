/*
 * Método inicioRecorrido(int cantidad), recibirá por parámetro la cantidad de personas que suben al autobús en el inicio del recorrido. La misma no debe superar la capacidad máxima del autobús.
Método finRecorrido(), debe simular la finalización del recorrido y por lo cual el autobús debe quedar vacío.
 */
package Servicios;

import entidades.Autobus;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AutobusServicio {
private Autobus autobus;
    Scanner leer = new Scanner(System.in);

    public Autobus CrearAutobus() {
        
        int CapMax =30;
        
        int CapAct =25;
        
        int ParasCant = 10;

        return new Autobus(CapMax, CapAct, ParasCant);
    }

    
    //método inicioRecorrido(int cantidad),
    
    public void InicioRecorrido(int k){
        autobus.setCapAct(k);
    }
    public void FinRecorrido(){
    autobus.setCapAct(0);
    
    
    }
}
