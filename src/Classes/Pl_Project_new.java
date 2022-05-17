/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Jframes.Login;
import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 20112
 */
public class Pl_Project_new {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        dbconnection c = new dbconnection();
        c.getdataBase_Connection();
        Login l = new Login();
        l.setVisible(true);
        l.setResizable(false);

    }

}
