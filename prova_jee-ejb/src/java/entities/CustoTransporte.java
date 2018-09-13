/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "custo_transporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustoTransporte.findAll", query = "SELECT c FROM CustoTransporte c")
    , @NamedQuery(name = "CustoTransporte.findById", query = "SELECT c FROM CustoTransporte c WHERE c.id = :id")
    , @NamedQuery(name = "CustoTransporte.findByDistanciaRodPav", query = "SELECT c FROM CustoTransporte c WHERE c.distanciaRodPav = :distanciaRodPav")
    , @NamedQuery(name = "CustoTransporte.findByDistanciaRodNaoPav", query = "SELECT c FROM CustoTransporte c WHERE c.distanciaRodNaoPav = :distanciaRodNaoPav")
    , @NamedQuery(name = "CustoTransporte.findByVeiculo", query = "SELECT c FROM CustoTransporte c WHERE c.veiculo = :veiculo")
    , @NamedQuery(name = "CustoTransporte.findByCarga", query = "SELECT c FROM CustoTransporte c WHERE c.carga = :carga")
    , @NamedQuery(name = "CustoTransporte.findByCusto", query = "SELECT c FROM CustoTransporte c WHERE c.custo = :custo")})

public class CustoTransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "distancia_rod_pav")
    private Integer distanciaRodPav;
    @Column(name = "distancia_rod_nao_pav")
    private Integer distanciaRodNaoPav;
    @NotNull
    @Column(name = "veiculo")
    private Integer veiculo;
    @Column(name = "carga")
    private Integer carga;
    @Column(name = "custo")
    public double custo;

    public CustoTransporte() {
    }

    public CustoTransporte(int distanciaRodPav, int distanciaRodNaoPav, Double custo) {
        this.distanciaRodPav = distanciaRodPav;
        this.distanciaRodNaoPav = distanciaRodNaoPav;
        this.custo = custo;
    }
    
    public CustoTransporte(int id, int distanciaRodPav, int distanciaRodNaoPav, int veiculo, int carga, Double custo) {
        this.id = id;
        this.distanciaRodPav = distanciaRodPav;
        this.distanciaRodNaoPav = distanciaRodNaoPav;
        this.veiculo = veiculo;
        this.carga = carga;
        this.custo = custo;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistanciaRodPav() {
        return distanciaRodPav;
    }

    public void setDistanciaRodPav(Integer distanciaRodPav) {
        this.distanciaRodPav = distanciaRodPav;
    }

    public Integer getDistanciaRodNaoPav() {
        return distanciaRodNaoPav;
    }

    public void setDistanciaRodNaoPav(Integer distanciaRodNaoPav) {
        this.distanciaRodNaoPav = distanciaRodNaoPav;
    }

    public Integer getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Integer veiculo) {
        this.veiculo = veiculo;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustoTransporte)) {
            return false;
        }
        CustoTransporte other = (CustoTransporte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CustoTransporte[ id=" + id + " ]";
    }
    
}
