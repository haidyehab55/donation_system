/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donation_system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class FawryController implements Initializable {

    /**
     * Initializes the controller class.
     */
       @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;

    @FXML
    void pay_now(ActionEvent event) throws IOException {
String username = name.getText();
        String phonenumber = phone.getText();
          String Emil= email.getText();
          
            pay d= new Fawary();
            
            d.addUserInfo(username, phonenumber, Emil);
          
              Parent root = FXMLLoader.load(getClass().getResource("successful.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }
    @FXML
    void BackBtnClicked(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("choise.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
