
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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "tbl_mesa")
public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mes_codigo")
    private Integer mesCodigo;
    
    @Column(name = "mes_id", length = 10)
    private String mesId;
    
    @Column(name = "mes_responsavel", length = 50)
    private String mesResponsavel;
    
    @Column(name = "mes_situacao", length = 3, nullable = false)
    private String mesSituacao;
    
    @Column(name = "mes_valor")
    private BigDecimal mesValor;

    @Column(name = "mes_pagamento", length = 3)
    private String mesPagamento;
    
    @Column(name = "mes_desconto")
    private BigDecimal mesDesconto;
    
    @Column(name = "mes_data_hora", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date mesDataHora;
    
    @Lob
    @Column(name = "mes_obs")
    private String mesObs;
    
    @Column(name = "mes_debito")
    private BigDecimal mesDebito;
    
    @JoinColumn(name = "cai_codigo", referencedColumnName = "cai_codigo")
    @ManyToOne(optional = false)
    private Caixa caiCodigo;
    
    @JoinColumn(name = "usu_codigo", referencedColumnName = "usu_codigo")
    @ManyToOne(optional = false)
    private Usuario usuCodigo;

    public Mesa() {
    }

    public Mesa(Integer mesCodigo) {
        this.mesCodigo = mesCodigo;
    }

    public Mesa(Integer mesCodigo, String mesResponsavel, String mesSituacao, BigDecimal mesValor, Date mesDataHora) {
        this.mesCodigo = mesCodigo;
        this.mesResponsavel = mesResponsavel;
        this.mesSituacao = mesSituacao;
        this.mesValor = mesValor;
        this.mesDataHora = mesDataHora;
    }

    public Integer getMesCodigo() {
        return mesCodigo;
    }

    public void setMesCodigo(Integer mesCodigo) {
        this.mesCodigo = mesCodigo;
    }

    public String getMesId() {
        return mesId;
    }

    public void setMesId(String mesId) {
        this.mesId = mesId;
    }

    public String getMesResponsavel() {
        return mesResponsavel;
    }

    public void setMesResponsavel(String mesResponsavel) {
        this.mesResponsavel = mesResponsavel;
    }

    public String getMesSituacao() {
        return mesSituacao;
    }

    public void setMesSituacao(String mesSituacao) {
        this.mesSituacao = mesSituacao;
    }

    public BigDecimal getMesValor() {
        return mesValor;
    }

    public void setMesValor(BigDecimal mesValor) {
        this.mesValor = mesValor;
    }

    public String getMesPagamento() {
        return mesPagamento;
    }

    public void setMesPagamento(String mesPagamento) {
        this.mesPagamento = mesPagamento;
    }

    public BigDecimal getMesDesconto() {
        return mesDesconto;
    }

    public void setMesDesconto(BigDecimal mesDesconto) {
        this.mesDesconto = mesDesconto;
    }

    public Date getMesDataHora() {
        return mesDataHora;
    }

    public void setMesDataHora(Date mesDataHora) {
        this.mesDataHora = mesDataHora;
    }

    public String getMesObs() {
        return mesObs;
    }

    public void setMesObs(String mesObs) {
        this.mesObs = mesObs;
    }

    public BigDecimal getMesDebito() {
        return mesDebito;
    }

    public void setMesDebito(BigDecimal mesDebito) {
        this.mesDebito = mesDebito;
    }

    public Caixa getCaiCodigo() {
        return caiCodigo;
    }

    public void setCaiCodigo(Caixa caiCodigo) {
        this.caiCodigo = caiCodigo;
    }

    public Usuario getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(Usuario usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesCodigo != null ? mesCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.mesCodigo == null && other.mesCodigo != null) || (this.mesCodigo != null && !this.mesCodigo.equals(other.mesCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifpb.daca.barcommerce.bean.Mesa[ mesCodigo=" + mesCodigo + " ]";
    }
    
}
