/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.util;


import br.com.ufes.dao.UsuarioDao;
import java.sql.SQLException;


public class ValidadorDeSenha {
    
    private ValidadorDeSenha() {
    }
    
    public static ValidadorDeSenha getInstance() {
        return ValidadorDeSenhaHolder.INSTANCE;
    }
    
    private static class ValidadorDeSenhaHolder {

        private static final ValidadorDeSenha INSTANCE = new ValidadorDeSenha();
    }
    
    public Boolean valida(String nome, String senha) throws SQLException{
        if(senha.toUpperCase().equals(UsuarioDao.getInstance().get(nome).getSenha().toUpperCase()))
            return true;
        else 
            return false;
    }
}
