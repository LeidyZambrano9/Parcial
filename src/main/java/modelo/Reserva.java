package modelo;

/**
 * Clase que representa la entidad Reserva.
 */
public class Reserva {
    
    // Atributos privados para cumplir con el principio de encapsulamiento
    private String nombre;
    private String fecha;
    private String espacio;
    private int duracion;

    // Constructor: permite inicializar el objeto con todos sus datos al momento de crearlo
    public Reserva(String nombre, String fecha, String espacio, int duracion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.espacio = espacio;
        this.duracion = duracion;
    }

    // Métodos Getters
    
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEspacio() {
        return espacio;
    }

    public int getDuracion() {
        return duracion;
    }
}