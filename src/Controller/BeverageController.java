/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import Model.BeverageModel;
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
public class BeverageController {

    private DBConnection connection;

    private Connection con ;
    
//    public BeverageController(){
//
//        connection = new DBConnection();
//            
//
//    private Connection con;

    public BeverageController() {
        connection = new DBConnection();
    }

    public List<BeverageModel> get() {
        List<BeverageModel> beverageModel = new ArrayList<>();
        String sql = "select * from beverage";

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                BeverageModel bModel = new BeverageModel();
                bModel.setId(rs.getInt("id"));
                bModel.setName(rs.getString("name"));
                bModel.setPrice(rs.getInt("price"));
                beverageModel.add(bModel);
            }
            
            con.close();
        } catch (SQLException ex) {
//<<<<<<< HEAD
//            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
//=======
            try {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                con.close();
                return null;
            } catch (SQLException ex1) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BeverageController.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return beverageModel;
    }

    public void delete(int id) {
        String sql = "delete from beverage where id = " + id;

        try {

            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);    
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
//=======
//
//            con = connection.connectDB();
//
//            Statement stm = con.createStatement();
//            stm.executeUpdate(sql);
//
//            con.close();
//        } catch (SQLException ex) {
//            try {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//                con.close();
//            } catch (SQLException ex1) {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BeverageController.class.getName()).log(Level.SEVERE, null, ex);
//>>>>>>> view
        }

    }

    public void put(int id, String name, int price) {
        String sql = "update beverage set name = '" + name + "', price = " + price + " where id = " + id;

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();

            stm.executeUpdate(sql);    
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
//=======
//            stm.executeUpdate(sql);
//
//            con.close();
//        } catch (SQLException ex) {
//            try {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//                con.close();
//            } catch (SQLException ex1) {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BeverageController.class.getName()).log(Level.SEVERE, null, ex);
//>>>>>>> view
        }

    }

    public void post(String name, int price) {
        String sql = "insert into beverage (name,price) values ('" + name + "', '" + price + "')";

        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {

            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
//=======
//            try {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//                con.close();
//            } catch (SQLException ex1) {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BeverageController.class.getName()).log(Level.SEVERE, null, ex);
//>>>>>>> view
        }
    }

    public void CloseManageBeverage() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
