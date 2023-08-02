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
public class Employee extends Person
{
    private double Salary;
    private int[] roomNumbersAssigned = new int[5];
    private boolean salaryPaid;

    public Employee(double Salary, boolean salaryPaid, String Name, int Id, String Address, String phoneNo)
    {
        super(Name, Id, Address, phoneNo);
        this.Salary = Salary;
        this.salaryPaid = salaryPaid;
    }
    
    public Employee()
    {
        this(0.0,false,null,0,null,null);
    }

    public double getSalary()
    {
        return Salary;
    }

    public int[] getRoomNumbersAssigned()
    {
        return roomNumbersAssigned;
    }

    public boolean isSalaryPaid()
    {
        return salaryPaid;
    }

    public void setSalary(double Salary)
    {
        this.Salary = Salary;
    }

    public void setRoomNumbersAssigned(int[] roomNumbersAssigned)
    {
        this.roomNumbersAssigned = roomNumbersAssigned;
    }

    public void setSalaryPaid(boolean salaryPaid)
    {
        this.salaryPaid = salaryPaid;
    }
}
