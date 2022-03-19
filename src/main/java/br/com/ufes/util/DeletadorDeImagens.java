
package br.com.ufes.util;

import java.io.File;


public class DeletadorDeImagens {
    
    private DeletadorDeImagens() {
    }
    
    public static DeletadorDeImagens getInstance() {
        return DeletadorDeImagensHolder.INSTANCE;
    }
    
    private static class DeletadorDeImagensHolder {

        private static final DeletadorDeImagens INSTANCE = new DeletadorDeImagens();
    }
    
    public Boolean deletar(String path){
           File arquivo = new File(path); 
    if (arquivo.delete()) { 
      System.out.println("Deleted the file: " + arquivo.getName());
      return true;
    } else {
      System.out.println("Failed to delete the file.");
      return false;
    } 
    }
}
