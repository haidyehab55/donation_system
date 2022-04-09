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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemorydatabase implements Database{
    
    private final Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	private final Map<Integer, Volunteer> volunteers = new HashMap<Integer, Volunteer>();

    @Override
    public void clear() {
        employees.clear();
        volunteers.clear();
    }

    @Override
    public void addEmployee(int employeeId, Employee employee) {
       employees.put(employeeId, employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employees.remove(employeeId);
    }

    @Override
    public void addVolunteer(int volunteerId, Volunteer Volunteer) {
               volunteers.put(volunteerId, Volunteer);

    }

    @Override
    public void deleteVolunteer(int volunteerId) {
       volunteers.remove(volunteerId);
    }

    @Override
    public Employee getEmployee(int employeeID) {
         return employees.get(employeeID);
    }

    @Override
    public Volunteer getVolunteer(int volunteerID) {
        return volunteers.get(volunteerID);
    }

    @Override
    public List<Integer> getAllEmployeeIds() {
      return new ArrayList<Integer>(employees.keySet());
    }

    @Override
    public List<Integer> getAllVolunteerIds() {
        return new ArrayList<Integer>(volunteers.keySet());
    }
       
    
}