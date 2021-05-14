/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import Model.UserModel;
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
public class UserController {

    private final DBConnection connection;
    private Connection con;

    public UserController() {
        connection = new DBConnection();
    }

    public List<UserModel> get() {
        List<UserModel> userModels = new ArrayList<>();
        String sql = "Select * from user";
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                UserModel model = new UserModel();
                model.setId(rs.getInt("id"));
                model.setUsername(rs.getString("username"));
                model.setPassword(rs.getString("password"));
                model.setRole(rs.getString("role"));
                userModels.add(model);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userModels;
    }

    public UserModel get(int id) {
        UserModel model = new UserModel();
        try {
            String sql = "select * from user where id =" + id;
            con = connection.connectDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            model.setId(id);
            model.setUsername(rs.getString("username"));
            model.setPassword(rs.getString("password"));
            model.setRole(rs.getString("role"));

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return model;
    }

    public void post(UserModel model) {
        String sql = "insert into user(username, password, role) values('" + model.getUsername() + "','" + model.getPassword() + "','" + model.getRole() + "')";
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "delete from user where id = " + id;
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void put(UserModel model) {
        String sql = "update user set username = '" + model.getUsername() + "', password = '" + model.getPassword() + "', role = '" + model.getRole() + "' where id = " + model.getId();
        try {
            con = connection.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
