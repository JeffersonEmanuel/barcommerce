
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_item")

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_codigo")
    private Integer itemCodigo;
   
    @Column(name = "prod_quant", nullable = false)
    private long prodQuant;
    
    @Column(name = "item_valor", nullable = false)
    private BigDecimal itemValor;
    
    @Column(name = "ped_codigo")
    private Integer pedCodigo;
    
    @Column(name = "mes_codigo")
    private Integer mesCodigo;
    
    @Column(name = "prod_codigo", nullable = false)
    private int prodCodigo;

    public Item() {
    }

    public Item(Integer itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public Item(Integer itemCodigo, long prodQuant, BigDecimal itemValor, int prodCodigo) {
        this.itemCodigo = itemCodigo;
        this.prodQuant = prodQuant;
        this.itemValor = itemValor;
        this.prodCodigo = prodCodigo;
    }

    public Integer getItemCodigo() {
        return itemCodigo;
    }

    public void setItemCodigo(Integer itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public long getProdQuant() {
        return prodQuant;
    }

    public void setProdQuant(long prodQuant) {
        this.prodQuant = prodQuant;
    }

    public BigDecimal getItemValor() {
        return itemValor;
    }

    public void setItemValor(BigDecimal itemValor) {
        this.itemValor = itemValor;
    }

    public Integer getPedCodigo() {
        return pedCodigo;
    }

    public void setPedCodigo(Integer pedCodigo) {
        this.pedCodigo = pedCodigo;
    }

    public Integer getMesCodigo() {
        return mesCodigo;
    }

    public void setMesCodigo(Integer mesCodigo) {
        this.mesCodigo = mesCodigo;
    }

    public int getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(int prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemCodigo != null ? itemCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemCodigo == null && other.itemCodigo != null) || (this.itemCodigo != null && !this.itemCodigo.equals(other.itemCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Item[ itemCodigo=" + itemCodigo + " ]";
    }
    
}
