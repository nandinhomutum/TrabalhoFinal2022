
package br.com.ufes.presenter;


import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.util.ValidadorDeSenha;
import br.com.ufes.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;


public class LoginPresenter {
    private LoginView view;

    public LoginPresenter() {
        configurarTela();
        
        view.getSairButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sair();
            }  
        });
        
        view.getCadastroLabel().addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                Cadastro();
            }  
        });
        
        view.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    Logar();
                } 
        });    
    }    
    
    public void Cadastro(){
       new CadastroUsuarioPresenter();
    }    
    
    public void Logar(){
        if(ValidadorDeSenha.getInstance().valida(view.getUserTextField().getText(), Arrays.toString(view.getSenhaPasswordField().getPassword()))){
            new MenuPresenter(UsuarioDao.getInstance().get(view.getUserTextField().getText()));
            sair();
        }else{
            new JOptionPane().showMessageDialog(new JFrame(),"Senha Inválida!","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void sair() {
        view.dispose();
      }

    private void configurarTela() {
        this.view = new LoginView();
        this.view.setVisible(true);
    }
}
