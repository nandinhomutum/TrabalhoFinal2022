
package br.com.ufes.presenter;

import br.com.ufes.business.login.validadorSenha;
import br.com.ufes.model.Usuario;
import br.com.ufes.util.GerenciadorDeLog;
import br.com.ufes.view.TelaLoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.ufes.dao.UsuarioDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class loginPresenter {

    private TelaLoginView view;

    public loginPresenter() {
        configurarTela();

        view.getJbLogar().addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            @Override
            public void actionPerformed(ActionEvent ae) {

                String login = view.getJtLogin().getText();
                char[] senha = view.getJtSenha().getPassword();
                String senhapassada = String.valueOf(senha);

                try {
                    if (validadorSenha.getInstance().valida(login, senhapassada)) {
                        GerenciadorDeLog.getInstance().registraInfo("Usuario " + login + " fez login");
                        try {
                            new PrincipalPresenter(UsuarioDao.getInstance().getLogin(view.getJtLogin().getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(loginPresenter.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        view.dispose();
                        
                        
                    } else {
                        new JOptionPane().showMessageDialog(new JFrame(), "Senha Inválida!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(loginPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        view.getJbCriar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }

        });

    }

    private void configurarTela() {

        this.view = new TelaLoginView();
        this.view.setVisible(true);
    }

}
