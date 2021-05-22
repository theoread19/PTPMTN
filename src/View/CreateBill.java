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
import Model.UserModel;
import Utils.BillUtils;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B1704721
 */
public class CreateBill extends javax.swing.JFrame {

    private UserModel userModel;
    private BeverageController beverageController;
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
        resetTextFields();
        resetComponents();
        initTable();
    }

    private void initTable() {
        beverageController = new BeverageController();
        List<BeverageModel> beverageModel = beverageController.get();

        DefaultTableModel defaulttablemodel = (DefaultTableModel) tableBeverage.getModel();
        for (BeverageModel item : beverageModel) {
            Object[] data = new Object[3];
            data[0] = item.getId();
            data[1] = item.getName();
            data[2] = item.getPrice();
            defaulttablemodel.addRow(data);
        }
    }

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

    private void resetTextFields() {
        textTotalAmount.setText("0");
        textSubtotal.setText("0.0");
        textDiscount.setText("0%");
        textTotal.setText("0.0");
        textCash.setEnabled(false);
        textCash.setText("");
        textChange.setText("");
    }

    private void resetComponents() {
        buttonCreate.setEnabled(true);
        buttonCalculate.setEnabled(false);
        buttonCancel.setEnabled(false);
        tableBeverage.setEnabled(true);
    }

    private void resetTable() {
        for (int i = 0; i < tableBeverage.getRowCount(); i++) {
            tableBeverage.setValueAt(null, i, 3);
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
        labelSubtotal = new javax.swing.JLabel();
        textSubtotal = new javax.swing.JTextField();
        labelDiscount = new javax.swing.JLabel();
        textDiscount = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        labelCash = new javax.swing.JLabel();
        textCash = new javax.swing.JTextField();
        labelChange = new javax.swing.JLabel();
        textChange = new javax.swing.JTextField();
        panelLeftSeparator = new javax.swing.JSeparator();
        panelBottomLeft = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonCalculate = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        panelRight = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableBeverage = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAT - Tạo hóa đơn");

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
        textTotalAmount.setText("0");
        textTotalAmount.setEnabled(false);

        labelSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelSubtotal.setText("Tổng tiền:");

        textSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textSubtotal.setText("0.0");
        textSubtotal.setEnabled(false);

        labelDiscount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelDiscount.setText("Khuyến mãi:");

        textDiscount.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textDiscount.setText("0%");
        textDiscount.setEnabled(false);

        labelTotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelTotal.setText("Thành tiền:");

        textTotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textTotal.setText("0.0");
        textTotal.setEnabled(false);

        labelCash.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelCash.setText("Tiền nhận:");

        textCash.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        labelChange.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        labelChange.setText("Tiền thối lại:");

        textChange.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        textChange.setEnabled(false);

        javax.swing.GroupLayout panelTopLeftLayout = new javax.swing.GroupLayout(panelTopLeft);
        panelTopLeft.setLayout(panelTopLeftLayout);
        panelTopLeftLayout.setHorizontalGroup(
            panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textSubtotal))
                    .addComponent(labelBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelTopLeftLayout.createSequentialGroup()
                                .addComponent(labelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textChange, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(panelTopLeftLayout.createSequentialGroup()
                                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCash, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textCash)
                                    .addComponent(textTotalAmount)
                                    .addComponent(textDiscount)
                                    .addComponent(textTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        panelTopLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCash, labelDiscount, labelTotal, labelTotalAmount});

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
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSubtotal))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLeftLayout.createSequentialGroup()
                        .addComponent(labelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTopLeftLayout.createSequentialGroup()
                        .addComponent(textDiscount)
                        .addGap(18, 18, 18)
                        .addComponent(textTotal)))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCash)
                    .addComponent(labelCash, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textChange)
                    .addComponent(labelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        panelTopLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelCash, labelDiscount, labelTotal, labelTotalAmount});

        buttonCreate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCreate.setText("Tạo");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonCalculate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCalculate.setText("Tính tiền");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        buttonCancel.setText("Hủy");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

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
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBottomLeftLayout.createSequentialGroup()
                        .addComponent(buttonCancel)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReturn))
                    .addGroup(panelBottomLeftLayout.createSequentialGroup()
                        .addComponent(buttonCreate)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCalculate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCalculate, buttonCancel, buttonCreate, buttonReturn});

        panelBottomLeftLayout.setVerticalGroup(
            panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreate)
                    .addComponent(buttonCalculate))
                .addGap(18, 18, 18)
                .addGroup(panelBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReturn)
                    .addComponent(buttonCancel))
                .addGap(18, 18, 18))
        );

        panelBottomLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCalculate, buttonCancel, buttonCreate, buttonReturn});

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
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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

    public void setUser(UserModel model) {
        userModel = new UserModel();
        userModel.setId(model.getId());
        userModel.setUsername(model.getUsername());
        userModel.setRole(model.getRole());
    }

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        int totalAmount = 0;
        float subtotal = 0;
        float total = 0;

        for (int i = 0; i < tableBeverage.getRowCount(); i++) {
            // Check valid rows
            if (tableBeverage.getValueAt(i, 3) != null && tableBeverage.getValueAt(i, 3).toString().length() > 0) {
                int amount = 0;
                try {
                    // Convert to int
                    amount = Integer.valueOf((String) tableBeverage.getValueAt(i, 3));

                    if (amount <= 0) {
                        OptionPane.showMessageDialog("Lỗi", "Số lượng phải lớn hơn 0.");

                        // Empty all text field
                        resetTextFields();

                        // Empty row
                        tableBeverage.setValueAt(null, i, 3);
                        return;
                    } else {
                        totalAmount += amount;
                    }
                } catch (Exception ex) {
                    OptionPane.showMessageDialog("Lỗi", "Số lượng phải là số nguyên.");

                    // Empty all text field
                    resetTextFields();

                    // Empty row
                    tableBeverage.setValueAt(null, i, 3);
                    return;
                }
            }
        }

        if (totalAmount > 0) {
            try {
                // Calculate subtotal and total amount
                for (int i = 0; i < tableBeverage.getRowCount(); i++) {
                    if (tableBeverage.getValueAt(i, 3) != null && tableBeverage.getValueAt(i, 3).toString().length() > 0) {
                        // Total of a beverage
                        float rowTotal = 0;
                        rowTotal = (int) tableBeverage.getValueAt(i, 2) * Integer.valueOf(tableBeverage.getValueAt(i, 3).toString());
                        subtotal += rowTotal;
                    }
                }

                // Display
                textTotalAmount.setText(String.valueOf(totalAmount));

                textSubtotal.setText(String.valueOf(subtotal));

                billController = new BillController();

                String discount = billController.calculateDiscount(subtotal);
                int discountValue = (int) (Float.parseFloat(discount) * 100);
                discount = String.valueOf(discountValue) + "%";
                textDiscount.setText(discount);

                total = billController.applyDiscount(subtotal);
                textTotal.setText(String.valueOf(total));
            } catch (Exception ex) {
                OptionPane.showMessageDialog("Lỗi", "Lỗi khi lấy dữ liệu từ bảng thức uống.");
                ex.printStackTrace();
            }
        } else {
            // Empty table
            resetTextFields();
            resetComponents();
            OptionPane.showMessageDialog("Lỗi", "Hóa đơn trống!");
            return;
        }

        // Set components
        textCash.setEnabled(true);
        buttonCreate.setEnabled(false);
        buttonCalculate.setEnabled(true);
        buttonCancel.setEnabled(true);
        tableBeverage.setEnabled(false);
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // Reset everything
        resetTextFields();
        resetComponents();
        resetTable();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        billModel = new BillModel();
        List<BillDetailModel> billDetailModels = new ArrayList<>();
        java.util.Date date = new java.util.Date();
        Timestamp ts = new Timestamp(date.getTime());

        // Check cash
        float total;
        int cash;

        try {
            total = Float.valueOf(textTotal.getText());
            cash = Integer.valueOf(textCash.getText());
        } catch (NumberFormatException ex) {
            OptionPane.showMessageDialog("Lỗi", "Tiền nhận phải là số nguyên!");
            return;
        }

        if (cash < total) {
            OptionPane.showMessageDialog("Lỗi", "Tiền nhận không thể ít hơn thành tiền!");
            return;
        }

        // Set data to billModel
        float change = Float.valueOf(textCash.getText()) - Float.valueOf(textTotal.getText());
        textChange.setText(Float.toString(change));

        billModel.setCreatorId(userModel.getId());
        billModel.setTotalAmount(Integer.valueOf(textTotalAmount.getText()));
        billModel.setSubtotal(Float.valueOf(textTotal.getText()));
        // Error here, this is just a temporary fix
        String discount = textDiscount.getText();
        if (discount.equals("10%")) {
            billModel.setDiscount(0.1f);
        } else {
            billModel.setDiscount(0f);
        }
        billModel.setTotal(Float.valueOf(textTotal.getText()));
        billModel.setCash(Float.valueOf(textCash.getText()));
        billModel.setChange(change);
        billModel.setCreateTime(ts);

        // Post bill model to database
        billController = new BillController();
        billController.post(billModel);

        // Get data
        billDetailController = new BillDetailController();
        int lastID = billController.getLastBillModelID();

        // Browse table
        for (int i = 0; i < tableBeverage.getRowCount(); i++) {
            if (tableBeverage.getValueAt(i, 3) != null) {
                // Set bill detail values
                billDetailModel = new BillDetailModel();
                billDetailModel.setBillId(lastID);
                billDetailModel.setBeverageId(Integer.valueOf(tableBeverage.getValueAt(i, 0).toString()));
                billDetailModel.setAmount(Integer.valueOf(tableBeverage.getValueAt(i, 3).toString()));
                billDetailModels.add(billDetailModel);

                // Insert bill details data into database
                billDetailController.post(billDetailModel);
            }
        }
        billModel.setBeverages(billDetailModels);
        
        // Show bill detail
        BillModel updatedModel = billController.get(billController.getLastBillModelID());
        BillDetail form = new BillDetail(updatedModel);
        form.setVisible(true);

        // Show message dialog
        OptionPane.showMessageDialog("Thông báo", "Đã thanh toán hóa đơn!");

        // Reset everything
        resetTextFields();
        resetComponents();
        resetTable();
    }//GEN-LAST:event_buttonCalculateActionPerformed

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
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JLabel labelBill;
    private javax.swing.JLabel labelCash;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelSubtotal;
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
    private javax.swing.JTextField textCash;
    private javax.swing.JTextField textChange;
    private javax.swing.JTextField textDiscount;
    private javax.swing.JTextField textSubtotal;
    private javax.swing.JTextField textTotal;
    private javax.swing.JTextField textTotalAmount;
    // End of variables declaration//GEN-END:variables
}
