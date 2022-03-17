
package br.com.ufes.model;

import br.com.ufes.business.login.LoginState;


public class Usuario {
    
    private int idUsuario;
    private String login;
    private String senha;
    private Boolean admin;
    private Permissoes permissao;
    private LoginState loginState;

    public Usuario(String login, String senha, Boolean admin) {
        this.login = login;
        this.senha = senha;
        this.admin = admin;

    }

    public Usuario(int idUsuario, String login, String senha, Boolean admin) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
        this.permissao = permissao;
    }
    
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Permissoes getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissoes permissao) {
        this.permissao = permissao;
    }
    
    public LoginState getLoginState() {
		return loginState;
	}

	public void setLoginState(LoginState loginState) {
		this.loginState = loginState;
	}
    
}
