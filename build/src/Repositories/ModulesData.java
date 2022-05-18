/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Classes.dbconnection;


public class ModulesData {
    
    protected String name;
    protected int id;
    protected String Password;
    protected int role_id;
    dbconnection c = new dbconnection ();
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return Password;
    }

    public int getRole_id() {
        return role_id;
    }
    
}
