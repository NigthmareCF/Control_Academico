package entidades.estudiante;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ESTUDIANTE")
public class Estudiante {

    @Id
    @Column(name = "CARNET", length = 20)
    private String carnet;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;

    @Column(name = "FECHA_NAC", nullable = false)
    private LocalDate fechaNac;

    // Getters y Setters
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}
