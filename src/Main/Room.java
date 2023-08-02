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
public class Room
{
    private int Id;
    private double Charges;
    private String Facilities;
    private int employeeAssigned;
    private int[] studentsAssigned = new int[5];
    private boolean Status;

    public Room(int Id, double Charges, String Facilities, int employeeAssigned, boolean Status)
    {
        this.Id = Id;
        this.Charges = Charges;
        this.Facilities = Facilities;
        this.employeeAssigned = employeeAssigned;
        this.Status = Status;
    }
    
    public Room()
    {
        this(0,0.0,null,0,true);
    }

    public int getId()
    {
        return Id;
    }

    public double getCharges()
    {
        return Charges;
    }

    public String getFacilities()
    {
        return Facilities;
    }

    public int getEmployeeAssigned()
    {
        return employeeAssigned;
    }

    public int[] getStudentsAssigned()
    {
        return studentsAssigned;
    }

    public boolean isStatus()
    {
        return Status;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setCharges(double Charges)
    {
        this.Charges = Charges;
    }

    public void setFacilities(String Facilities)
    {
        this.Facilities = Facilities;
    }

    public void setEmployeeAssigned(int employeeAssigned)
    {
        this.employeeAssigned = employeeAssigned;
    }

    public void setStudentsAssigned(int[] studentsAssigned)
    {
        this.studentsAssigned = studentsAssigned;
    }

    public void setStatus(boolean Status)
    {
        this.Status = Status;
    }
}
