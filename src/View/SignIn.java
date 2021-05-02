/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Model.UserModel;
import javax.swing.JOptionPane;

/**
 *
 * @author B1704721
 */
public class SignIn extends javax.swing.JFrame {

    private LoginController loginController = new LoginController();

    /**
     * Creates new form
     */
    public SignIn() {
        initComponents();
        setInterface();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        buttonSignIn = new javax.swing.JButton();
        buttonQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAT - Đăng nhập");
        setResizable(false);

        labelLogo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelUsername.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelUsername.setText("Tên đăng nhập:");

        labelPassword.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelPassword.setText("Mật khẩu:");

        textUsername.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        textPassword.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        buttonSignIn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonSignIn.setText("Đăng nhập");
        buttonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignInActionPerformed(evt);
            }
        });

        buttonQuit.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonQuit.setText("Thoát");
        buttonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(buttonSignIn)
                .addGap(18, 18, 18)
                .addComponent(buttonQuit)
                .addGap(0, 116, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(textUsername))
                .addGap(50, 50, 50))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonQuit, buttonSignIn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textUsername)
                    .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonQuit)
                    .addComponent(buttonSignIn))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelPassword, labelUsername, textPassword, textUsername});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setInterface() {
        // Set frame interface
        Settings.setFrameInterface(this);
        
        // Set components
        labelLogo.setIcon(Settings.logo);
    }

    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed


        String message = "Tên đăng nhập hoặc mật khẩu không đúng!";
        String title = "Thông báo";
        UserModel model = new UserModel();
        model = loginController.handleLogin(textUsername.getText(), String.valueOf(textPassword.getPassword()));

        
        if (model.getUsername() != ""){
            if(model.getRole().equals("admin")){
                HomeAdmin homeAdmin = new HomeAdmin();
                homeAdmin.setUser(model);
                homeAdmin.setVisible(true);
                this.setVisible(false);
            }else if(model.getRole().equals("staff")){
                CreateBill createBill = new CreateBill();
                createBill.setVisible(true);
                this.setVisible(false);

//
//        if (!model.getUsername().equals("")) {
//            switch (model.getRole()) {
//                case "admin":
//                    HomeAdmin homeAdmin = new HomeAdmin();
//                    homeAdmin.setVisible(true);
//                    this.setVisible(false);
//                    break;
//                case "staff":
//                    CreateBill createBill = new CreateBill();
//                    createBill.setVisible(true);
//                    this.setVisible(false);
//                    break;

            }
        } else {
            JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonSignInActionPerformed

    private void buttonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuitActionPerformed
        loginController.closeLogin();
        System.exit(0);
    }//GEN-LAST:event_buttonQuitActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonQuit;
    private javax.swing.JButton buttonSignIn;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
