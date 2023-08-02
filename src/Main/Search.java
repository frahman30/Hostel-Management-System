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
public interface Search
{
    public boolean isSearchRoom(int A);
    public boolean isSearchRoom(boolean A);
    
    public boolean isSearchStudent(int A);
    public boolean isSearchStudent(String A);
    
    public boolean isSearchEmployee(int A);
    public boolean isSearchEmployee(String A);
    
    public int searchRoom(int A);
    public int searchRoom(boolean A);
    
    public int searchStudent(int A);
    public int searchStudent(String A);
    
    public int searchEmployee(int A);
    public int searchEmployee(String A);
}
