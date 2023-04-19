/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapoo1;

import entidades.Raices;
import servicios.RaicesServicios;

/**
 *
 * @author Usuario
 */
public class ExtraPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicios rs=new RaicesServicios();
        Raices r=rs.crearRaices();
        System.out.println("la solucion del discriminante es"+rs.GetDiscriminante());
      rs.calcular();
      
       
       
       
    }
    
}
