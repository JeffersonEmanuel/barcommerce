package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_codigo")
    private Integer prodCodigo;
    
    @Column(name = "prod_descricao", length = 60, nullable = false)
    private String prodDescricao;

    @Column(name = "prod_valor", nullable = false)
    private BigDecimal prodValor;
    
    @Column(name = "prod_valor_compra", nullable = false)
    private double prodValorCompra;
   
    @Column(name = "prod_quant", nullable = false)
    private long prodQuant;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "prod_obs")
    private String prodObs;
    
    @Column(name = "mp_codigo")
    private int mpCodigo;

    public Produto() {
    }

    public Produto(Integer prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public Produto(Integer prodCodigo, String prodDescricao, BigDecimal prodValor, double prodValorCompra, long prodQuant, int mpCodigo) {
        this.prodCodigo = prodCodigo;
        this.prodDescricao = prodDescricao;
        this.prodValor = prodValor;
        this.prodValorCompra = prodValorCompra;
        this.prodQuant = prodQuant;
        this.mpCodigo = mpCodigo;
    }

    public Integer getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(Integer prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public String getProdDescricao() {
        return prodDescricao;
    }

    public void setProdDescricao(String prodDescricao) {
        this.prodDescricao = prodDescricao;
    }

    public BigDecimal getProdValor() {
        return prodValor;
    }

    public void setProdValor(BigDecimal prodValor) {
        this.prodValor = prodValor;
    }

    public double getProdValorCompra() {
        return prodValorCompra;
    }

    public void setProdValorCompra(double prodValorCompra) {
        this.prodValorCompra = prodValorCompra;
    }

    public long getProdQuant() {
        return prodQuant;
    }

    public void setProdQuant(long prodQuant) {
        this.prodQuant = prodQuant;
    }

    public String getProdObs() {
        return prodObs;
    }

    public void setProdObs(String prodObs) {
        this.prodObs = prodObs;
    }

    public int getMpCodigo() {
        return mpCodigo;
    }

    public void setMpCodigo(int mpCodigo) {
        this.mpCodigo = mpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCodigo != null ? prodCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.prodCodigo == null && other.prodCodigo != null) || (this.prodCodigo != null && !this.prodCodigo.equals(other.prodCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Produto[ prodCodigo=" + prodCodigo + " ]";
    }
    
}
