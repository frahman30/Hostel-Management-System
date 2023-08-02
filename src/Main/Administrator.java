/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author FazalUr
 */
public class Administrator extends Person
{
    private String Username;
    private String Password;

    public Administrator(String Username, String Password, String Name, int Id, String Address, String phoneNo)
    {
        super(Name, Id, Address, phoneNo);
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setUsername(String Username)
    {
        this.Username = Username;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }
}
