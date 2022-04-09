/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

import javax.print.attribute.standard.RequestingUserName;

/**
 *
 * @author vip
 */
public    class  Volunteer {
  private final int volunteerid;
   private String name;
     private String password;
     private String phonenumber;
     private static int idCounter =1;

    public String getName() {
        return name;
    }
    


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     public String getpassword(){
        return this.password;
    } 
     public void setPassword(String p){
        this.password=p;
    }
    
    public int getVolunteerId() {
        return volunteerid;
    }
   private  String address;
   
    public  Volunteer(int volunteerid,String name,String address, String username,String password)
    {
        this.address=address;
        this.name=name;
        this.volunteerid=volunteerid;
    }
    
    public  Volunteer(String volunteerid,String name,String address)
    {
        
        this.address=address;
        this.name=name;
        this.volunteerid = Integer.parseInt(volunteerid);
        
    
    }
        public  Volunteer(String phonenumber,String volunteerid,String username,String address,String password)
    {
        
        this.address=address;
        this.name=username;
        this.volunteerid = idCounter++;
        this.password =password;
        
    }
    
    
     
}


