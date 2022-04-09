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

public class AddEmployeecommad implements Icommand{
    
    private final int employeeId;
	private final String name;
	private final String address;

    public AddEmployeecommad(int employeeId, String name, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }
        
                

    @Override
    public void execute() {
        Employee e = new Employee(employeeId, name, address);
        GOrgDatabase.addEmployee(employeeId, e);
    }

	
    
}

