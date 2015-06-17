package VIew;


import VIew.Login_Funcionario;
import VIew.Login_Gerente;
import javax.swing.JOptionPane;


public class Frame1 extends javax.swing.JFrame {

    
    public Frame1() {
        initComponents();
    }
    
    
    
    Login_Funcionario janela1 = new Login_Funcionario();
    
    public void voltatela(String volta){
    login_funcionario.setText(volta);
        
    }
    
    
    Login_Gerente janela2 = new Login_Gerente();
    
    public void retornapalavra(String nome){
        
       login_gerente .setText(nome);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_gerente = new javax.swing.JButton();
        login_funcionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        login_gerente.setText("Gerente");
        login_gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_gerenteActionPerformed(evt);
            }
        });

        login_funcionario.setText("Funcionario");
        login_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_funcionarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 1, 1));
        jLabel1.setText("Login de Usúario:");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(82, 9, 9));
        jLabel20.setIcon(new javax.swing.ImageIcon("/home/waldirene/Imagens/Webcam/icone.png")); // NOI18N
        jLabel20.setText("Salão Seduction");
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_gerente)
                    .addComponent(login_funcionario))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_funcionarioActionPerformed
      
        //login de funcionario
        if(!this.login_funcionario.getText().isEmpty());

        if(janela1  == null){
           janela1  = new Login_Funcionario();
           janela1.setLocationRelativeTo(null);
            janela1 .setVisible(true);
            janela1 .setResizable(false);
        }
        else{
            janela1 .setLocationRelativeTo(null);
            janela1 .setVisible(true);
            janela1 .setResizable(false);
        }
       
        
        
        
        
    }//GEN-LAST:event_login_funcionarioActionPerformed

    private void login_gerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_gerenteActionPerformed

     
      //chama a index do gerente
     if(!this.login_gerente.getText().isEmpty());

        if(janela2  == null){
            janela2  = new Login_Gerente();
           janela2.setLocationRelativeTo(null);
            janela2 .setVisible(true);
            janela2 .setResizable(false);
        }
        else{
            janela2 .setLocationRelativeTo(null);
            janela2 .setVisible(true);
            janela2 .setResizable(false);
        }







    }//GEN-LAST:event_login_gerenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_funcionario;
    private javax.swing.JButton login_gerente;
    // End of variables declaration//GEN-END:variables
}
