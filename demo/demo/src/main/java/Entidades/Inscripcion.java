package entidades.inscripcion;

import entidades.curso.Curso;
import entidades.estudiante.Estudiante;
import entidades.semestre.Semestre;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "INSCRIPCION")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INSCRIPCION")
    private Integer idInscripcion;

    @ManyToOne
    @JoinColumn(name = "CARNET", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "ID_CURSO", nullable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "ID_SEMESTRE", nullable = false)
    private Semestre semestre;

    @Column(name = "NOTA_FINAL", precision = 5, scale = 2)
    private BigDecimal notaFinal;

    @Column(name = "FECHA_EVAL")
    private LocalDate fechaEval;

    // Getters y Setters
    public Integer getIdInscripcion() {
        return idInscripcion;
    }
    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Semestre getSemestre() {
        return semestre;
    }
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    public BigDecimal getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(BigDecimal notaFinal) {
        this.notaFinal = notaFinal;
    }
    public LocalDate getFechaEval() {
        return fechaEval;
    }
    public void setFechaEval(LocalDate fechaEval) {
        this.fechaEval = fechaEval;
    }
}
