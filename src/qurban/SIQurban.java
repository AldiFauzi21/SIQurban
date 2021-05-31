/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qurban;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aldi
 */

public class SIQurban {
    private String password = "visual";
    public String getPassword(){
        return password;
    }
    public static void main(String[] args) {
        PasswordJFrame mulai = new PasswordJFrame();
        mulai.setVisible(true);
    }    
}
