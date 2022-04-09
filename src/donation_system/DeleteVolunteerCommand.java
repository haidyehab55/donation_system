/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

import static donation_system.Database.GlobalInstance.GOrgDatabase;

/**
 *
 * @author vip
 */
public class DeleteVolunteerCommand  implements Icommand{
    
     private final int volunteerId;

    public DeleteVolunteerCommand(int volunteerId) {
        this.volunteerId = volunteerId;
    }
    
    
    
    @Override
    public void execute() {
        GOrgDatabase.deleteEmployee(volunteerId);
    }
}

