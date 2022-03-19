
package br.com.ufes.view;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;


public class PermissoesView extends javax.swing.JFrame {

  
    public PermissoesView() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        permTitleLabel = new javax.swing.JLabel();
        visualizarCheckBox = new javax.swing.JCheckBox();
        excluirCheckBox = new javax.swing.JCheckBox();
        compartilharCheckBox = new javax.swing.JCheckBox();
        comfirmarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        usuarioComboBox = new javax.swing.JComboBox<>();
        usuarioLabel = new javax.swing.JLabel();

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

        comfirmarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comfirmarButton.setText("Confirmar");
        comfirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirmarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelarButton.setText("Fechar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        usuarioComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioComboBoxActionPerformed(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuarioLabel.setText("Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compartilharCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(permTitleLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comfirmarButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(usuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(permTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visualizarCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compartilharCheckBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comfirmarButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
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

    private void usuarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioComboBoxActionPerformed
       
    }//GEN-LAST:event_usuarioComboBoxActionPerformed

    private void comfirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmarButtonActionPerformed
               
    }//GEN-LAST:event_comfirmarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        
    }//GEN-LAST:event_cancelarButtonActionPerformed


    public JComboBox<String> getUsuarioComboBox() {
        return usuarioComboBox;
    }    

    public JCheckBox getCompartilharCheckBox() {
        return compartilharCheckBox;
    }

    public JCheckBox getExcluirCheckBox() {
        return excluirCheckBox;
    }

    public JCheckBox getVisualizarCheckBox() {
        return visualizarCheckBox;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getComfirmarButton() {
        return comfirmarButton;
    }

    public void setComfirmarButton(JButton comfirmarButton) {
        this.comfirmarButton = comfirmarButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton comfirmarButton;
    private javax.swing.JCheckBox compartilharCheckBox;
    private javax.swing.JCheckBox excluirCheckBox;
    private javax.swing.JLabel permTitleLabel;
    private javax.swing.JComboBox<String> usuarioComboBox;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JCheckBox visualizarCheckBox;
    // End of variables declaration//GEN-END:variables
}
