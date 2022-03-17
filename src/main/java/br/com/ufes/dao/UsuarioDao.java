package br.com.ufes.dao;


import br.com.ufes.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UsuarioDao{
    
    private UsuarioDao() {
    }
    
    public static UsuarioDao getInstance() {
        return UsuarioDaoHolder.INSTANCE;
    }
    
    public Usuario get(int codUsu) throws SQLException {
        String sql = "SELECT * FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, codUsu);
        ResultSet rs = stmt.executeQuery();
        if(!rs.next())
             new JOptionPane().showMessageDialog(new JFrame(),"Usuário Inválido!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        rs = stmt.executeQuery(); 
       
        Usuario user = new Usuario(rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
        user.setIdUsuario(codUsu);
        user.setPermissao(PermissoesDao.getInstance().get(codUsu));
        return user;
    }
    
    public Usuario getLogin(String nome) throws SQLException {
        String sql = "SELECT * FROM USUARIO WHERE NOMEUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, nome.toUpperCase());
        ResultSet rs = stmt.executeQuery();        
        if(!rs.next())
             new JOptionPane().showMessageDialog(new JFrame(),"Usuário Inválido!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, nome.toUpperCase());
        rs = stmt.executeQuery();
        Usuario usu = new Usuario(rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
        usu.setIdUsuario(rs.getInt("CODUSU"));
        usu.setPermissao(PermissoesDao.getInstance().get(rs.getInt("CODUSU")));
        System.out.println(usu.getAdmin().toString()+" , "+ usu.getPermissao().getVisualizar().toString()+" , "+usu.getPermissao().getExcluir().toString()+","+usu.getPermissao().getCompartilhar().toString());
        return usu;
    }

    public void save(Usuario usuario) throws SQLException {
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE NOMEUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, usuario.getLogin().toUpperCase());
        ResultSet rs = stmt.executeQuery();
        if(0 != rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Já Existe um Usuário Cadastrado com este nome!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
          sql = "INSERT INTO USUARIO (NOMEUSU, PASS, ADM) VALUES (?,?,?)";
          stmt = Conexao.getInstance().connect().prepareStatement(sql);
          stmt.setString(1, usuario.getLogin().toUpperCase());
          stmt.setString(2, usuario.getSenha());
          stmt.setString(3, Interpretador.getInstance().interpreta(usuario.getAdmin()));
          stmt.execute(); 
          
          sql = "SELECT CODUSU FROM USUARIO WHERE NOMEUSU = ?";
          stmt = Conexao.getInstance().connect().prepareStatement(sql);
          stmt.setString(1, usuario.getLogin().toUpperCase());
        
        rs = stmt.executeQuery();
        usuario.setIdUsuario(rs.getInt("CODUSU"));
        PermissoesDao.getInstance().save(usuario);
        }
    }

    
    public void update(Usuario usuario) throws SQLException {
        System.out.println(Integer.toString(usuario.getIdUsuario()));
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getIdUsuario());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Usuário Não Encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
           sql = "UPDATE USUARIO SET NOMEUSU =? , PASS =? , ADM = ? WHERE CODUSU =?";
          stmt = Conexao.getInstance().connect().prepareStatement(sql);
          stmt.setString(1,usuario.getLogin());
          stmt.setString(2,usuario.getSenha());
          stmt.setString(3,Interpretador.getInstance().interpreta(usuario.getAdmin()));
          stmt.setInt(4,usuario.getIdUsuario());
          stmt.executeUpdate();
          PermissoesDao.getInstance().update(usuario);
        }
    }

    
    public void delete(Usuario usuario) throws SQLException {
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = Conexao.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getIdUsuario());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Usuário Não Encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
            sql = "DELETE FROM USUARIO WHERE CODUSU = ?";
            stmt = Conexao.getInstance().connect().prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.execute();
           PermissoesDao.getInstance().delete(usuario);
        }
    }

    
    public ArrayList<Usuario> getAll() throws SQLException {
       ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
       Statement stmt = Conexao.getInstance().connect().createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO");
     
       while(rs.next()){
           Usuario usu = new Usuario(rs.getInt("CODUSU"), rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
           usu.setPermissao(PermissoesDao.getInstance().get(rs.getInt("CODUSU")));
           usuarios.add(usu);
           
       }
       
       return usuarios;
    }
    
    private static class UsuarioDaoHolder {

        private static final UsuarioDao INSTANCE = new UsuarioDao();
    }
}
