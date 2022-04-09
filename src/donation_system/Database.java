package donation_system;





import donation_system.Employee;
import donation_system.Volunteer;
import java.util.List;
/**
 *
 * @author vip
 */
import java.util.List;
/**
 *
 * @author vip
 */
public interface Database {
    
    class GlobalInstance {
		public static Database GOrgDatabase;
	}
	
	void clear();

	void addEmployee(int employeeId, Employee employee);
	void deleteEmployee(int employeeId);
        
        void addVolunteer(int volunteerId, Volunteer Volunteer);
	void deleteVolunteer(int volunteerId);
        
        Employee getEmployee(int employeeID);
        Volunteer getVolunteer(int volunteerID);
        
        List<Integer> getAllEmployeeIds();
        List<Integer> getAllVolunteerIds();
	
    
}
