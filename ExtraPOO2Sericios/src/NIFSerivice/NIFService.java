/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFSerivice;

import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);

    public Nif crearNIF() {
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("ingrese su dni ");
        
       
        
       int dni=leer.nextInt();
       String nif=null;
        double res =dni % 23;
        for (int i = 0; i < vector.length; i++) {
            if (res == i) {
                 nif=(vector[i]);
            }

        }

        return new Nif(dni, nif);
    }

    public void mostrar(Nif n) {
        System.out.println(n.getDni()+"-"+n.getNif());
        

    }
}
