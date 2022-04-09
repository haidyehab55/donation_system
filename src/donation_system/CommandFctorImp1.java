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
public class CommandFctorImp1  implements CommandFactory{
     @Override
    public Icommand makeAddEmployeeCommand(int employeeId, String name, String address) {
        return new AddEmployeecommad(employeeId,name,address);
    }

    @Override
    public Icommand makeAddVolunteerCommand(int volunteerId, String name, String address,String username, String password) {
        return new AddVolunteerCommand(volunteerId,name,address, username, password);
    }

    @Override
    public Icommand makeDeleteEmployeeCommand(int employeeId) {
       return new DeleteEmployeeCommand( employeeId) ;
    }

    @Override
    public Icommand makeDeleteVolunteerCommand(int volunteerId) {
       return new DeleteVolunteerCommand(volunteerId) ;
    }
}
