/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BeverageController;
import Controller.BillController;
import Controller.BillDetailController;
import Model.BeverageModel;
import Model.BillDetailModel;
import Model.BillModel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B1704721
 */
public class CreateBill extends javax.swing.JFrame {
    private BeverageController beverageController;
    private BeverageModel beverageModel;
    private BillModel billModel;
    private BillController billController;
    private BillDetailController billDetailController;
    private BillDetailModel billDetailModel;
    /**
     * Creates new form
     */
    public CreateBill() {
        initComponents();
        setInterface();
        initTable();
    }
    
    public void initTable(){
        beverageController = new BeverageController();
        List<BeverageModel> bModel = beverageController.get();
        DefaultTableModel defaulttablemodel = (DefaultTableModel)tableBeverage.getModel();
        for(BeverageModel item : bModel){
            Object[] data = new Object[3];
            data[0] = item.getId();
            data[1] = item.getName();
            data[2] = item.getPrice();
            defaulttablemodel.addRow(data);
        }
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
        labelBill = new javax.swing.JLabel();
        labelTotalAmount = new javax.swing.JLabel();
        textTotalAmount = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        labelDiscount = new javax.swing.JLabel();
        textDiscount = new javax.swing.JTextField();
        labelMoneyToPay = new javax.swing.JLabel();
        textMoneyToPay = new javax.swing.JTextField();
        labelReceivedMoney = new javax.swing.JLabel();
        textReceivedMoney = new javax.swing.JTextField();
        labelChangeMoney = new javax.swing.JLabel();
        textChangeMoney = new javax.swing.JTextField();
        panelLeftSeparator = new javax.swing.JSeparator();
        panelBottomLeft = new javax.swing.JPanel();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonConfirm = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        panelRight = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableBeverage = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAT - Quản lý người dùng");

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("TẠO HÓA ĐƠN");

        panelLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelBill.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        labelBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBill.setText("Hóa đơn");

        labelTotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelTotalAmount.setText("Tổng số lượng:");

        textTotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textTotalAmount.setEnabled(false);

        labelTotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelTotal.setText("Tổng tiền:");

        textTotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textTotal.setEnabled(false);

        labelDiscount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelDiscount.setText("Khuyến mãi:");

        textDiscount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textDiscount.setText("0");
        textDiscount.setEnabled(false);

        labelMoneyToPay.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelMoneyToPay.setText("Tiền phải trả:");

        textMoneyToPay.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textMoneyToPay.setEnabled(false);

        labelReceivedMoney.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelReceivedMoney.setText("Tiền nhận:");

        textReceivedMoney.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        labelChangeMoney.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelChangeMoney.setText("Tiền thối lại:");

        textChangeMoney.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textChangeMoney.setEnabled(false);

        javax.swing.GroupLayout panelTopLeftLayout = new javax.swing.GroupLayout(panelTopLeft);
        panelTopLeft.setLayout(panelTopLeftLayout);
        panelTopLeftLayout.setHorizontalGroup(
            panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textTotal))
                    .addComponent(labelBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelTopLeftLayout.createSequentialGroup()
                                .addComponent(labelChangeMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textChangeMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(panelTopLeftLayout.createSequentialGroup()
                                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMoneyToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelReceivedMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textReceivedMoney)
                                    .addComponent(textTotalAmount)
                                    .addComponent(textDiscount)
                                    .addComponent(textMoneyToPay, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        panelTopLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelDiscount, labelMoneyToPay, labelReceivedMoney, labelTotalAmount});

        panelTopLeftLayout.setVerticalGroup(
            panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelBill)
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalAmount))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotal))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLeftLayout.createSequentialGroup()
                        .addComponent(labelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelMoneyToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addComponent(textDiscount)
                        .addGap(18, 18, 18)
                        .addComponent(textMoneyToPay)))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textReceivedMoney)
                    .addComponent(labelReceivedMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textChangeMoney)
                    .addComponent(labelChangeMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        panelTopLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelDiscount, labelMoneyToPay, labelReceivedMoney, labelTotalAmount});

        buttonInsert.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonInsert.setText("Tạo");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonUpdate.setText("Tính tiền");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCancel.setText("Hủy");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonConfirm.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonConfirm.setText("In");
        buttonConfirm.setEnabled(false);

        buttonReturn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonReturn.setText("Trở về");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

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
                        .addComponent(buttonCancel))
                    .addGroup(panelBottomLeftLayout.createSequentialGroup()
                        .addComponent(buttonConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancel, buttonConfirm, buttonInsert, buttonReturn, buttonUpdate});

        panelBottomLeftLayout.setVerticalGroup(
            panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonCancel))
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirm)
                    .addComponent(buttonReturn))
                .addGap(18, 18, 18))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancel, buttonConfirm, buttonInsert, buttonReturn, buttonUpdate});

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLeftSeparator)
                    .addComponent(panelBottomLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTopLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTopLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLeftSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panelBottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tableBeverage.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tableBeverage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên thức uống", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(tableBeverage);

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    
    
    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        float subTotal = 0;
        int totalAllAmount = 0;
        float total = 0;
        
        boolean checkInput = true;
        //Check amount input
        for(int i = 0; i < tableBeverage.getRowCount(); i++){
            try{
                //Check non null rows
                if(tableBeverage.getValueAt(i, 3) != null){
                    //Convert to int
                    int amount = Integer.valueOf((String) tableBeverage.getValueAt(i, 3));
                    if(amount <= 0){
                        checkInput = false;
                        JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        //Empty all text field
                        textTotal.setText("");
                        textTotalAmount.setText("");
                        textDiscount.setText("0");
                        textMoneyToPay.setText("");
                        textReceivedMoney.setText("");
                        //Empty row
                        tableBeverage.setValueAt(null, i, 3);
                    }
                }
            }catch(Exception e){
                checkInput = false;
                JOptionPane.showMessageDialog(this, "Số lượng phải là số nguyên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                //Empty all text field
                textTotal.setText("");
                textTotalAmount.setText("");
                textDiscount.setText("0");
                textMoneyToPay.setText("");
                textReceivedMoney.setText("");
                //Empty row
                tableBeverage.setValueAt(null, i, 3);
                }
        }
        
        if(checkInput == true){
            try{
                //Calculate total money and total amount
                for(int i = 0; i < tableBeverage.getRowCount(); i++){
                    if(tableBeverage.getValueAt(i, 3) != null){
                        float rowTotal = 0;//Total of a beverage
                       
                        rowTotal = (int)tableBeverage.getValueAt(i, 2)  * Integer.valueOf(tableBeverage.getValueAt(i, 3).toString());
                    
                        subTotal = subTotal + rowTotal;
                        totalAllAmount = totalAllAmount + Integer.valueOf((String) tableBeverage.getValueAt(i, 3));
                    }
                
                }
            
                textTotal.setText(Float.toString(subTotal));//Show subtotal
                textTotalAmount.setText(String.valueOf(totalAllAmount));//show total amount
            
                billController = new BillController();
            
                total = billController.applyDiscount(subTotal);
                textMoneyToPay.setText(Float.toString(total));//Show total
            
                String discount = billController.calculateDiscount(subTotal);
                textDiscount.setText(discount);//Show discount
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ bảng thức uống", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed

        this.dispose();
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        //Empty all text field
        textTotal.setText("");
        textTotalAmount.setText("");
        textDiscount.setText("0");
        textMoneyToPay.setText("");
        textReceivedMoney.setText("");
        
        //Empty table
        for(int i = 0; i < tableBeverage.getRowCount(); i++){
            tableBeverage.setValueAt(null, i, 3);
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        
        billModel = new BillModel();
        
        float changeMoney = Float.valueOf(textReceivedMoney.getText()) - Float.valueOf(textMoneyToPay.getText());
        textChangeMoney.setText(Float.toString(changeMoney));
        java.util.Date date= new java.util.Date();
        Timestamp ts = new Timestamp(date.getTime());
        //Set data to billmodel
        billModel.setCreatorId(1);
        billModel.setTotalAmount(Integer.valueOf(textTotalAmount.getText()));
        billModel.setSubtotal(Float.valueOf(textTotal.getText()));
        billModel.setDiscount(Float.valueOf(textDiscount.getText()));
        billModel.setTotal(Float.valueOf(textMoneyToPay.getText()));
        billModel.setReceivedMoney(Float.valueOf(textReceivedMoney.getText()));
        billModel.setChangeMoney(changeMoney);
        billModel.setCreateTime(ts);
        
        //post bill model to database
        billController = new BillController();
        billController.post(billModel);
        
        //get data
        billDetailController = new BillDetailController();
        int LastID = billController.getLastBillModelID();
        //browse table
        for(int i = 0; i < tableBeverage.getRowCount(); i++){
            if(tableBeverage.getValueAt(i, 3) != null){
                billDetailModel = new BillDetailModel();
                //set bill detail values
                billDetailModel.setBillId(LastID);
                billDetailModel.setBeverageId(Integer.valueOf(tableBeverage.getValueAt(i, 0).toString()));
                billDetailModel.setAmount(Integer.valueOf(tableBeverage.getValueAt(i, 3).toString()));
                //insert bill details data into databse
                billDetailController.post(billDetailModel);
            }
        }
        
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void setInterface() {
        // Set frame interface
        Settings.setFrameInterface(this);

        // Set table interface
        Settings.setTableInterface(tableBeverage, scrollPaneTable);

        // Set components
        panelLeft.setBackground(Settings.contponentBackgroundColor);
        panelTopLeft.setBackground(Settings.contponentBackgroundColor);
        panelBottomLeft.setBackground(Settings.contponentBackgroundColor);
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
            java.util.logging.Logger.getLogger(CreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel labelBill;
    private javax.swing.JLabel labelChangeMoney;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelMoneyToPay;
    private javax.swing.JLabel labelReceivedMoney;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalAmount;
    private javax.swing.JPanel panelBottomLeft;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JSeparator panelLeftSeparator;
    private javax.swing.JPanel panelRight;
    private javax.swing.JPanel panelTopLeft;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableBeverage;
    private javax.swing.JTextField textChangeMoney;
    private javax.swing.JTextField textDiscount;
    private javax.swing.JTextField textMoneyToPay;
    private javax.swing.JTextField textReceivedMoney;
    private javax.swing.JTextField textTotal;
    private javax.swing.JTextField textTotalAmount;
    // End of variables declaration//GEN-END:variables
}
