/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;

/**
 *
 * @author asus
 */
public class AdminController {
    
    public UserModel get(UserModel model){
        UserModel userModel = new UserModel();
        userModel.setUsername(model.getUsername());
        return model;
    }
}
