
package br.com.ufes.dao;


import br.com.ufes.model.Permissoes;
import br.com.ufes.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PermissoesDao {
    
    private PermissoesDao() {
    }
    
    public static PermissoesDao getInstance() {
        return PermissoesDaoHolder.INSTANCE;
    }
    
    private static class PermissoesDaoHolder {

        private static final PermissoesDao INSTANCE = new PermissoesDao();
    }
    
    public void save(Usuario usuario) throws SQLException {
        String sql = "SELECT COUNT(*) AS EXISTE FROM PERMISSOES WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getIdUsuario());
        ResultSet rs = stmt.executeQuery();
        if(0 != rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Já Existe Permissões para este Usuário!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
          sql = "INSERT INTO PERMISSOES (CODUSU, VISUALIZAR, EXCLUIR, COMPARTILHAR) VALUES (?,?,?,?)";
          stmt = Conexao.getInstance().connect().prepareStatement(sql);
          stmt.setInt(1,usuario.getIdUsuario());
          stmt.setString(2,Interpretador.getInstance().interpreta(usuario.getPermissao().getVisualizar()));
          stmt.setString(3,Interpretador.getInstance().interpreta(usuario.getPermissao().getExcluir()));
          stmt.setString(4,Interpretador.getInstance().interpreta(usuario.getPermissao().getCompartilhar()));
          stmt.execute();
        }
    }

    public Permissoes get(int codUsu) throws SQLException {
        String sql = "SELECT * FROM PERMISSOES WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, codUsu);
        ResultSet rs = stmt.executeQuery();
        Permissoes perm = new Permissoes(Interpretador.getInstance().interpreta(rs.getString("VISUALIZAR"))
                , Interpretador.getInstance().interpreta(rs.getString("EXCLUIR"))
                , Interpretador.getInstance().interpreta(rs.getString("COMPARTILHAR"))); 
        
        return perm;
    }
    
    public void update(Usuario usuario) throws SQLException {
        String sql = "SELECT COUNT(*) AS EXISTE FROM PERMISSOES WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getIdUsuario());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Permissões Não Encontradas!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
          sql ="UPDATE PERMISSOES SET VISUALIZAR =? , EXCLUIR =? , COMPARTILHAR =? WHERE CODUSU = ?";
          stmt = Conexao.getInstance().connect().prepareStatement(sql);
          stmt.setString(1, Interpretador.getInstance().interpreta(usuario.getPermissao().getVisualizar()));
          stmt.setString(2, Interpretador.getInstance().interpreta(usuario.getPermissao().getExcluir()));
          stmt.setString(3, Interpretador.getInstance().interpreta(usuario.getPermissao().getCompartilhar()));
          stmt.setInt(4, usuario.getIdUsuario());
          stmt.executeUpdate();
                  
        }
    }   
    
    public void delete(Usuario usuario) throws SQLException {
        String sql = "SELECT COUNT(*) AS EXISTE FROM PERMISSOES WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getIdUsuario());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Permissões Não Encontradas!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
            sql = "DELETE FROM PERMISSOES WHERE CODUSU = ?";
            stmt = Conexao.getInstance().connect().prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.execute();
        }
    }

    
    public ArrayList<Permissoes> getAll() throws SQLException {
       ArrayList<Permissoes> permissoes = new ArrayList<Permissoes>();
       Statement stmt = Conexao.getInstance().connect().createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM PERMISSOES");
       while(rs.next()){
           permissoes.add(new Permissoes(Interpretador.getInstance().interpreta(rs.getString("VISUALIZAR")), Interpretador.getInstance().interpreta(rs.getString("EXCLUIR")), Interpretador.getInstance().interpreta(rs.getString("COMPARTILHAR"))));
       }
       
       return permissoes;
    }
}
