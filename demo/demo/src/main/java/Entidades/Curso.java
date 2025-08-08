package entidades.curso;

import entidades.profesor.Profesor;
import jakarta.persistence.*;

@Entity
@Table(name = "CURSO")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURSO")
    private Integer idCurso;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "CREDITOS", nullable = false)
    private Integer creditos;

    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", nullable = false)
    private Profesor profesor;

    // Relación para prerequisito que es recursiva (puede ser null)
    @ManyToOne
    @JoinColumn(name = "ID_PREREQUISITO")
    private Curso prerequisito;

    // Getters y Setters
    public Integer getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCreditos() {
        return creditos;
    }
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Curso getPrerequisito() {
        return prerequisito;
    }
    public void setPrerequisito(Curso prerequisito) {
        this.prerequisito = prerequisito;
    }
}
