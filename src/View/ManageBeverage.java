/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.DefaultCellEditor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author B1704721
 */
public class ManageBeverage extends javax.swing.JFrame {
    
    private Font myFont = new Font("Times New Roman", Font.PLAIN, 22);

    /**
     * Creates new form
     */
    public ManageBeverage() {
        initComponents();
        tableBeverage.getTableHeader().setFont(myFont);
        ((DefaultTableCellRenderer) tableBeverage.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
        
        tableBeverage.setRowHeight(30);
        
        JTextField myTextField = new JTextField();
        myTextField.setFont(myFont);
        
        DefaultCellEditor cellEditor;
        cellEditor = new DefaultCellEditor(myTextField);
        tableBeverage.getColumnModel().getColumn(2).setCellEditor(cellEditor);
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
        panelLeft = new javax.swing.JPanel();
        panelTopLeft = new javax.swing.JPanel();
        labelBeverageName = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        textBeverageName = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        labelUnitOfCurrency = new javax.swing.JLabel();
        labelTopLeft = new javax.swing.JLabel();
        panelLeftSeparator = new javax.swing.JSeparator();
        panelBottomLeft = new javax.swing.JPanel();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonConfirm = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        panelRight = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableBeverage = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAT - Quản lý thức uống");

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("QUẢN LÝ THỨC UỐNG");

        panelLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelBeverageName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelBeverageName.setText("Tên thức uống:");

        labelPrice.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelPrice.setText("Giá:");

        textBeverageName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        textPrice.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        labelUnitOfCurrency.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelUnitOfCurrency.setText("VNĐ");

        labelTopLeft.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        labelTopLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTopLeft.setText("Thức uống");

        javax.swing.GroupLayout panelTopLeftLayout = new javax.swing.GroupLayout(panelTopLeft);
        panelTopLeft.setLayout(panelTopLeftLayout);
        panelTopLeftLayout.setHorizontalGroup(
            panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelBeverageName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBeverageName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(textPrice))
                .addGap(18, 18, 18)
                .addComponent(labelUnitOfCurrency)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTopLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTopLeftLayout.setVerticalGroup(
            panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTopLeft)
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBeverageName)
                    .addComponent(labelBeverageName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPrice)
                    .addComponent(labelUnitOfCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        buttonInsert.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonInsert.setText("Thêm");

        buttonUpdate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonUpdate.setText("Sửa");

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonDelete.setText("Xóa");

        buttonConfirm.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonConfirm.setText("Xác nhận");

        buttonCancel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCancel.setText("Hủy");

        buttonReturn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonReturn.setText("Trở về");
        buttonReturn.setToolTipText("");

        javax.swing.GroupLayout panelBottomLeftLayout = new javax.swing.GroupLayout(panelBottomLeft);
        panelBottomLeft.setLayout(panelBottomLeftLayout);
        panelBottomLeftLayout.setHorizontalGroup(
            panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottomLeftLayout.createSequentialGroup()
                        .addComponent(buttonInsert)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete))
                    .addGroup(panelBottomLeftLayout.createSequentialGroup()
                        .addComponent(buttonConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancel, buttonConfirm, buttonDelete, buttonInsert, buttonReturn, buttonUpdate});

        panelBottomLeftLayout.setVerticalGroup(
            panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirm)
                    .addComponent(buttonCancel)
                    .addComponent(buttonReturn))
                .addGap(18, 18, 18))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancel, buttonConfirm, buttonDelete, buttonInsert, buttonReturn, buttonUpdate});

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBottomLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTopLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLeftSeparator, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTopLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLeftSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tableBeverage.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tableBeverage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên thức uống", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBeverage.getTableHeader().setReorderingAllowed(false);
        scrollPaneTable.setViewportView(tableBeverage);

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ManageBeverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBeverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBeverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBeverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBeverage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel labelBeverageName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTopLeft;
    private javax.swing.JLabel labelUnitOfCurrency;
    private javax.swing.JPanel panelBottomLeft;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JSeparator panelLeftSeparator;
    private javax.swing.JPanel panelRight;
    private javax.swing.JPanel panelTopLeft;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableBeverage;
    private javax.swing.JTextField textBeverageName;
    private javax.swing.JTextField textPrice;
    // End of variables declaration//GEN-END:variables
}
