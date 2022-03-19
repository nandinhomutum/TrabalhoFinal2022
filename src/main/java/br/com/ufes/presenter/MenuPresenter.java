
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Usuario;
import br.com.ufes.view.MenuView;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class MenuPresenter {
    private MenuView view;
    private Usuario usuariologado;

    public MenuPresenter(Usuario usuariologado) {
        
        configurarTela();
        
        
        
    }   
    
    public void Cadastro() throws SQLException{
        //new CadastroUsuarioView().setVisible(true);
        this.ListaUsuarios();
    }   
    
    public void TrocarUsuario(){
        this.view.dispose();
        this.usuariologado = null;
        new LoginPresenter();
    }  
    
    public void ListaUsuarios() throws SQLException{
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
        
       // new EdicaoDeUsuarioPreseter(this.view.getUsersTable().getValueAt(linha, 0).toString());
        this.ListaUsuarios();
    }
    
    public void ExcluirUsuario() throws SQLException{
        int linha = this.view.getUsersTable().getSelectedRow();
        //System.out.println(this.view.getUsersTable().getValueAt(linha, 0).toString());
        Usuario user = UsuarioDao.getInstance().get(this.view.getUsersTable().getValueAt(linha, 0).toString());
        UsuarioDao.getInstance().delete(user);
        this.ListaUsuarios();
    }
    
    public void ListarImagens() throws IOException{
        //new ImagesPreseter(this.usuariologado);
    }
    
    private void configurarTela() {
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
