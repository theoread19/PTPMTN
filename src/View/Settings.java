/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author B1704721
 */
public class Settings {
    
    public static Font myFont = new Font("Times New Roman", Font.PLAIN, 22);
    public static Color backgroundColor = new Color(255, 204, 213);
    public static Color contponentBackgroundColor = new Color(255, 230, 234);
    public static ImageIcon icon = new ImageIcon("src\\others\\icon.png");
    public static ImageIcon logo = new ImageIcon("src\\others\\logo.png");
    public static ImageIcon manageUserIcon = new ImageIcon("src\\others\\icon-manage-user.png");
    public static ImageIcon manageBillIcon = new ImageIcon("src\\others\\icon-manage-bill.png");
    public static ImageIcon manageBeverageIcon = new ImageIcon("src\\others\\icon-manage-beverage.png");
    public static ImageIcon signOutIcon = new ImageIcon("src\\others\\icon-sign-out.png");
    
    public static void setFrameInterface(JFrame frame) {
        // Set frame's icon
        frame.setIconImage(icon.getImage());

        // Set background color
        frame.getContentPane().setBackground(backgroundColor);
    }
    
    public static void setTableInterface(JTable table, JScrollPane scrollPane) {
        // Set table's font
        table.getTableHeader().setFont(myFont);

        // Set table's background color
        table.setOpaque(false);
        table.setFillsViewportHeight(true);
        scrollPane.getViewport().setBackground(contponentBackgroundColor);
        
        // Set table's font
        table.getTableHeader().setFont(myFont);

        // Set table's text alignment
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        table.getTableHeader().setDefaultRenderer(centerRenderer);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.setDefaultRenderer(Integer.class, centerRenderer);

        // Set table's row height
        table.setRowHeight(30);

        // Set table's input renderer
        JTextField myTextField = new JTextField();
        myTextField.setFont(myFont);

        DefaultCellEditor cellEditor;
        cellEditor = new DefaultCellEditor(myTextField);
        
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellEditor(cellEditor);
        }
    }
}
