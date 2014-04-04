
package br.com.ifpb.daca.barcommerce.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cli_codigo")
    private Integer cliCodigo;
    
    @Column(name = "cli_nome", nullable = false, length = 60)
    private String cliNome;
    
    @Column(name = "cli_endereco", nullable = false, length = 60)
    private String cliEndereco;
    
    @Column(name = "cli_uf", length = 2, nullable = false)
    private String cliUf;

    @Column(name = "cli_numero", length = 6)
    private String cliNumero;
    
    @Column(name = "cli_bairro", length = 60)
    private String cliBairro;

    @Column(name = "cli_cidade", length = 50)
    private String cliCidade;
   
    @Column(name = "cli_cep", length = 15)
    private String cliCep;
    
    @Column(name = "cli_res", length = 14)
    private String cliRes;
   
    @Column(name = "cli_cel", length = 14)
    private String cliCel;

    @Column(name = "cli_cpf", length = 15)
    private String cliCpf;
    
    @Column(name = "cli_rg", length = 12)
    private String cliRg;
    
    @Column(name = "cli_datanas")
    @Temporal(TemporalType.DATE)
    private Date cliDatanas;
    
    @Column(name = "cli_email")
    private String cliEmail;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "cli_obs")
    private String cliObs;
    
    @OneToMany(mappedBy = "cliCodigo")
    private List<Pedido> pedidoList;

    public Cliente() {
    }

    public Cliente(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Cliente(Integer cliCodigo, String cliNome, String cliEndereco, String cliUf) {
        this.cliCodigo = cliCodigo;
        this.cliNome = cliNome;
        this.cliEndereco = cliEndereco;
        this.cliUf = cliUf;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliUf() {
        return cliUf;
    }

    public void setCliUf(String cliUf) {
        this.cliUf = cliUf;
    }

    public String getCliNumero() {
        return cliNumero;
    }

    public void setCliNumero(String cliNumero) {
        this.cliNumero = cliNumero;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public String getCliRes() {
        return cliRes;
    }

    public void setCliRes(String cliRes) {
        this.cliRes = cliRes;
    }

    public String getCliCel() {
        return cliCel;
    }

    public void setCliCel(String cliCel) {
        this.cliCel = cliCel;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliRg() {
        return cliRg;
    }

    public void setCliRg(String cliRg) {
        this.cliRg = cliRg;
    }

    public Date getCliDatanas() {
        return cliDatanas;
    }

    public void setCliDatanas(Date cliDatanas) {
        this.cliDatanas = cliDatanas;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliObs() {
        return cliObs;
    }

    public void setCliObs(String cliObs) {
        this.cliObs = cliObs;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCodigo == null && other.cliCodigo != null) || (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Cliente[ cliCodigo=" + cliCodigo + " ]";
    }
    
}
