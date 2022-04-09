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
import static donation_system.Database.GlobalInstance.GOrgDatabase;

public class AddVolunteerCommand implements Icommand{

    
    private final int volunteerId;
	private final String name;
	private final String address;
        private final String username;
   private final String password;

    

    public AddVolunteerCommand(int volunteerId, String name, String address, String username, String password) {
        this.volunteerId = volunteerId;
        this.name = name;
        this.address = address;
        this.username = username;
        this.password = password;
    }
        
        
    @Override
    public void execute() {
        
        Volunteer volunteer = new Volunteer(volunteerId, name, address,username ,password);
        GOrgDatabase.addVolunteer(volunteerId, volunteer);
    }
     
}