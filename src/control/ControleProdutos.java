/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import javax.swing.JOptionPane;
import model.ModeloProduto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class ControleProdutos {
    ConexaoBD conex=new ConexaoBD();
    ModeloProduto mod=new ModeloProduto();
    public void Salvar(ModeloProduto mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("INSERT INTO produtos(nome, categoria, valor_custo, valor_venda, quant_estoque)VALUES (?, ?, ?, ?, ?);");
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getCategoria());
            pat.setDouble(3,mod.getValorcusto());
            pat.setDouble(4,mod.getValorvenda());
            pat.setFloat(5,mod.getQuantestoque());
            pat.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados:/nErro:"+ex);
        }
        conex.desconecta();
    }
    public void Editar(ModeloProduto mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("UPDATE produtos SET nome=?,categoria=?,valor_custo=?,valor_venda=?,quant_estoque=? WHERE id=?" );
            pat.setString(1,mod.getNome());
            pat.setString(2,mod.getCategoria());
            pat.setDouble(3,mod.getValorcusto());
            pat.setDouble(4,mod.getValorvenda());
            pat.setFloat(5,mod.getQuantestoque());
            pat.setInt(6,mod.getCodigo());
            pat.execute();
            System.out.print("sucesso ao alterar os dados");
        } catch (SQLException ex) {
           
            System.out.print("Erro ao alterar os dados");
        }
        conex.desconecta();
    }
   public ModeloProduto BuscaProdutos(ModeloProduto mod){
       conex.conexao();
       conex.executaSql("select*from produtos where nome like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome"));
            mod.setCategoria(conex.rs.getString("categoria"));
            mod.setQuantestoque(conex.rs.getInt("quant_estoque"));
            mod.setValorcusto(conex.rs.getDouble("valor_custo"));
            mod.setValorvenda(conex.rs.getDouble("valor_venda"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados:/nErro:"+ex);
        }
       conex.desconecta();
       return mod; 
}
   public void Excluir(ModeloProduto mod){
        conex.conexao();
        try {
            PreparedStatement pat=conex.con.prepareStatement("delete from produtos where id=?");
            pat.setInt(1,mod.getCodigo());
            pat.execute();
            System.out.print("sucesso ao excluir");
        } catch (SQLException ex) {
            System.out.print("erro ao excluir");
        }
        conex.desconecta();
    }

}
