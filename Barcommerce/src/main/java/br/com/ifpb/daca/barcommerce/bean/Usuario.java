package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "tbl_usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_codigo")
    private Integer usuCodigo;
    
    @Column(name = "usu_nivel", length = 3, nullable = false)
    private String usuNivel;
   
    @Column(name = "usu_login", length = 30, nullable = false)
    private String usuLogin;
    
    @Basic(optional = false)
    @Column(name = "usu_senha", nullable = false, length = 40)
    private String usuSenha;
    
    @Column(name = "usu_tipo", length = 3)
    private String usuTipo;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuCodigo")
    private List<Mesa> mesaList;

    public Usuario() {
    }

    public Usuario(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public Usuario(Integer usuCodigo, String usuNivel, String usuLogin, String usuSenha) {
        this.usuCodigo = usuCodigo;
        this.usuNivel = usuNivel;
        this.usuLogin = usuLogin;
        this.usuSenha = usuSenha;
    }

    public Integer getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public String getUsuNivel() {
        return usuNivel;
    }

    public void setUsuNivel(String usuNivel) {
        this.usuNivel = usuNivel;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
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
        hash += (usuCodigo != null ? usuCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuCodigo == null && other.usuCodigo != null) || (this.usuCodigo != null && !this.usuCodigo.equals(other.usuCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Usuario[ usuCodigo=" + usuCodigo + " ]";
    }
    
}
