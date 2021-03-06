/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import Model.BillModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class BillController {

    private DBConnection connection;
    private Connection con;

    public BillController() {
        connection = new DBConnection();
    }

    public float applyDiscount(float subTotal) {
        if (subTotal >= 100000) {
            subTotal = subTotal * 0.9f;
        }
        return subTotal;
    }

    public String calculateDiscount(float subTotal) {
        String discount = "0";
        if (subTotal >= 100000) {
            discount = "0.1";
        }
        return discount;
    }

    public void closeCreateBill() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void post(BillModel model) {
        String sql = "insert into bill(creatorId,createTime,totalAmount,subTotal,discount,total,cash,`change`) "
                + "values (" + model.getCreatorId() + ",'" + model.getCreateTime() + "'," + model.getTotalAmount() + "," + model.getSubtotal() + "," + model.getDiscount() + "," + model.getTotal() + "," + model.getCash() + "," + model.getChange() + " )";

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<BillModel> get() {
        List<BillModel> billModel = new ArrayList<>();
        String sql = "select * from bill order by createTime desc";

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            BillDetailController billDetailController = new BillDetailController();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                BillModel bModel = new BillModel();
                bModel.setId(rs.getInt("id"));
                bModel.setCreatorId(rs.getInt("creatorId"));
                bModel.setCreateTime(rs.getTimestamp("createTime"));
                bModel.setSubtotal(rs.getFloat("subtotal"));
                bModel.setDiscount(rs.getFloat("discount"));
                bModel.setTotal(rs.getFloat("total"));
                bModel.setCash(rs.getFloat("cash"));
                bModel.setChange(rs.getFloat("change"));
                bModel.setBeverages(billDetailController.get(bModel.getId()));
                billModel.add(bModel);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return billModel;
    }

    public BillModel get(int id) {
        BillModel bModel = new BillModel();
        String sql = "select * from bill where id = " + id;

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            BillDetailController billDetailController = new BillDetailController();
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            bModel.setId(id);
            bModel.setCreatorId(rs.getInt("creatorId"));
            bModel.setCreateTime(rs.getTimestamp("createTime"));
            bModel.setSubtotal(rs.getFloat("subtotal"));
            bModel.setDiscount(rs.getFloat("discount"));
            bModel.setTotal(rs.getFloat("total"));
            bModel.setCash(rs.getFloat("cash"));
            bModel.setChange(rs.getFloat("change"));
            bModel.setBeverages(billDetailController.get(bModel.getId()));
            bModel.setTotalAmount(rs.getInt("totalAmount"));
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bModel;
    }

    public int getLastBillModelID() {
        int id = -1;
        String sql = "SELECT max(id) as id FROM bill";
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            id = rs.getInt("id");
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

}
