
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_caixa")
public class Caixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cai_codigo", nullable = false)
    private Integer caiCodigo;
    
    @Column(name = "cai_valor_inicial", nullable = false)
    private BigDecimal caiValorInicial;

    @Column(name = "cai_inicia", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date caiInicia;
    
    @Column(name = "cai_valor", nullable = false)
    private BigDecimal caiValor;
    
    @Column(name = "cai_data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date caiData;
    
    @Column(name = "cai_valor_final")
    private BigDecimal caiValorFinal;
    
    @Column(name = "cai_status", nullable = false,length = 3)
    private String caiStatus;
   
    @OneToMany(mappedBy = "caiCodigo")
    private List<Pedido> pedidoList;
   
    @OneToMany(mappedBy = "caiCodigo")
    private List<Mesa> mesaList;

    public Caixa() {
    }

    public Caixa(Integer caiCodigo) {
        this.caiCodigo = caiCodigo;
    }

    public Caixa(Integer caiCodigo, Date caiInicia, Date caiData, String caiStatus) {
        this.caiCodigo = caiCodigo;
        this.caiInicia = caiInicia;
        this.caiData = caiData;
        this.caiStatus = caiStatus;
    }

    public Integer getCaiCodigo() {
        return caiCodigo;
    }

    public void setCaiCodigo(Integer caiCodigo) {
        this.caiCodigo = caiCodigo;
    }

    public BigDecimal getCaiValorInicial() {
        return caiValorInicial;
    }

    public void setCaiValorInicial(BigDecimal caiValorInicial) {
        this.caiValorInicial = caiValorInicial;
    }

    public Date getCaiInicia() {
        return caiInicia;
    }

    public void setCaiInicia(Date caiInicia) {
        this.caiInicia = caiInicia;
    }

    public BigDecimal getCaiValor() {
        return caiValor;
    }

    public void setCaiValor(BigDecimal caiValor) {
        this.caiValor = caiValor;
    }

    public Date getCaiData() {
        return caiData;
    }

    public void setCaiData(Date caiData) {
        this.caiData = caiData;
    }

    public BigDecimal getCaiValorFinal() {
        return caiValorFinal;
    }

    public void setCaiValorFinal(BigDecimal caiValorFinal) {
        this.caiValorFinal = caiValorFinal;
    }

    public String getCaiStatus() {
        return caiStatus;
    }

    public void setCaiStatus(String caiStatus) {
        this.caiStatus = caiStatus;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @XmlTransient
    public List<Mesa> getMesaList() {
        return mesaList;
    }

    public void setMesaList(List<Mesa> mesaList) {
        this.mesaList = mesaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caiCodigo != null ? caiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.caiCodigo == null && other.caiCodigo != null) || (this.caiCodigo != null && !this.caiCodigo.equals(other.caiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Caixa[ caiCodigo=" + caiCodigo + " ]";
    }
    
}
