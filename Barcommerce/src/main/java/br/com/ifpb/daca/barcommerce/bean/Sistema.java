
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
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
@Table(name = "tbl_sistema")
public class Sistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sis_codigo")
    private Integer sisCodigo;
    
    @Column(name = "sis_mes", length = 20, nullable = false)
    private String sisMes;
    
    @Column(name = "sis_senha", nullable = false, length = 50)
    private String sisSenha;
    
    @Column(name = "sis_situacao", length = 20, nullable = false)
    private String sisSituacao;

    public Sistema() {
    }

    public Sistema(Integer sisCodigo) {
        this.sisCodigo = sisCodigo;
    }

    public Sistema(Integer sisCodigo, String sisMes, String sisSenha, String sisSituacao) {
        this.sisCodigo = sisCodigo;
        this.sisMes = sisMes;
        this.sisSenha = sisSenha;
        this.sisSituacao = sisSituacao;
    }

    public Integer getSisCodigo() {
        return sisCodigo;
    }

    public void setSisCodigo(Integer sisCodigo) {
        this.sisCodigo = sisCodigo;
    }

    public String getSisMes() {
        return sisMes;
    }

    public void setSisMes(String sisMes) {
        this.sisMes = sisMes;
    }

    public String getSisSenha() {
        return sisSenha;
    }

    public void setSisSenha(String sisSenha) {
        this.sisSenha = sisSenha;
    }

    public String getSisSituacao() {
        return sisSituacao;
    }

    public void setSisSituacao(String sisSituacao) {
        this.sisSituacao = sisSituacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sisCodigo != null ? sisCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.sisCodigo == null && other.sisCodigo != null) || (this.sisCodigo != null && !this.sisCodigo.equals(other.sisCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Sistema[ sisCodigo=" + sisCodigo + " ]";
    }
    
}
