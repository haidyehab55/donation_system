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
public class Admin_sceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    void EditEmployeeBtnClicked(ActionEvent event) throws IOException {
 Parent root = FXMLLoader.load(getClass().getResource("employee.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }

    @FXML
    void EditVolunteerClicked(ActionEvent event) throws IOException {
 Parent root = FXMLLoader.load(getClass().getResource("vonuteer.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }

    @FXML
    void HomePageClicked(ActionEvent event) throws IOException {
 Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
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
