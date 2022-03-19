
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Permissoes;
import br.com.ufes.model.Usuario;
import br.com.ufes.view.CadastroUsuarioView;
import br.com.ufes.view.PermissoesViewCad;
import java.sql.SQLException;
import java.util.Arrays;


public class CadastroUsuarioPresenter {
    private CadastroUsuarioView view;
    private PermissoesViewCad permissoes;
    private Usuario user;

    public CadastroUsuarioPresenter() {
        configurarTela();
        this.permissoes = permissoes;
    }
    
    public void cadastrar() throws SQLException{
        Permissoes perm = new Permissoes(
                permissoes.getVisualizarCheckBox().isSelected(),
                permissoes.getExcluirCheckBox().isSelected(),
                permissoes.getCompartilharCheckBox().isSelected()
        );
        Usuario user = new Usuario(
                view.getUserTextField().getText(),
                Arrays.toString(view.getSenhaPasswordField().getPassword()),
                view.getAdminCheckBox().isSelected()
        );
        user.setPermissoes(perm);
        
        if(UsuarioDao.getInstance().getAll().isEmpty()){
            user.setIsAdmin(Boolean.TRUE);
        }
        UsuarioDao.getInstance().save(user);
    }
    
    private void configurarTela() {
        this.view = new CadastroUsuarioView();
        this.view.setVisible(true);
    }
}
