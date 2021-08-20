/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import model.ModeloProduto;

/**
 *
 * @author gislan
 */
public class teste {

    public void Datahora(){
    String data="dd/MM/yyyy";
    String hora="HH:mm";
    String dataconta,horaconta;
    java.util.Date agora=new java.util.Date();
    SimpleDateFormat formata= new SimpleDateFormat(data);
    dataconta=formata.format(agora);
    formata=new SimpleDateFormat(hora);
    horaconta=formata.format(agora);
    }
    /*mod.setPesquisa(CampoPesquisa.getText());
        ModeloProduto model=control.BuscaProdutos(mod);
        camponome.setText(model.getNome());
        ComboBoxCategoria.setSelectedItem(model.getCategoria());
        CampoPrecoCusto.setText(String.valueOf(model.getValorcusto()));
        CampoPrecoVenda.setText(String.valueOf(model.getValorvenda()));
        CampoQuantEstoque.setText(String.valueOf(model.getQuantestoque()));
    public static void main(String[] args) {*/

    /**
     *
     * @return
     */
 
    }
