package com.control_academico.demo.Entidad;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "INSCRIPCION")
public class InscripcionEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INSCRIPCION")
    private Integer idInscripcion;

    @ManyToOne
    @JoinColumn(name = "CARNET", nullable = false)
    private EstudianteEntidad estudiante;

    @ManyToOne
    @JoinColumn(name = "ID_CURSO", nullable = false)
    private CursoEntidad curso;

    @ManyToOne
    @JoinColumn(name = "ID_SEMESTRE", nullable = false)
    private SemestreEntidad semestre;

    @Column(name = "NOTA_FINAL", precision = 5)
    private java.math.BigDecimal notaFinal;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_EVAL")
    private Date fechaEvaluacion;

    public Integer getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public EstudianteEntidad getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteEntidad estudiante) {
        this.estudiante = estudiante;
    }

    public CursoEntidad getCurso() {
        return curso;
    }

    public void setCurso(CursoEntidad curso) {
        this.curso = curso;
    }

    public SemestreEntidad getSemestre() {
        return semestre;
    }

    public void setSemestre(SemestreEntidad semestre) {
        this.semestre = semestre;
    }

    public java.math.BigDecimal getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(java.math.BigDecimal notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }
}