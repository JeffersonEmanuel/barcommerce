
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_item_mt")
public class ItemMt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_codigo")
    private Integer itemCodigo;
        
    @Column(name = "item_status", nullable = false)
    private String itemStatus;
   
    @Column(name = "item_valor", nullable = false)
    private BigDecimal itemValor;
    
    @Column(name = "item_data_inicio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemDataInicio;
    
    @Column(name = "item_data_fim", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemDataFim;
    
    @JoinColumn(name = "mp_codigo", referencedColumnName = "mp_codigo")
    @ManyToOne(optional = false)
    private Mtprima mpCodigo;

    public ItemMt() {
    }

    public ItemMt(Integer itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public ItemMt(Integer itemCodigo,  String itemStatus, BigDecimal itemValor, Date itemDataInicio, Date itemDataFim) {
        this.itemCodigo = itemCodigo;
        this.itemStatus = itemStatus;
        this.itemValor = itemValor;
        this.itemDataInicio = itemDataInicio;
        this.itemDataFim = itemDataFim;
    }

    public Integer getItemCodigo() {
        return itemCodigo;
    }

    public void setItemCodigo(Integer itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public BigDecimal getItemValor() {
        return itemValor;
    }

    public void setItemValor(BigDecimal itemValor) {
        this.itemValor = itemValor;
    }

    public Date getItemDataInicio() {
        return itemDataInicio;
    }

    public void setItemDataInicio(Date itemDataInicio) {
        this.itemDataInicio = itemDataInicio;
    }

    public Date getItemDataFim() {
        return itemDataFim;
    }

    public void setItemDataFim(Date itemDataFim) {
        this.itemDataFim = itemDataFim;
    }

    public Mtprima getMpCodigo() {
        return mpCodigo;
    }

    public void setMpCodigo(Mtprima mpCodigo) {
        this.mpCodigo = mpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemCodigo != null ? itemCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemMt)) {
            return false;
        }
        ItemMt other = (ItemMt) object;
        if ((this.itemCodigo == null && other.itemCodigo != null) || (this.itemCodigo != null && !this.itemCodigo.equals(other.itemCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.ItemMt[ itemCodigo=" + itemCodigo + " ]";
    }
    
}
