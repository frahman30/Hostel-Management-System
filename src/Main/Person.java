/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Panel;
import javax.swing.JOptionPane;

/**
 *
 * @author FazalUr
 */
public abstract class Person
{
    private String Name;
    private int Id;
    private String Address;
    private String phoneNo;

    public Person(String Name, int Id, String Address, String phoneNo)
    {
        this.Name = Name;
        this.Id = Id;
        this.Address = Address;
        this.phoneNo = phoneNo;
    }
    
    public Person()
    {
        this(null,0,null,null);
    }

    public String getName()
    {
        return Name;
    }

    public int getId()
    {
        return Id;
    }

    public String getAddress()
    {
        return Address;
    }

    public String getPhoneNo() 
    {
        return phoneNo;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
}
