package br.com.ufes.business.login;

import br.com.ufes.model.Usuario;



public class DeslogadoState extends LoginState {
	
	

	public DeslogadoState() {
		super();
		this.logado = Boolean.FALSE;
	}

	@Override
	public void mudaEstado(Usuario usuario) {
		usuario.setLoginState(new LogadoState());
	}

}
