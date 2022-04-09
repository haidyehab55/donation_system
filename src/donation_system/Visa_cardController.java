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
public class Visa_cardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField number;

    @FXML
    private TextField email;

    @FXML
    void pay_now(ActionEvent event) throws IOException {
       String username = name.getText();
        String phonenumber = phone.getText();
          String Emil= email.getText();
           String number_card= number.getText();
            pay d= new creditcard();
            creditcard c=new creditcard();
            d.addUserInfo(username, phonenumber, Emil);
            c.setNumber(number_card);
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
