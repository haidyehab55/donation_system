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
public interface CommandFactory {
      Icommand makeAddEmployeeCommand(int employeeId, String name, String address);
     Icommand makeAddVolunteerCommand(int volunteerId, String name, String address,String Username ,String password);
     Icommand makeDeleteEmployeeCommand(int employeeId);
      Icommand makeDeleteVolunteerCommand(int volunteerId);
    
}
