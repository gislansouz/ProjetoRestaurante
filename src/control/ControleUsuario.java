/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloUsuario;

/**
 *
 * @author gislan
 */
public class ControleUsuario {
    ConexaoBD conex=new ConexaoBD();
    ModeloUsuario mod=new ModeloUsuario();
    public void Salvar(ModeloUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("INSERT INTO usuario(usuario,senha,tipo)VALUES (?,?,?);");
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getSenha());
            pat.setString(3,mod.getTipo());
            pat.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados:/nErro:"+ex);
        }
        conex.desconecta();
    }
    public void Editar(ModeloUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("UPDATE usuario SET usuario=?,senha=?,tipo=? WHERE id=?" );
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getSenha());
            pat.setString(3,mod.getTipo());
            pat.setInt(4,mod.getIdusuario());
            pat.execute();
            System.out.print("sucesso ao alterar os dados");
        } catch (SQLException ex) {
           
            System.out.print("Erro ao alterar os dados");
        }
        conex.desconecta();
    }
       public void Excluir(ModeloUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("delete from usuario where id=?");
            pat.setInt(1,mod.getIdusuario());
            pat.execute();
            System.out.print("sucesso ao excluir");
        } catch (SQLException ex) {
            System.out.print("erro ao excluir");
        }
        conex.desconecta();
    }
}
