/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
public class ModeloProdutosMesas {

    /**
     * @return the codmesa
     */
    public int getCodmesa() {
        return codmesa;
    }

    /**
     * @param codmesa the codmesa to set
     */
    public void setCodmesa(int codmesa) {
        this.codmesa = codmesa;
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
     * @return the quantprod
     */
    public int getQuantprod() {
        return quantprod;
    }

    /**
     * @param quantprod the quantprod to set
     */
    public void setQuantprod(int quantprod) {
        this.quantprod = quantprod;
    }

    /**
     * @return the preço
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the tempo
     */
    public String getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    private int codmesa;
    private String nome;
    private int quantprod;
    private double preco;
    private String tempo;
}
