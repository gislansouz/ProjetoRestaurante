/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gislan
 */
public class ModeloProduto {

    /**
     * @return the idProduto
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the quantestoque
     */
    public float getQuantestoque() {
        return quantestoque;
    }

    /**
     * @param quantestoque the quantestoque to set
     */
    public void setQuantestoque(float quantestoque) {
        this.quantestoque = quantestoque;
    }

    /**
     * @return the valorcusto
     */
    public double getValorcusto() {
        return valorcusto;
    }

    /**
     * @param valorcusto the valorcusto to set
     */
    public void setValorcusto(double valorcusto) {
        this.valorcusto = valorcusto;
    }

    /**
     * @return the valorvenda
     */
    public double getValorvenda() {
        return valorvenda;
    }

    /**
     * @param valorvenda the valorvenda to set
     */
    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }
    private int codigo;
    private String nome;
    private String categoria;
    private float quantestoque;
    private double valorcusto;
    private double valorvenda;
    private String Pesquisa;
    private String idProduto;

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return Pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.Pesquisa = pesquisa;
    }
    
    
}
