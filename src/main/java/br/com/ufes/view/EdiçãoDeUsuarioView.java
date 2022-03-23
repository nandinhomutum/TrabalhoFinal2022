
package br.com.ufes.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class EdiçãoDeUsuarioView extends javax.swing.JFrame {

    
    public EdiçãoDeUsuarioView() {
        initComponents();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarTitle = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminCheckBox = new javax.swing.JCheckBox();
        cancelarButton = new javax.swing.JButton();
        permissoesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        editarTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        editarTitle.setText("Edição de Usuário");

        UserLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UserLabel.setText("Usuário:");

        userTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        senhaPasswordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        senhaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senhaLabel.setText("Senha:");

        salvarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminLabel.setText("Administrador?");

        cancelarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        permissoesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        permissoesButton.setText("Permissoes");
        permissoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissoesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adminLabel)
                                    .addComponent(salvarButton))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adminCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(permissoesButton))
                                    .addComponent(cancelarButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UserLabel)
                                    .addComponent(senhaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                    .addComponent(senhaPasswordField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(editarTitle)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(editarTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserLabel)
                            .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaLabel)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(permissoesButton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(cancelarButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void permissoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permissoesButtonActionPerformed
        
    }//GEN-LAST:event_permissoesButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
       
    }//GEN-LAST:event_salvarButtonActionPerformed


    public JCheckBox getAdminCheckBox() {
        return adminCheckBox;
    }

    public JPasswordField getSenhaPasswordField() {
        return senhaPasswordField;
    }

    public JTextField getUserTextField() {
        return userTextField;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getPermissoesButton() {
        return permissoesButton;
    }

    public void setPermissoesButton(JButton permissoesButton) {
        this.permissoesButton = permissoesButton;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(JButton salvarButton) {
        this.salvarButton = salvarButton;
    }

      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLabel;
    private javax.swing.JCheckBox adminCheckBox;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel editarTitle;
    private javax.swing.JButton permissoesButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
