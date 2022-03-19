
package br.com.ufes.model;


public class Permissoes {
    private Boolean visualizar;
    private Boolean excluir;
    private Boolean Compartilhar;

    public Permissoes(Boolean visualizar, Boolean excluir, Boolean Compartilhar) {
        this.visualizar = visualizar;
        this.excluir = excluir;
        this.Compartilhar = Compartilhar;
    }    
    

    public Boolean getVisualizar() {
        return visualizar;
    }

    public void setVisualizar(Boolean visualizar) {
        this.visualizar = visualizar;
    }

    public Boolean getExcluir() {
        return excluir;
    }

    public void setExcluir(Boolean excluir) {
        this.excluir = excluir;
    }

    public Boolean getCompartilhar() {
        return Compartilhar;
    }

    public void setCompartilhar(Boolean Compartilhar) {
        this.Compartilhar = Compartilhar;
    }    
    
}
