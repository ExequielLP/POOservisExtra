/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaicesServicios {

    Scanner leer = new Scanner(System.in);
    Raices r = new Raices();

    public Raices crearRaices() {
        System.out.println("ingrese valor de a");
        r.setA(leer.nextDouble());
        System.out.println("ingrese valor de b");
        r.setB(leer.nextDouble());
        System.out.println("ingrese valor de c");
        r.setC(leer.nextDouble());

        return r;
    }

    public double GetDiscriminante() {

        double d = (Math.pow(r.getB(), 2)) - 4 * r.getA() * r.getC();

        return d;
    }

    public boolean tieneRaices() {
        boolean res = false;

        if (GetDiscriminante() >= 0) {
            res = true;
        }

        return res;
    }

    public boolean tieneRaiz() {
        boolean res = false;
        if (GetDiscriminante() == 0) {
            res = true;
        }
        return res;
    }

    public void obtenerRaices() {
        double res1 = 0;
        double res2 = 0;
       

        if (tieneRaices() == true) {
            res1 = (-r.getB() + Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());

            res2 = (-r.getB() - Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());
            
        }
        System.out.println("el resultado es " + res1 + " ese ");
        System.out.println("el otro resultado es " + res2 + " ese ");
    }
    
    public double obtenerRaiz(){
    double raiz=0;
        if (tieneRaiz()==true) { raiz=(-r.getB() + Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());
            
        }
        System.out.println("unica raiz da como resultado"+raiz);
    return raiz;
    }
    public void calcular(){
    tieneRaices();
    tieneRaiz();
    obtenerRaices();
    obtenerRaiz();
    }
}
