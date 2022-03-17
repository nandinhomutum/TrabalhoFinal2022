package br.com.ufes.business.login;

import br.com.ufes.model.Usuario;

public abstract class LoginState {
	
	protected Boolean logado;

	public Boolean isLogado() {
		return logado;
	}
	
	public abstract void mudaEstado(Usuario usuario);

}
