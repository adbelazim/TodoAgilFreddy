/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FGT
 */
@Entity
@Table(name = "asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a"),
    @NamedQuery(name = "Asignatura.findByIdAsignatura", query = "SELECT a FROM Asignatura a WHERE a.idAsignatura = :idAsignatura"),
    @NamedQuery(name = "Asignatura.findByNombreAsignatura", query = "SELECT a FROM Asignatura a WHERE a.nombreAsignatura = :nombreAsignatura"),
    @NamedQuery(name = "Asignatura.findBySemestreAsignatura", query = "SELECT a FROM Asignatura a WHERE a.semestreAsignatura = :semestreAsignatura"),
    @NamedQuery(name = "Asignatura.findByAnoAsignatura", query = "SELECT a FROM Asignatura a WHERE a.anoAsignatura = :anoAsignatura"),
    @NamedQuery(name = "Asignatura.findByCierreAsignatura", query = "SELECT a FROM Asignatura a WHERE a.cierreAsignatura = :cierreAsignatura"),
    @NamedQuery(name = "Asignatura.findByIdUsuario", query = "SELECT a FROM Asignatura a WHERE a.idUsuario = :idUsuario")
})
public class Asignatura implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORAS_TEORICAS_ASIGNATURA")
    private int horasTeoricasAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORAS_EJERCICIOS_ASIGNATURA")
    private int horasEjerciciosAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORAS_LABORATORIO_ASIGNATURA")
    private int horasLaboratorioAsignatura;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ASIGNATURA")
    private Integer idAsignatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_ASIGNATURA")
    private String nombreAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEMESTRE_ASIGNATURA")
    private int semestreAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ANO_ASIGNATURA")
    private int anoAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIERRE_ASIGNATURA")
    private int cierreAsignatura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAsignatura")
    private List<SprintAsignatura> sprintAsignaturaList;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Asignatura() {
    }

    public Asignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Asignatura(int horasTeoricasAsignatura, int horasEjerciciosAsignatura, int horasLaboratorioAsignatura, Integer idAsignatura, String nombreAsignatura, int semestreAsignatura, int anoAsignatura, int cierreAsignatura, List<SprintAsignatura> sprintAsignaturaList, Usuario idUsuario) {
        this.horasTeoricasAsignatura = horasTeoricasAsignatura;
        this.horasEjerciciosAsignatura = horasEjerciciosAsignatura;
        this.horasLaboratorioAsignatura = horasLaboratorioAsignatura;
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.semestreAsignatura = semestreAsignatura;
        this.anoAsignatura = anoAsignatura;
        this.cierreAsignatura = cierreAsignatura;
        this.sprintAsignaturaList = sprintAsignaturaList;
        this.idUsuario = idUsuario;
    }

    public Asignatura(int horasTeoricasAsignatura, int horasEjerciciosAsignatura, int horasLaboratorioAsignatura, Integer idAsignatura, String nombreAsignatura, int semestreAsignatura, int anoAsignatura, int cierreAsignatura, Usuario idUsuario) {
        this.horasTeoricasAsignatura = horasTeoricasAsignatura;
        this.horasEjerciciosAsignatura = horasEjerciciosAsignatura;
        this.horasLaboratorioAsignatura = horasLaboratorioAsignatura;
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.semestreAsignatura = semestreAsignatura;
        this.anoAsignatura = anoAsignatura;
        this.cierreAsignatura = cierreAsignatura;
        this.idUsuario = idUsuario;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getSemestreAsignatura() {
        return semestreAsignatura;
    }

    public void setSemestreAsignatura(int semestreAsignatura) {
        this.semestreAsignatura = semestreAsignatura;
    }

    public int getAnoAsignatura() {
        return anoAsignatura;
    }

    public void setAnoAsignatura(int anoAsignatura) {
        this.anoAsignatura = anoAsignatura;
    }

    public int getCierreAsignatura() {
        return cierreAsignatura;
    }

    public void setCierreAsignatura(int cierreAsignatura) {
        this.cierreAsignatura = cierreAsignatura;
    }

    @XmlTransient
    public List<SprintAsignatura> getSprintAsignaturaList() {
        return sprintAsignaturaList;
    }

    public void setSprintAsignaturaList(List<SprintAsignatura> sprintAsignaturaList) {
        this.sprintAsignaturaList = sprintAsignaturaList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignatura != null ? idAsignatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.idAsignatura == null && other.idAsignatura != null) || (this.idAsignatura != null && !this.idAsignatura.equals(other.idAsignatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.usach.entities.Asignatura[ idAsignatura=" + idAsignatura + " ]";
    }

    public int getHorasTeoricasAsignatura() {
        return horasTeoricasAsignatura;
    }

    public void setHorasTeoricasAsignatura(int horasTeoricasAsignatura) {
        this.horasTeoricasAsignatura = horasTeoricasAsignatura;
    }

    public int getHorasEjerciciosAsignatura() {
        return horasEjerciciosAsignatura;
    }

    public void setHorasEjerciciosAsignatura(int horasEjerciciosAsignatura) {
        this.horasEjerciciosAsignatura = horasEjerciciosAsignatura;
    }

    public int getHorasLaboratorioAsignatura() {
        return horasLaboratorioAsignatura;
    }

    public void setHorasLaboratorioAsignatura(int horasLaboratorioAsignatura) {
        this.horasLaboratorioAsignatura = horasLaboratorioAsignatura;
    }
    
}
