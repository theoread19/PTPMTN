/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import Model.BillDetailModel;
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
 * @author asus
 */
public class BillDetailController {

    private final DBConnection connection;
    private Connection con;

    public BillDetailController() {
        connection = new DBConnection();
    }

    public List<BillDetailModel> get(int billID) {
        List<BillDetailModel> billDetailModel = new ArrayList<>();
        String sql = "select * from billdetail where billId =" + billID;
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                BillDetailModel model = new BillDetailModel();
                model.setBillId(billID);
                model.setBeverageId(rs.getInt("beverageId"));
                model.setAmount(rs.getInt("amount"));
                billDetailModel.add(model);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billDetailModel;
    }

    public void post(BillDetailModel model) {
        String sql = "insert into billdetail (billId, beverageId, amount) "
                + "values ('" + model.getBillId() + "','" + model.getBeverageId() + "','" + model.getAmount() + "' )";

        try {
            con = connection.connectDB();
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
