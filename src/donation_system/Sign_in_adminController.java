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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class Sign_in_adminController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label lb;

   
     @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        String name = username.getText();
        String passwordInput = password.getText();
           login_template login = new AdminLogin();
            login.login(name,passwordInput);
         
        if ("admin".equals(name) && "123".equals(passwordInput)){
         
             Parent root = FXMLLoader.load(getClass().getResource("Admin_scene.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
        }
          else 
            {
                lb.setText("password or username not correct");
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
