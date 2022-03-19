
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Permissoes;
import br.com.ufes.model.Usuario;
import br.com.ufes.view.EdiçãoDeUsuarioView;
import br.com.ufes.view.PermissoesViewCad;
import java.sql.SQLException;
import java.util.Arrays;


public class EdicaoDeUsuarioPresenter {
    private EdiçãoDeUsuarioView view;
    private PermissoesViewCad permissoes;
    Usuario usuario;
    
    
    public EdicaoDeUsuarioPresenter(String nome) {
        configurarTela(nome);
        
        this.permissoes = new PermissoesViewCad();
        //this.view.setPermissoesButton(permissoes);
        
        
        
    }
    private void configurarTela(String nome) {
        this.view = new EdiçãoDeUsuarioView();
        this.usuario = UsuarioDao.getInstance().get(nome);
        this.view.getUserTextField().setText(usuario.getNome());
        this.view.getAdminCheckBox().setSelected(usuario.getIsAdmin());
        this.permissoes.getVisualizarCheckBox().setSelected(usuario.getPermissoes().getVisualizar());
        this.permissoes.getExcluirCheckBox().setSelected(usuario.getPermissoes().getExcluir());
        this.permissoes.getCompartilharCheckBox().setSelected(usuario.getPermissoes().getCompartilhar());
        this.view.setVisible(true);
    }
    public void editar() throws SQLException{
        Permissoes perm = new Permissoes(
                permissoes.getVisualizarCheckBox().isSelected(),
                permissoes.getExcluirCheckBox().isSelected(),
                permissoes.getCompartilharCheckBox().isSelected()
        );            
                
        usuario.setNome(view.getUserTextField().getText());
        usuario.setSenha(Arrays.toString(view.getSenhaPasswordField().getPassword()));
        usuario.setIsAdmin(view.getAdminCheckBox().isSelected());
        
        this.usuario.setPermissoes(perm);
        
        UsuarioDao.getInstance().update(this.usuario);
    }
}
