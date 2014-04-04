package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_movimento", catalog = "barcommerce_daca", schema = "")
public class Movimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mov_codigo")
    private Integer movCodigo;
    
    @Column(name = "mov_tipo", nullable = false, length = 3)
    private String movTipo;
    
    @Column(name = "mov_hora", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date movHora;
    
    @Column(name = "mov_motivo", length = 60, nullable = false)
    private String movMotivo;

    @Column(name = "mov_valor", nullable = false)
    private BigDecimal movValor;
   
    @Column(name = "cai_codigo", nullable = false)
    private int caiCodigo;

    public Movimento() {
    }

    public Movimento(Integer movCodigo) {
        this.movCodigo = movCodigo;
    }

    public Movimento(Integer movCodigo, String movTipo, String movMotivo, BigDecimal movValor, int caiCodigo) {
        this.movCodigo = movCodigo;
        this.movTipo = movTipo;
        this.movMotivo = movMotivo;
        this.movValor = movValor;
        this.caiCodigo = caiCodigo;
    }

    public Integer getMovCodigo() {
        return movCodigo;
    }

    public void setMovCodigo(Integer movCodigo) {
        this.movCodigo = movCodigo;
    }

    public String getMovTipo() {
        return movTipo;
    }

    public void setMovTipo(String movTipo) {
        this.movTipo = movTipo;
    }

    public Date getMovHora() {
        return movHora;
    }

    public void setMovHora(Date movHora) {
        this.movHora = movHora;
    }

    public String getMovMotivo() {
        return movMotivo;
    }

    public void setMovMotivo(String movMotivo) {
        this.movMotivo = movMotivo;
    }

    public BigDecimal getMovValor() {
        return movValor;
    }

    public void setMovValor(BigDecimal movValor) {
        this.movValor = movValor;
    }

    public int getCaiCodigo() {
        return caiCodigo;
    }

    public void setCaiCodigo(int caiCodigo) {
        this.caiCodigo = caiCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movCodigo != null ? movCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        if ((this.movCodigo == null && other.movCodigo != null) || (this.movCodigo != null && !this.movCodigo.equals(other.movCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Movimento[ movCodigo=" + movCodigo + " ]";
    }
    
}
