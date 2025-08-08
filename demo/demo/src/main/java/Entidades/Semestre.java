package entidades.semestre;

import jakarta.persistence.*;

@Entity
@Table(name = "SEMESTRE")
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SEMESTRE")
    private Integer idSemestre;

    @Column(name = "ANIO", nullable = false)
    private Integer anio;

    @Column(name = "CICLO", nullable = false, length = 1)
    private String ciclo;

    // Getters y Setters
    public Integer getIdSemestre() {
        return idSemestre;
    }
    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
