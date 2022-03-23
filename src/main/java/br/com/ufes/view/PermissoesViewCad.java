
package br.com.ufes.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;


public class PermissoesViewCad extends javax.swing.JFrame {

    
    public PermissoesViewCad() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        permTitleLabel = new javax.swing.JLabel();
        visualizarCheckBox = new javax.swing.JCheckBox();
        excluirCheckBox = new javax.swing.JCheckBox();
        compartilharCheckBox = new javax.swing.JCheckBox();
        definirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Permissoes");
        setName("Controle de Permissões"); // NOI18N

        permTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        permTitleLabel.setText("Controle de Permissões");

        visualizarCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        visualizarCheckBox.setText("Visualizar");

        excluirCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        excluirCheckBox.setText("Excluir");
        excluirCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCheckBoxActionPerformed(evt);
            }
        });

        compartilharCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        compartilharCheckBox.setText("Compartilhar");
        compartilharCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartilharCheckBoxActionPerformed(evt);
            }
        });

        definirButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        definirButton.setText("Definir Permissões");
        definirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(permTitleLabel)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compartilharCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(definirButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(permTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visualizarCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excluirCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compartilharCheckBox)
                .addGap(12, 12, 12)
                .addComponent(definirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirCheckBoxActionPerformed

    private void compartilharCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartilharCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compartilharCheckBoxActionPerformed

    private void definirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definirButtonActionPerformed
        
    }//GEN-LAST:event_definirButtonActionPerformed

    public JCheckBox getCompartilharCheckBox() {
        return compartilharCheckBox;
    }

    public JCheckBox getExcluirCheckBox() {
        return excluirCheckBox;
    }

    public JCheckBox getVisualizarCheckBox() {
        return visualizarCheckBox;
    } 

    public JButton getDefinirButton() {
        return definirButton;
    }

    public void setDefinirButton(JButton definirButton) {
        this.definirButton = definirButton;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox compartilharCheckBox;
    private javax.swing.JButton definirButton;
    private javax.swing.JCheckBox excluirCheckBox;
    private javax.swing.JLabel permTitleLabel;
    private javax.swing.JCheckBox visualizarCheckBox;
    // End of variables declaration//GEN-END:variables
}
