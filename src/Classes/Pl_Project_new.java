package Classes;

import Jframes.Login;

public class Pl_Project_new {

    public static void main(String[] args) {
        dbconnection connection = new dbconnection();
        connection.getDatabase_connection();
        Login loginForm = new Login();
        loginForm.setVisible(true);
        loginForm.setResizable(false);
    }
}
