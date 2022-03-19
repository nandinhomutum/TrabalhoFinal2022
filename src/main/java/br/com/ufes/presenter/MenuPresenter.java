
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Usuario;
import br.com.ufes.view.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class MenuPresenter {
    private MenuView view;
    private Usuario usuariologado;

    public MenuPresenter(Usuario usuariologado) {
        
        configurarTela(usuariologado);
        
        view.getNovoUsuarioMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Cadastro();
            }  
        });
        
        view.getListarUsuariosMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ListaUsuarios();
            }  
        });
        
        view.getMostrarMiniMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ListarImagens(usuariologado);
            }  
        });
        
        view.getTrocarUsuarioMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TrocarUsuario();
            }  
        });
        
        view.getNovoUsuarioMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TrocarUsuario();
            }  

            
        });
        
    }   
   
    public void Cadastro(){
        new CadastroUsuarioPresenter();
        
    }   
    
    public void TrocarUsuario(){
        this.view.dispose();
        this.usuariologado = null;
        new LoginPresenter();
    }  
    
    public void ListaUsuarios(){
        DefaultTableModel tabela = new DefaultTableModel();        
        tabela.addColumn("Nome");
        tabela.addColumn("É Administrador?");
        tabela.addColumn("Pode Visualizar?");
        tabela.addColumn("Pode Excluir?");
        tabela.addColumn("Pode Compartilhar?");
        
        ArrayList<Usuario> usuarios = UsuarioDao.getInstance().getAll();
        
        for(Usuario usuario : usuarios){
            tabela.addRow(new Object[]{usuario.getNome(),
                    usuario.getIsAdmin(),
                    usuario.getPermissoes().getVisualizar(),
                    usuario.getPermissoes().getExcluir(),
                    usuario.getPermissoes().getCompartilhar()
            }
            );
        }
        
        view.getUsersTable().setModel(tabela);
        
        this.view.getUsersInternalFrame().setVisible(true);
    }
    
    public void EditarUsuario() throws SQLException{
        int linha = this.view.getUsersTable().getSelectedRow();        
        
        new EdicaoDeUsuarioPresenter(this.view.getUsersTable().getValueAt(linha, 0).toString());
        this.ListaUsuarios();
    }
    
    public void ExcluirUsuario() throws SQLException{
        int linha = this.view.getUsersTable().getSelectedRow();
        System.out.println(this.view.getUsersTable().getValueAt(linha, 0).toString());
        Usuario user = UsuarioDao.getInstance().get(this.view.getUsersTable().getValueAt(linha, 0).toString());
        UsuarioDao.getInstance().delete(user);
        this.ListaUsuarios();
    }
    
    public void ListarImagens(Usuario usuariologado){
        new ImagesPresenter(usuariologado);
    }
    
    private void configurarTela(Usuario usuariologado) {
        this.view = new MenuView();
        this.view.setVisible(true);
        this.usuariologado = usuariologado; 
        this.view.getLogUserTextField().setText(usuariologado.getNome());
        if(this.usuariologado.getIsAdmin())
            this.view.getTypeUserTextField().setText("Administrador");
        else{
            this.view.getTypeUserTextField().setText("Padrão");
            this.view.getUsersMenu().setVisible(false);
        }
        this.view.getUsersInternalFrame().setVisible(false);
    }
}
