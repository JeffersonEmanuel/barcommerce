
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_mtprima")
public class Mtprima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mp_codigo")
    private Integer mpCodigo;
    
    @Column(name = "mp_descricao", length = 50, nullable = false)
    private String mpDescricao;
    
    @Column(name = "mp_preco", nullable = false)
    private BigDecimal mpPreco;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mpCodigo")
    private List<ItemMt> itemMtList;

    public Mtprima() {
    }

    public Mtprima(Integer mpCodigo) {
        this.mpCodigo = mpCodigo;
    }

    public Mtprima(Integer mpCodigo, String mpDescricao, BigDecimal mpPreco) {
        this.mpCodigo = mpCodigo;
        this.mpDescricao = mpDescricao;
        this.mpPreco = mpPreco;
    }

    public Integer getMpCodigo() {
        return mpCodigo;
    }

    public void setMpCodigo(Integer mpCodigo) {
        this.mpCodigo = mpCodigo;
    }

    public String getMpDescricao() {
        return mpDescricao;
    }

    public void setMpDescricao(String mpDescricao) {
        this.mpDescricao = mpDescricao;
    }

    public BigDecimal getMpPreco() {
        return mpPreco;
    }

    public void setMpPreco(BigDecimal mpPreco) {
        this.mpPreco = mpPreco;
    }

    @XmlTransient
    public List<ItemMt> getItemMtList() {
        return itemMtList;
    }

    public void setItemMtList(List<ItemMt> itemMtList) {
        this.itemMtList = itemMtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mpCodigo != null ? mpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Mtprima)) {
            return false;
        }
        Mtprima other = (Mtprima) object;
        if ((this.mpCodigo == null && other.mpCodigo != null) || (this.mpCodigo != null && !this.mpCodigo.equals(other.mpCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Mtprima[ mpCodigo=" + mpCodigo + " ]";
    }
    
}
