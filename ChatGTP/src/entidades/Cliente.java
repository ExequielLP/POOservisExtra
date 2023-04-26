/*
 * n método para agregar un servicio contratado a la lista de servicios del cliente.
Un método para calcular el costo total de los servicios contratados por el cliente.
La aplicación debe permitir registrar varios clientes y sus servicios contratados,
y debe tener un método para mostrar el costo total de los servicios contratados por todos los clientes registrados.

El ejercicio consiste en implementar las clases Cliente y Servicio, 
así como la clase principal que permita interactuar con el usuario para registrar clientes y servicios contratados,
y que muestre el costo total de los servicios contratados por todos los clientes registrados. Además, se debe utilizar un array para almacenar los clientes registrados.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
