/*
 * n método para agregar un servicio contratado a la lista de servicios del cliente.
Un método para calcular el costo total de los servicios contratados por el cliente.
La aplicación debe permitir registrar varios clientes y sus servicios contratados,
y debe tener un método para mostrar el costo total de los servicios contratados por todos los clientes registrados.

El ejercicio consiste en implementar las clases Cliente y Servicio, 
así como la clase principal que permita interactuar con el usuario para registrar clientes y servicios contratados,
y que muestre el costo total de los servicios contratados por todos los clientes registrados. Además, se debe utilizar un array para almacenar los clientes registrados.
 */
package ServicioCliente;

import entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosCliente {
    Scanner leer = new Scanner(System.in);
    public Cliente AgrgarCliente(){
        System.out.println("ingrese su nombre");
        String nombre=leer.next();
        System.out.println("ingrese su apellido");
        String apellido=leer.next();
        System.out.println("ingrese su email");
        String email=leer.next();
        
    
    return new Cliente(nombre, apellido, email);
    }
    
    public void MostrarArray(Cliente clientes[]){
        for (int i = 0; i <clientes.length; i++) {
            System.out.println(clientes[i].getNombre());
            System.out.println(clientes[i].getApellido());
            System.out.println(clientes[i].getEmail());
        }
    
    }
    
    
       
        
    
    
    }

