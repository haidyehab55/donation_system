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
public class DeleteEmployeeCommand implements Icommand{

    private final int employeeId;

    public DeleteEmployeeCommand(int employeeId) {
        this.employeeId = employeeId;
    }
    
    
    
    @Override
    public void execute() {
        GOrgDatabase.deleteEmployee(employeeId);
    }
    
}
