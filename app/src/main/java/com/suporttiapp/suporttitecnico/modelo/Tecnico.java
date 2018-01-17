package com.suporttiapp.suporttitecnico.modelo;

/**
 * Created by jackson on 16/01/2018.
 */

public class Tecnico {
    private static final long serialVersionUID = 1L;
    private Integer idTecnico;
    private String nome;
    private int senha;
    private String empresa;
    private String funcao;
    private Integer avaliacao;

    public Tecnico() {
    }

    public Tecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Tecnico(Integer idTecnico, String nome, int senha, String empresa, String funcao) {
        this.idTecnico = idTecnico;
        this.nome = nome;
        this.senha = senha;
        this.empresa = empresa;
        this.funcao = funcao;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTecnico != null ? idTecnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnico)) {
            return false;
        }
        Tecnico other = (Tecnico) object;
        if ((this.idTecnico == null && other.idTecnico != null) || (this.idTecnico != null && !this.idTecnico.equals(other.idTecnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Tecnico[ idTecnico=" + idTecnico + " ]";
    }


}
