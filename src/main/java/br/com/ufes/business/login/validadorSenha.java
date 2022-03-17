
package br.com.ufes.business.login;

import java.sql.SQLException;

import br.com.ufes.dao.UsuarioDao;
import br.com.ufes.model.Usuario;


public class validadorSenha {
    
    
    private validadorSenha() {
    }
    
    public static validadorSenha getInstance() {
        return validadorSenhaHolder.INSTANCE;
    }
    
    private static class validadorSenhaHolder {

        private static final validadorSenha INSTANCE = new validadorSenha();
    }
    
    public Boolean valida(String log, String senha) throws SQLException{
        
        Usuario user = UsuarioDao.getInstance().getLogin(log);
        
        System.out.println(user.getSenha());
        System.out.println(senha);
        if(senha.equals(user.getSenha()) && !user.getLoginState().isLogado())
        	user.getLoginState().mudaEstado(user);
        
        return user.getLoginState().isLogado();
    }
}


