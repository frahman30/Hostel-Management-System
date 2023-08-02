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
public class Student extends Person
{
    private int roomNoAssigned;
    private boolean billPayed;
    private double totalBillPerMonth;
    private double totalAdvancePayed;
    private double totalAmountPending;
    private int noOfMonths;

    public Student(int roomNoAssigned, boolean billPayed, double totalBillPerMonth, double totalAdvancePayed, double totalAmountPending, int noOfMonths, String Name, int Id, String Address, String phoneNo)
    {
        super(Name, Id, Address, phoneNo);
        this.roomNoAssigned = roomNoAssigned;
        this.billPayed = billPayed;
        this.totalBillPerMonth = totalBillPerMonth;
        this.totalAdvancePayed = totalAdvancePayed;
        this.totalAmountPending = totalAmountPending;
        this.noOfMonths = noOfMonths;
    }
    
    public Student()
    {
        this(0,false,0.0,0.0,0.0,0,null,0,null,null);
    }

    public int getRoomNoAssigned()
    {
        return roomNoAssigned;
    }

    public boolean isBillPayed()
    {
        return billPayed;
    }

    public double getTotalBillPerMonth()
    {
        return totalBillPerMonth;
    }

    public double getTotalAdvancePayed()
    {
        return totalAdvancePayed;
    }

    public double getTotalAmountPending()
    {
        return totalAmountPending;
    }

    public int getNoOfMonths()
    {
        return noOfMonths;
    }

    public void setRoomNoAssigned(int roomNoAssigned)
    {
        this.roomNoAssigned = roomNoAssigned;
    }

    public void setBillPayed(boolean billPayed)
    {
        this.billPayed = billPayed;
    }

    public void setTotalBillPerMonth(double totalBillPerMonth)
    {
        this.totalBillPerMonth = totalBillPerMonth;
    }

    public void setTotalAdvancePayed(double totalAdvancePayed)
    {
        this.totalAdvancePayed = totalAdvancePayed;
    }

    public void setTotalAmountPending(double totalAmountPending)
    {
        this.totalAmountPending = totalAmountPending;
    }

    public void setNoOfMonths(int noOfMonths)
    {
        this.noOfMonths = noOfMonths;
    }
}
