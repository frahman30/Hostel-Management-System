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
public class Main
{
    public static Hostel H1 = new Hostel();
    public static PageOne P1 = new PageOne();
    public static PageTwo P2 = new PageTwo();
    
    public static void main(String[] Args)
    {
        P1.setLocationRelativeTo(null);
        P2.setLocationRelativeTo(null);
        
        Main.H1.getR1()[0].setCharges(1500.50);
        Main.H1.getR1()[0].setFacilities("Internet, Laundry, Mess");
        Main.H1.getR1()[0].setId(001);
        Main.H1.getR1()[0].setStatus(true);
        Hostel.roomsCounter+=1;
        
        Main.H1.getE1()[0].setAddress("Rawalpindi");
        Main.H1.getE1()[0].setId(001);
        Main.H1.getE1()[0].setName("Muhammad Asif");
        Main.H1.getE1()[0].setPhoneNo("051-809232");
        Main.H1.getE1()[0].setSalary(13000.50);
        Main.H1.getE1()[0].setSalaryPaid(false);
        Hostel.employeeCounter+=1;
        
        Main.H1.getS1()[0].setAddress("Kohat, Pakistan");
        Main.H1.getS1()[0].setBillPayed(false);
        Main.H1.getS1()[0].setId(001);
        Main.H1.getS1()[0].setNoOfMonths(6);
        Main.H1.getS1()[0].setPhoneNo("051-734843");
        Main.H1.getS1()[0].setRoomNoAssigned(100);
        Main.H1.getS1()[0].setTotalBillPerMonth(Main.H1.getR1()[0].getCharges());
        Main.H1.getS1()[0].setTotalAdvancePayed(0.0);
        Main.H1.getS1()[0].setTotalAmountPending(Main.H1.getR1()[0].getCharges());
        Main.H1.getS1()[0].setName("Ajmal");
        Hostel.studentsCounter+=1;
        
        P1.setVisible(true);
    }
}
