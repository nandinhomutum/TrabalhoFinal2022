
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
        try{
        String sql = "SELECT * FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, codUsu);
        ResultSet rs = stmt.executeQuery();
        if(!rs.next())
             new JOptionPane().showMessageDialog(new JFrame(),"Usuário Inválido!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        rs = stmt.executeQuery(); 
        
        Usuario usu = new Usuario(rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM"))); 
        usu.setCodUsu(codUsu);
        usu.setPermissoes(PermissoesDao.getInstance().get(codUsu));
        return usu;
        }  catch (SQLException ex) {
            return null;

        }
    }
    
    public Usuario get(String nome) {
        try{
        String sql = "SELECT * FROM USUARIO WHERE NOMEUSU = ?";
        PreparedStatement stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, nome.toUpperCase());
        ResultSet rs = stmt.executeQuery();        
        if(!rs.next())
             new JOptionPane().showMessageDialog(new JFrame(),"Usuário Inválido!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, nome.toUpperCase());
        rs = stmt.executeQuery();
        Usuario usu = new Usuario(rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
        usu.setCodUsu(rs.getInt("CODUSU"));
        usu.setPermissoes(PermissoesDao.getInstance().get(rs.getInt("CODUSU")));
        System.out.println(usu.getIsAdmin().toString()+" , "+ usu.getPermissoes().getVisualizar().toString()+" , "+usu.getPermissoes().getExcluir().toString()+","+usu.getPermissoes().getCompartilhar().toString());
        return usu;
        }  catch (SQLException ex) {
            return null;

        }
    }

    public void save(Usuario usuario) {
        try{
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE NOMEUSU = ?";
        PreparedStatement stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setString(1, usuario.getNome().toUpperCase());
        ResultSet rs = stmt.executeQuery();
        if(0 != rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Já Existe um Usuário Cadastrado com este nome!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
          sql = "INSERT INTO USUARIO (NOMEUSU, PASS, ADM) VALUES (?,?,?)";
          stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
          stmt.setString(1, usuario.getNome().toUpperCase());
          stmt.setString(2, usuario.getSenha());
          stmt.setString(3, Interpretador.getInstance().interpreta(usuario.getIsAdmin()));
          stmt.execute(); 
          
          sql = "SELECT CODUSU FROM USUARIO WHERE NOMEUSU = ?";
          stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
          stmt.setString(1, usuario.getNome().toUpperCase());
        
        rs = stmt.executeQuery();
        usuario.setCodUsu(rs.getInt("CODUSU"));
        PermissoesDao.getInstance().save(usuario);
        }
        }catch (SQLException ex) {
            //return null;

        }
    }

    
    public void update(Usuario usuario) throws SQLException {
        try{
        System.out.println(Integer.toString(usuario.getCodUsu()));
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getCodUsu());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Usuário Não Encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
           sql = "UPDATE USUARIO SET NOMEUSU =? , PASS =? , ADM = ? WHERE CODUSU =?";
          stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
          stmt.setString(1,usuario.getNome());
          stmt.setString(2,usuario.getSenha());
          stmt.setString(3,Interpretador.getInstance().interpreta(usuario.getIsAdmin()));
          stmt.setInt(4,usuario.getCodUsu());
          stmt.executeUpdate();
          PermissoesDao.getInstance().update(usuario);
        }}catch (SQLException ex) {
            //return null;

        }
    }

    
    public void delete(Usuario usuario) throws SQLException {
        try{
        String sql = "SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE CODUSU = ?";
        PreparedStatement stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
        stmt.setInt(1, usuario.getCodUsu());
        ResultSet rs = stmt.executeQuery();
        if(0 == rs.getInt("EXISTE"))
            new JOptionPane().showMessageDialog(new JFrame(),"Usuário Não Encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        else{
            sql = "DELETE FROM USUARIO WHERE CODUSU = ?";
            stmt = SQLiteConnector.getInstance().connect().prepareStatement(sql);
            stmt.setInt(1, usuario.getCodUsu());
            stmt.execute();
           PermissoesDao.getInstance().delete(usuario);
        }}catch (SQLException ex) {
            //return null;

        }
    }

    
    public ArrayList<Usuario> getAll(){
        try{
       ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
       Statement stmt = SQLiteConnector.getInstance().connect().createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO");
       /*if(rs.next()){
           Usuario usu = new Usuario(rs.getInt("CODUSU"), rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
           usu.setPermissoes(PermissoesDao.getInstance().get(rs.getInt("CODUSU")));
           usuarios.add(usu);
       }*/
       while(rs.next()){
           Usuario usu = new Usuario(rs.getInt("CODUSU"), rs.getString("NOMEUSU"), rs.getString("PASS"), Interpretador.getInstance().interpreta(rs.getString("ADM")));
           usu.setPermissoes(PermissoesDao.getInstance().get(rs.getInt("CODUSU")));
           usuarios.add(usu);
           
       }
       
       return usuarios;
        
    }catch (SQLException ex) {
            return null;

        }
    }
    
    private static class UsuarioDaoHolder {

        private static final UsuarioDao INSTANCE = new UsuarioDao();
    }
}
