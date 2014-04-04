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
@Table(name = "tbl_pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ped_codigo")
    private Integer pedCodigo;

    @Column(name = "ped_valor", nullable = false)
    private BigDecimal pedValor;

    @Column(name = "ped_entrega")
    private BigDecimal pedEntrega;
    
    @Column(name = "ped_embalagem")
    private BigDecimal pedEmbalagem;
    
    @Column(name = "ped_data_hora", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pedDataHora;
    
    @Column(name = "ped_cliente", length = 50)
    private String pedCliente;
    
    @Column(name = "ped_status", length = 3, nullable = false)
    private String pedStatus;
   
    @Column(name = "ped_endereco", length = 45)
    private String pedEndereco;
    
    @JoinColumn(name = "cai_codigo", referencedColumnName = "cai_codigo")
    @ManyToOne(optional = false)
    private Caixa caiCodigo;
    
    @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")
    @ManyToOne
    private Cliente cliCodigo;

    public Pedido() {
    }

    public Pedido(Integer pedCodigo) {
        this.pedCodigo = pedCodigo;
    }

    public Pedido(Integer pedCodigo, BigDecimal pedValor, BigDecimal pedEntrega, BigDecimal pedEmbalagem, Date pedDataHora, String pedCliente, String pedStatus) {
        this.pedCodigo = pedCodigo;
        this.pedValor = pedValor;
        this.pedEntrega = pedEntrega;
        this.pedEmbalagem = pedEmbalagem;
        this.pedDataHora = pedDataHora;
        this.pedCliente = pedCliente;
        this.pedStatus = pedStatus;
    }

    public Integer getPedCodigo() {
        return pedCodigo;
    }

    public void setPedCodigo(Integer pedCodigo) {
        this.pedCodigo = pedCodigo;
    }

    public BigDecimal getPedValor() {
        return pedValor;
    }

    public void setPedValor(BigDecimal pedValor) {
        this.pedValor = pedValor;
    }

    public BigDecimal getPedEntrega() {
        return pedEntrega;
    }

    public void setPedEntrega(BigDecimal pedEntrega) {
        this.pedEntrega = pedEntrega;
    }

    public BigDecimal getPedEmbalagem() {
        return pedEmbalagem;
    }

    public void setPedEmbalagem(BigDecimal pedEmbalagem) {
        this.pedEmbalagem = pedEmbalagem;
    }

    public Date getPedDataHora() {
        return pedDataHora;
    }

    public void setPedDataHora(Date pedDataHora) {
        this.pedDataHora = pedDataHora;
    }

    public String getPedCliente() {
        return pedCliente;
    }

    public void setPedCliente(String pedCliente) {
        this.pedCliente = pedCliente;
    }

    public String getPedStatus() {
        return pedStatus;
    }

    public void setPedStatus(String pedStatus) {
        this.pedStatus = pedStatus;
    }

    public String getPedEndereco() {
        return pedEndereco;
    }

    public void setPedEndereco(String pedEndereco) {
        this.pedEndereco = pedEndereco;
    }

    public Caixa getCaiCodigo() {
        return caiCodigo;
    }

    public void setCaiCodigo(Caixa caiCodigo) {
        this.caiCodigo = caiCodigo;
    }

    public Cliente getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Cliente cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedCodigo != null ? pedCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedCodigo == null && other.pedCodigo != null) || (this.pedCodigo != null && !this.pedCodigo.equals(other.pedCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Pedido[ pedCodigo=" + pedCodigo + " ]";
    }
    
}
