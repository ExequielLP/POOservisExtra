/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapoo2sericios;

import NIFSerivice.NIFService;
import entidades.Nif;

/**
 *
 * @author Usuario
 */
public class ExtraPOO2Sericios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NIFService ns=new NIFService();
       Nif n=ns.crearNIF();
        ns.mostrar(n);
        System.out.println(n);
    }
    
}
