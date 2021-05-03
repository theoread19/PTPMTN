/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import Model.BillModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class BillController {
    private DBConnection connection;
    private Connection con ;
    
    public BillController(){
        try {
            connection = new DBConnection();
            con = connection.connectDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public float applyDiscount(float subTotal){
        if(subTotal >= 100000){
            subTotal = subTotal*0.9f;
        }
        return subTotal;
    }
    
    public String calculateDiscount(float subTotal){
        String discount = "0";
        if(subTotal >= 100000){
            discount = "0.1";
        }
        return discount;
    }
    
    public void closeCreateBill(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void post(BillModel model){

        String sql = "insert into bill (creatorId,discount,createTime,total,totalAmount,receivedMoney,changeMoney) "
                + "values ('" + model.getCreatorId() + "','" + model.getDiscount() + "','" + model.getCreateTime()+ "','" + model.getTotal()+ "','" + model.getTotalAmount()+ "','" + model.getReceivedMoney()+ "','" + model.getChangeMoney()+ "' )";
         
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);    
            con.close();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                con.close();
            } catch (SQLException ex1) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
}
