
package br.com.ufes.model;

public class Permissoes {

    private Boolean excluir;
    private Boolean compartilhar;
    private Boolean visualizar;

    public Permissoes(Boolean excluir, Boolean compartilhar, Boolean visualizar) {
        this.excluir = excluir;
        this.compartilhar = compartilhar;
        this.visualizar = visualizar;
    }

    
    
    public Boolean getExcluir() {
        return excluir;
    }

    public void setExcluir(Boolean excluir) {
        this.excluir = excluir;
    }

    public Boolean getCompartilhar() {
        return compartilhar;
    }

    public void setCompartilhar(Boolean compartilhar) {
        this.compartilhar = compartilhar;
    }

    public Boolean getVisualizar() {
        return visualizar;
    }

    public void setVisualizar(Boolean visualizar) {
        this.visualizar = visualizar;
    }

    
}
