package br.com.ufes.business.login;

import br.com.ufes.model.Usuario;

public class LogadoState extends LoginState {
	
	

	public LogadoState() {
		super();
		this.logado = Boolean.TRUE;
	}

	@Override
	public void mudaEstado(Usuario usuario) {
		usuario.setLoginState(new DeslogadoState());
	}

}
