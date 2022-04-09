/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author vip
 */



import static donation_system.Database.GlobalInstance.GOrgDatabase;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EmployeeController implements Initializable {
    
    CommandFactory factory = new CommandFctorImp1();

 
    @FXML private TextField empID;
    @FXML private TextField empName;
    @FXML private TextField empAdd;
    
    @FXML private TableView<Employee> employeeTable;
    
    @FXML private TableColumn<Employee, String> employeeId;
    @FXML private TableColumn<Employee, String> employeeName;
    @FXML private TableColumn<Employee, String> employeeAdd;
    
   
    public void AddBtnClicked()
    {
         int id = Integer.parseInt(empID.getText());
        factory.makeAddEmployeeCommand(id, empName.getText(), empAdd.getText());
        employeeTable.getItems().add(new Employee(empID.getText() ,empName.getText(),empAdd.getText()));
         
    
        
        
    }
    
     public void DeleteBtnClicked()
    {
         int id = Integer.parseInt(empID.getText());
        factory.makeDeleteEmployeeCommand(id);
         Employee selectedItem = employeeTable.getSelectionModel().getSelectedItem();
    employeeTable.getItems().remove(selectedItem);
         
    
        
        
    }
     
  
     public void BackBtnClicked(ActionEvent event) throws IOException
     {
         Parent EmpView = FXMLLoader.load(getClass().getResource("Admin_scene.fxml"));
         Stage stage =new Stage();
               Scene scene = new Scene(EmpView);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
     }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       employeeId.setCellValueFactory(new PropertyValueFactory<Employee,String>("EmployeeId"));
       employeeName.setCellValueFactory(new PropertyValueFactory<Employee,String>("Name"));
       employeeAdd.setCellValueFactory(new PropertyValueFactory<Employee,String>("Address"));
        
      
        
    }    
    
    
}