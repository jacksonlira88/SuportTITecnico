package com.suporttiapp.suporttitecnico.modelo;

import java.util.Date;

/**
 * Created by jackson on 16/01/2018.
 */

public class Chamado {
    private Integer idChamado;
    private String nomeProblema;
    private String descricaoProblema;
    private String status;
    private Integer posicao;
    private Date dataInicio;
    private Date dataFim;
    private Integer avaliacao;
    private Cliente clienteidCliente;
    private Tecnico tecnicoidTecnico;

    public Chamado() {
    }

    public Chamado(Integer idChamado) {
        this.idChamado = idChamado;
    }

    public Chamado(Integer idChamado, String nomeProblema, String descricaoProblema, Date dataInicio) {
        this.idChamado = idChamado;
        this.nomeProblema = nomeProblema;
        this.descricaoProblema = descricaoProblema;
        this.dataInicio = dataInicio;
    }

    public Integer getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Integer idChamado) {
        this.idChamado = idChamado;
    }

    public String getNomeProblema() {
        return nomeProblema;
    }

    public void setNomeProblema(String nomeProblema) {
        this.nomeProblema = nomeProblema;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Cliente getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(Cliente clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    public Tecnico getTecnicoidTecnico() {
        return tecnicoidTecnico;
    }

    public void setTecnicoidTecnico(Tecnico tecnicoidTecnico) {
        this.tecnicoidTecnico = tecnicoidTecnico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChamado != null ? idChamado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.idChamado == null && other.idChamado != null) || (this.idChamado != null && !this.idChamado.equals(other.idChamado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Chamado[ idChamado=" + idChamado + " ]";
    }

}
