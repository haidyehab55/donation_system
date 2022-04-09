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
public abstract class login_template {
    
 String username;String password;

    
    public final  void login(String username,String password){
        setpassword(password);
        setusername(username);
        
    }
    public    void setusername(String username){this.username=username;}
     public   void setpassword(String password){this.password=password;}
}
