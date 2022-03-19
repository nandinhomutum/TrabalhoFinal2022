
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Usuario;
import br.com.ufes.util.ManipuladorDeComboBox;
import br.com.ufes.view.PermissoesView;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PermissoesPreseter {
    private PermissoesView view;
    Usuario user;

    public PermissoesPreseter() {
       configurarTela();
        
    }
    
    public void ListaUsuarios () throws SQLException{
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Usuario> usuarios = UsuarioDao.getInstance().getAll();
        for(Usuario usuario : usuarios){
            nomes.add(usuario.getNome());
        }
        ManipuladorDeComboBox.getInstance().listaItens(nomes, view.getUsuarioComboBox());
    }
    
    public void ListarPermissoes() throws SQLException{
        this.user = UsuarioDao.getInstance().get(view.getUsuarioComboBox().getSelectedItem().toString());
        view.getVisualizarCheckBox().setSelected(user.getPermissoes().getVisualizar());
        view.getExcluirCheckBox().setSelected(user.getPermissoes().getExcluir());
        view.getCompartilharCheckBox().setSelected(user.getPermissoes().getCompartilhar());
    }
    
    public void Salvar(){
        if(null != this.user){
            this.user.getPermissoes().setVisualizar(view.getVisualizarCheckBox().isSelected());
            this.user.getPermissoes().setExcluir(view.getExcluirCheckBox().isSelected());
            this.user.getPermissoes().setCompartilhar(view.getCompartilharCheckBox().isSelected());
        }else
            new JOptionPane().showMessageDialog(new JFrame(),"Escolha um Usuario um Usuário!","Aviso",JOptionPane.WARNING_MESSAGE);
    }
    private void configurarTela() {
        this.view = new PermissoesView();
        this.view.setVisible(true);
    }
}
