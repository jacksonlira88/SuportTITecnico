package com.suporttiapp.suporttitecnico.modelo;

import java.util.Collection;

/**
 * Created by jackson on 16/01/2018.
 */

public class Setor {
    private Integer idSetor;
    private String nome;
    private int prioridade;
    private Collection<Cliente> clienteCollection;

    public Setor() {
    }

    public Setor(Integer idSetor) {
        this.idSetor = idSetor;
    }

    public Setor(Integer idSetor, String nome, int prioridade) {
        this.idSetor = idSetor;
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) {
        this.idSetor = idSetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSetor != null ? idSetor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.idSetor == null && other.idSetor != null) || (this.idSetor != null && !this.idSetor.equals(other.idSetor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Setor[ idSetor=" + idSetor + " ]";
    }

}
