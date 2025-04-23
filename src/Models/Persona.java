package Models;

/**
 * Clase Persona que representa una entidad Persona con atributos para nombre y
 * edad.
 */
public class Persona {
    // Atributos de la clase
    String nombre; // Almacena el nombre de la persona
    int edad; // Almacena la edad de la persona

    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad
     * específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener la representación en cadena de texto de una instancia de
     * Persona.
     * 
     * @return Representación en String de la persona, mostrando su nombre y edad.
     */
    @Override
    public String toString() {
        return nombre + " - " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
