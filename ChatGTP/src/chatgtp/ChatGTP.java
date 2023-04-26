/*
 * En una una lista de servicio aplicación de registro de clientes, se requiere una clase Cliente que tenga los siguientes atributos: nombre, apellido, correo electrónico ys contratados. Cada servicio debe estar representado por una clase Servicio que tenga un nombre, una descripción y un costo.

La clase Cliente debe tener los siguientes métodos:

Un constructor que reciba como parámetros el nombre, apellido y correo electrónico del cliente.
Un método para agregar un servicio contratado a la lista de servicios del cliente.
Un método para calcular el costo total de los servicios contratados por el cliente.
La aplicación debe permitir registrar varios clientes y sus servicios contratados,
y debe tener un método para mostrar el costo total de los servicios contratados por todos los clientes registrados.

El ejercicio consiste en implementar las clases Cliente y Servicio, 
así como la clase principal que permita interactuar con el usuario para registrar clientes y servicios contratados,
y que muestre el costo total de los servicios contratados por todos los clientes registrados. Además, se debe utilizar un array para almacenar los clientes registrados.
 */
package chatgtp;

import ServicioCliente.ServiciosCliente;
import entidades.Cliente;

/**
 *
 * @author Usuario
 */
public class ChatGTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiciosCliente sv=new ServiciosCliente();
       Cliente c1=sv.AgrgarCliente();
       Cliente c2=sv.AgrgarCliente();
       Cliente c3=sv.AgrgarCliente();
       
       Cliente clientes[]=new Cliente[3];
       clientes[0]=c1;
       clientes[1]=c2;
       clientes[2]=c3;
       sv.MostrarArray(clientes);
       
    }
    
}
