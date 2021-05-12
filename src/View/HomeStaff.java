/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.StaffController;
import Model.UserModel;
import javax.swing.ImageIcon;


/**
 *
 * @author B1704721
 */
public class HomeStaff extends javax.swing.JFrame {


    private ImageIcon icon2 = new ImageIcon("src\\others\\icon-manage-bill.png");
    private ImageIcon icon3 = new ImageIcon("src\\others\\icon-manage-beverage.png");
    private ImageIcon icon4 = new ImageIcon("src\\others\\icon-sign-out.png");
    private StaffController staffController = new StaffController();
    private UserModel userModel = new UserModel();

    /**
     * Creates new form
     */
    public HomeStaff() {
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

        labelTitle = new javax.swing.JLabel();
        buttonCreateBill = new javax.swing.JButton();
        buttonManageBeverage = new javax.swing.JButton();
        buttonSignOut = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuCreateBill = new javax.swing.JMenu();
        menuManageBeverage = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenu();
        menuItemSignOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAT - Trang chủ");
        setResizable(false);

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("HỆ THỐNG QUẢN LÝ QUÁN NƯỚC KISS A TEN");

        buttonCreateBill.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCreateBill.setToolTipText("Tạo hóa đơn");
        buttonCreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateBillActionPerformed(evt);
            }
        });

        buttonManageBeverage.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonManageBeverage.setToolTipText("Quản lý thức uống");
        buttonManageBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageBeverageActionPerformed(evt);
            }
        });

        buttonSignOut.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonSignOut.setToolTipText("Đăng xuất");
        buttonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignOutActionPerformed(evt);
            }
        });

        menuBar.setToolTipText("");
        menuBar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        menuCreateBill.setText("Tạo hóa đơn   ");
        menuCreateBill.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        menuCreateBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCreateBillMouseClicked(evt);
            }
        });
        menuBar.add(menuCreateBill);

        menuManageBeverage.setText("Quản lý thức uống   ");
        menuManageBeverage.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        menuManageBeverage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuManageBeverageMouseClicked(evt);
            }
        });
        menuBar.add(menuManageBeverage);

        menuUser.setText("Đăng xuất   ");
        menuUser.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        menuItemSignOut.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        menuItemSignOut.setText("Đăng xuất ");
        menuItemSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSignOutActionPerformed(evt);
            }
        });
        menuUser.add(menuItemSignOut);

        menuBar.add(menuUser);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonManageBeverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(buttonSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCreateBill, buttonManageBeverage, buttonSignOut});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitle)
                .addGap(30, 30, 30)
                .addComponent(buttonCreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonManageBeverage, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCreateBill, buttonManageBeverage, buttonSignOut});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    /**
     * Lay username o day
     * @param model 
     */
    public void setUser(UserModel model){
        userModel.setId(model.getId());
        userModel.setRole(model.getRole());
        userModel.setUsername(model.getUsername());
        menuUser.setText(userModel.getUsername());
    }
    private void setInterface() {
        // Set frame interface
        Settings.setFrameInterface(this);
        
        // Set components
        buttonCreateBill.setIcon(Settings.manageBillIcon);
        buttonManageBeverage.setIcon(Settings.manageBeverageIcon);
        buttonSignOut.setIcon(Settings.signOutIcon);
        labelTitle.requestFocus();

    }
    
    private void buttonCreateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateBillActionPerformed
        CreateBill form = new CreateBill();
        form.setUser(userModel);
        form.setVisible(true);
    }//GEN-LAST:event_buttonCreateBillActionPerformed

    private void buttonManageBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageBeverageActionPerformed
        ManageBeverage form = new ManageBeverage();
        form.setVisible(true);
    }//GEN-LAST:event_buttonManageBeverageActionPerformed

    private void buttonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignOutActionPerformed
        this.dispose();
        this.getParent().setVisible(true);
    }//GEN-LAST:event_buttonSignOutActionPerformed

    private void menuManageBeverageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuManageBeverageMouseClicked
        ManageBeverage form = new ManageBeverage();
        form.setVisible(true);
    }//GEN-LAST:event_menuManageBeverageMouseClicked

    private void menuCreateBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCreateBillMouseClicked
        CreateBill form = new CreateBill();
        form.setVisible(true);
    }//GEN-LAST:event_menuCreateBillMouseClicked

    private void menuItemSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOutActionPerformed
        // Sign out
    }//GEN-LAST:event_menuItemSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(HomeStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreateBill;
    private javax.swing.JButton buttonManageBeverage;
    private javax.swing.JButton buttonSignOut;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCreateBill;
    private javax.swing.JMenuItem menuItemSignOut;
    private javax.swing.JMenu menuManageBeverage;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
