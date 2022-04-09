/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author vip
 */

import static donation_system.Database.GlobalInstance.GOrgDatabase;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VonuteerController implements Initializable {

    
     CommandFactory factory = new CommandFctorImp1();
 
    @FXML private TextField volID;
    @FXML private TextField volName;
    @FXML private TextField volAdd;
    
    @FXML private TableView<Volunteer> volunteerTable;
    
    @FXML private TableColumn<Employee, String> volunteerId;
    @FXML private TableColumn<Employee, String> volunteerName;
    @FXML private TableColumn<Employee, String> volunteerAdd;
    
     public void AddBtnClicked()
    {
         int id = Integer.parseInt(volID.getText());
         
       
        volunteerTable.getItems().add(new Volunteer(volID.getText() ,volName.getText(),volAdd.getText()));
         
    }
    
     public void DeleteBtnClicked()
    {
         int id = Integer.parseInt(volID.getText());
       
         Volunteer selectedItem = volunteerTable.getSelectionModel().getSelectedItem();
    volunteerTable.getItems().remove(selectedItem);
        
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
         volunteerId.setCellValueFactory(new PropertyValueFactory<Employee,String>("VolunteerId"));
      volunteerName.setCellValueFactory(new PropertyValueFactory<Employee,String>("Name"));
       volunteerAdd.setCellValueFactory(new PropertyValueFactory<Employee,String>("Address"));
    }    
    
}