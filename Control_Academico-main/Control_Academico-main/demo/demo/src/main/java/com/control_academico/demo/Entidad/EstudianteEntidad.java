package com.control_academico.demo.Entidad;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ESTUDIANTE")
public class EstudianteEntidad {

    @Id
    @Column(name = "CARNET", length = 20)
    private String carnet;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;

    @Column(name = "FECHA_NAC", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}