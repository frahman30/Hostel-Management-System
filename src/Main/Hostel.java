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
public class Hostel implements Search
{
    private Room[] R1 = new Room[15];
    private Student[] S1 = new Student[15];
    private Employee[] E1 = new Employee[5];
    private Administrator A1 = new Administrator("Zaka","12345","Zaka Ur Rahman",300,"Wah Cantonement","051-0099881");
    
    public static double totalEarnings;
    public static int roomsCounter;
    public static int studentsCounter;
    public static int employeeCounter;
    
    public Hostel()
    {
        initializeRooms();
        initializeStudents();
        initializeEmployee();
        Hostel.employeeCounter = 0;
        Hostel.totalEarnings = 0.0;
        Hostel.studentsCounter = 0;
        Hostel.employeeCounter = 0;
    }

    public Room[] getR1()
    {
        return R1;
    }

    public Student[] getS1()
    {
        return S1;
    }

    public Employee[] getE1()
    {
        return E1;
    }

    public Administrator getA1()
    {
        return A1;
    }
    
    public void initializeRooms()
    {
        for (int i=0;i<R1.length;i++)
        {
            R1[i] = new Room();
        }
    }
    
    public void initializeStudents()
    {
        for (int i=0;i<S1.length;i++)
        {
            S1[i] = new Student();
        }        
    }
    
    public void initializeEmployee()
    {
        for (int i=0;i<E1.length;i++)
        {
            E1[i] = new Employee();
        }          
    }
    
    public boolean isSearchRoom(int A)
    {
        boolean Status = false;
        for (int i=0;i<R1.length;i++)
        {
            if (R1[i].getId() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchRoom(boolean A)
    {
        boolean Status = false;
        for (int i=0;i<R1.length;i++)
        {
            if (R1[i].isStatus() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;       
    }
    
    public boolean isSearchStudent(int A)
    {
        boolean Status = false;
        for (int i=0;i<S1.length;i++)
        {
            if (S1[i].getId() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchStudent(String A)
    {
        boolean Status = false;
        for (int i=0;i<S1.length;i++)
        {
            if (S1[i].getName() == null ? A == null : S1[i].getName().equals(A))
            {
                Status = true;
                break;
            }
        }
        return Status;       
    }
    
    public boolean isSearchEmployee(int A)
    {
        boolean Status = false;
        for (int i=0;i<E1.length;i++)
        {
            if (E1[i].getId() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchEmployee(String A)
    {
        boolean Status = false;
        for (int i=0;i<E1.length;i++)
        {
            if (E1[i].getName() == null ? A == null : E1[i].getName().equals(A))
            {
                Status = true;
                break;
            }
        }
        return Status;      
    }

    @Override
    public int searchRoom(int A)
    {
        int Index = 0;
        for (int i=0;i<R1.length;i++)
        {
            if (R1[i].getId() == A)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }

    @Override
    public int searchRoom(boolean A)
    {
        int Index = 0;
        for (int i=0;i<R1.length;i++)
        {
            if (R1[i].isStatus() == A)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }

    @Override
    public int searchStudent(int A)
    {
        int Index = 0;
        for (int i=0;i<S1.length;i++)
        {
            if (S1[i].getId() == A)
            {
                Index = i;
                break;                
            }
        }
        return Index;
    }

    @Override
    public int searchStudent(String A)
    {
        int Index = 0;
        for (int i=0;i<S1.length;i++)
        {
            if (S1[i].getName() == null ? A == null : S1[i].getName().equals(A))
            {
                Index = i;
                break;             
            }
        }
        return Index;
    }

    @Override
    public int searchEmployee(int A)
    {
        int Index = 0;
        for (int i=0;i<E1.length;i++)
        {
            if (E1[i].getId() == A)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }

    @Override
    public int searchEmployee(String A)
    {
        int Index = 0;
        for (int i=0;i<E1.length;i++)
        {
            if (E1[i].getName() == null ? A == null : E1[i].getName().equals(A))
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
}
