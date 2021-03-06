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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class LoginController {

    private DBConnection connection;
    private Connection con;

    public LoginController() {
        try {
            connection = new DBConnection();
            con = connection.connectDB();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UserModel handleLogin(String username, String password) {
        String sql = "select * from user";

        UserModel model = new UserModel();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    model.setId(rs.getInt("id"));
                    model.setUsername(rs.getString("username"));
                    model.setFullName(rs.getString("fullname"));
                    model.setRole(rs.getString("role"));
                }
            }
        } catch (SQLException ex) {
            try {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                con.close();
                return null;
            } catch (SQLException ex1) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return model;
    }

    public void closeLogin() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
