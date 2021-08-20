/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class ModeloUsuario {

    /**
     * @return the Idusurio
     */
    public Integer getIdusuario() {
        return idusuario;
    }

    /**
     * @param Idusuario the Idusurio to set
     */
    public void setIdusuario(Integer Idusuario) {
        this.idusuario = Idusuario;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the confsenha
     */
    public String getConfsenha() {
        return confsenha;
    }

    /**
     * @param confsenha the confsenha to set
     */
    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }
    private Integer idusuario;
    private String nome;
    private String senha;
    private String confsenha;
    private String tipo;
}
