
package br.com.ufes.model;


public class Usuario {
    private int codUsu;
    private String nome;
    private String senha;
    private Boolean isAdmin;
    private Permissoes permissoes;

    public Usuario(String nome, String senha, Boolean isAdmin) {
        this.nome = nome;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }
    
    public Usuario(int codUsu, String nome, String senha, Boolean isAdmin) {
        this.codUsu = codUsu;
        this.nome = nome;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int CodUsu) {
        this.codUsu = CodUsu;
    }

    public Permissoes getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }   
}
