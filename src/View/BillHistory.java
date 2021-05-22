/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BillController;
import Controller.UserController;

import Model.BillModel;
import Model.UserModel;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B1704721
 */
public class BillHistory extends javax.swing.JFrame {

    private BillController billController;

    /**
     * Creates new form
     */
    public BillHistory() {
        initComponents();
        setInterface();
        loadTable();
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
        buttonDetail = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableBillHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAT - Lịch sử hóa đơn");

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("LỊCH SỬ HÓA ĐƠN");

        buttonDetail.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonDetail.setText("Xem chi tiết");
        buttonDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailActionPerformed(evt);
            }
        });

        buttonReturn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonReturn.setText("Trở về");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

        tableBillHistory.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tableBillHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Người tạo", "Thời gian tạo", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(tableBillHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTable)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDetail)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReturn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonDetail, buttonReturn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitle)
                .addGap(30, 30, 30)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDetail)
                    .addComponent(buttonReturn))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonDetail, buttonReturn});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailActionPerformed
        try {
            int selectedRow = tableBillHistory.getSelectedRow();
            int id = (int) tableBillHistory.getValueAt(selectedRow, 0);
            BillDetail billDetail = new BillDetail(billController.get(id));
            billDetail.setVisible(true);
        } catch (Exception ex) {
            OptionPane.showMessageDialog("Lỗi", "Chưa chọn dòng nào trong bảng.");
        }
    }//GEN-LAST:event_buttonDetailActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void setInterface() {
        // Set frame interface
        Settings.setFrameInterface(this);

        // Set table interface
        Settings.setTableInterface(tableBillHistory, scrollPaneTable);
    }

    private void loadTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tableBillHistory.getModel();
        int rowCount = tableModel.getRowCount();
        while (rowCount > 0) {
            tableModel.removeRow(0);
            rowCount--;
        }
        billController = new BillController();
        List<BillModel> bills = billController.get();
        UserController userController = new UserController();
        List<UserModel> users = userController.get();
        for (BillModel item : bills) {
            Object[] data = new Object[4];
            data[0] = item.getId();
            for (UserModel user : users) {
                if (user.getId() == item.getCreatorId()) {
                    data[1] = user.getFullName();
                    break;
                }
            }
            data[2] = item.getCreateTime();
            data[3] = item.getTotal();
            tableModel.addRow(data);
        }
    }

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
            java.util.logging.Logger.getLogger(BillHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDetail;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableBillHistory;
    // End of variables declaration//GEN-END:variables
}