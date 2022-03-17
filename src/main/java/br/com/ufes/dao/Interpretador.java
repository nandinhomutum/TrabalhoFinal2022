
package br.com.ufes.dao;


public class Interpretador {
    
    private Interpretador() {
    }
    
    public static Interpretador getInstance() {
        return InterpretadorHolder.INSTANCE;
    }
    
    private static class InterpretadorHolder {

        private static final Interpretador INSTANCE = new Interpretador();
    }
    
    public Boolean interpreta(String opcao){
        if(opcao.contains("'N'") || opcao.contains("N"))
            return false;
        else
            return true;
    }
    
    public String interpreta(Boolean opcao){
        if(opcao)
            return "'S'";
        else
            return "'N'";
    }
}
