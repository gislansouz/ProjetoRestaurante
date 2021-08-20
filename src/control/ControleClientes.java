/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.ModeloClientes;
public class ControleClientes {
    ConexaoBD conex=new ConexaoBD();
    ModeloClientes mod=new ModeloClientes();
    public void Salvar(ModeloClientes mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("INSERT INTO clientes(nome,datanasc,telefone, rua, numero,bairro,cidade,cep)VALUES (?,?,?,?, ?, ?,?,?);");
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getDatanasc());
            pat.setString(3,mod.getTelefone());
            pat.setString(4,mod.getRua());
            pat.setString(5,mod.getNumero());
            pat.setString(6,mod.getBairro());
            pat.setString(7,mod.getCidade());
            pat.setString(8,mod.getCep());
            pat.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados:/nErro:"+ex);
        }
        conex.desconecta();
    }
    public void Editar(ModeloClientes mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("UPDATE clientes SET nome=?,datanasc=?,telefone=?,rua=?,numero=?,bairro=?,cidade=?,cep=? WHERE id=?" );
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getDatanasc());
            pat.setString(3,mod.getTelefone());
            pat.setString(4,mod.getRua());
            pat.setString(5,mod.getNumero());
            pat.setString(6,mod.getBairro());
            pat.setString(7,mod.getCidade());
            pat.setString(8,mod.getCep());
            pat.setInt(9,mod.getCodigo());
            pat.execute();
            System.out.print("sucesso ao alterar os dados");
        } catch (SQLException ex) {
            System.out.print("Erro ao alterar os dados");
        }
        conex.desconecta();
    }
    public void Excluir(ModeloClientes mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("delete from clientes where id=?");
            pat.setInt(1,mod.getCodigo());
            pat.execute();
            System.out.print("sucesso ao excluir");
        } catch (SQLException ex) {
            System.out.print("erro ao excluir");
        }
        conex.desconecta();
    }
}
