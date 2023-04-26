/*
 * T7) Crear la clase “Autobús” con los siguientes atributos:  identificación, capacidad máxima de pasajeros, capacidad actual de pasajeros y cantidad de paradas.
Luego agregar constructores, setters y getters.
Crear la clase “AutobúsServicio”, la misma contendrá los siguientes métodos:
Método para crear un Autobús: se pedirá al usuario que ingrese los datos.
Método inicioRecorrido(int cantidad), recibirá por parámetro la cantidad de personas que suben al autobús en el inicio del recorrido. La misma no debe superar la capacidad máxima del autobús.
Método finRecorrido(), debe simular la finalización del recorrido y por lo cual el autobús debe quedar vacío.
Método subirPasajeros(int cantidad, int parada), recibe por parámetro la cantidad de personas a subir y el número de parada.
En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada debe ejecutarse el método inicioRecorrido(int cantidad). En el caso que sea la última parada, debe informar al usuario que se encuentra en la finalización del recorrido y no pueden subir más pasajeros.
Si el número de parada es distinto al número de inicio y de finalización, debe subir a los pasajeros indicados, analizando la capacidad actual y verificando que no sobrepase la capacidad máxima. Solamente podrán subir pasajeros hasta cubrir la capacidad máxima.
Método bajarPasajeros (int cantidad, int parada), recibe por parámetro la cantidad de personas a bajar del autobús y el número de paradas.
En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada, se debe informar al usuario que el autobús aún se encuentra vacío. En el caso que sea la última parada, se debe ejecutar el método finRecorrido().
Si el número de parada es distinto al número de inicio y de finalización, deben bajar los pasajeros indicados.
 */
package autobus;

import Servicios.AutobusServicio;
import entidades.Autobus;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoAutoBus {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AutobusServicio as=new AutobusServicio();
        Autobus a=as.CrearAutobus();
        System.out.println("ingeresda candai");
        
        as.InicioRecorrido(leer.nextInt());
        as.FinRecorrido();
    }
    
}
