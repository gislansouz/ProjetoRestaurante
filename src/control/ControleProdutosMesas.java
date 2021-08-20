/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import javax.swing.JOptionPane;
import model.ModeloProdutosMesas;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class ControleProdutosMesas {
    ConexaoBD conex=new ConexaoBD();
    ModeloProdutosMesas mod=new ModeloProdutosMesas();
    public void Salvar(ModeloProdutosMesas mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("INSERT INTO produtosmesas(idmesa,produtos,quant,preco,tempo)VALUES (?, ?, ?, ?, ?);");
            pat.setInt(1,mod.getCodmesa());
            pat.setString(2,mod.getNome());
            pat.setInt(3,mod.getQuantprod());
            pat.setDouble(4,mod.getPreco());
            pat.setString(5,mod.getTempo());
            pat.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados:/nErro:"+ex);
        }
        conex.desconecta();
    }
}
