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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
import static donation_system.Database.GlobalInstance.GOrgDatabase;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class Activity2Controller implements Initializable {

    CommandFactory factory = new CommandFctorImp1();
    
    
    @FXML private TextField VolAddress;
    @FXML private TextField volUN;
     @FXML
    private PasswordField volPw;
      @FXML private TextField volName;
     @FXML private static int idInit =0;
    
    
     @FXML
    private void sign_in(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sign_in.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }
    
    @FXML
    private void SignUpBtnClicked(ActionEvent event) throws IOException
    {
        idInit++;
        factory.makeAddVolunteerCommand(idInit, volName.getText(), VolAddress.getText(),volName.getText() , volPw.getText());
        
        Parent root = FXMLLoader.load(getClass().getResource("activity_volunteer.fxml"));
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
