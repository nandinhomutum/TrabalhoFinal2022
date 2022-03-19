
package br.com.ufes.util;

import java.util.ArrayList;
import javax.swing.JComboBox;


public class ManipuladorDeComboBox {
    
    private ManipuladorDeComboBox() {
    }
    
    public static ManipuladorDeComboBox getInstance() {
        return ManipuladorDeComboBoxHolder.INSTANCE;
    }
    
    private static class ManipuladorDeComboBoxHolder {

        private static final ManipuladorDeComboBox INSTANCE = new ManipuladorDeComboBox();
    }
    
    public void limpaItens(JComboBox<String> jcb){
            jcb.removeAllItems();                    
    }
    
    public void listaItens(ArrayList<String> itens ,JComboBox<String> jcb){
            jcb.removeAllItems();
            for(String item : itens){
                jcb.addItem(item);
            }
    }
}
