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
public abstract class Donation_template {
    String userName ; String phone ; String email;
      public final void addUserInfo(String userName , String phone , String email){
        setUserName(userName);
        setUserphone(phone);
        setUserEmail(email);
        
    }
    public void setUserName(String name){this.userName=name;}
    public void setUserphone(String phone){this.phone=phone;}
    public  void setUserEmail(String email){this.email=email;}
   
  
    
    
   
}
