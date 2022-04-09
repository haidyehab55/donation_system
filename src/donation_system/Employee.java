/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

/**
 *
 * @author vip
 */
public class Employee {
     private final int employeeid;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    public int getEmployeeId() {
        return employeeid;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   private  String address;
   
    public  Employee(int employeeid,String name,String address)
    {
        this.address=address;
        this.name=name;
        this.employeeid=employeeid;
    }
    
     public  Employee(String employeeid,String name,String address)
    {
        this.address=address;
        this.name=name;
        this.employeeid = Integer.parseInt(employeeid);
    }
    
    
}
