/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xurror
 */
public class CircleSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label show_area;
    @FXML
    private Label show_circumference;
    @FXML
    private Text show_results;
    
    @FXML
    private TextField input_radius;
    @FXML
    private TextField input_color;
    
    DecimalFormat df = new DecimalFormat("###.##");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
    }

    @FXML
    public void setCircumferenceButtonClicked(Event event){
        System.out.println("You Clicked Circumference");
        
        if (input_radius.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{            
            double radius = Double.parseDouble(input_radius.getText());
            String color = input_color.getText().toString(); 
            
            Circle circle = new Circle(radius, color);
            String circumference = String.valueOf(
                    df.format(circle.circumference()));
            show_circumference.setText(circumference);
                    
        } 
        
    }
    
    @FXML
    public void setAreaButtonClicked(Event event){
        System.out.println("You Clicked Area");
        
        if (input_radius.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{
            double radius = Double.parseDouble(input_radius.getText());
            String color = input_color.getText().toString(); 
            
            Circle circle = new Circle(radius, color);
            String area = String.valueOf(df.format(circle.area()));
            show_area.setText(area);
                    
        } 
    }
    
    @FXML
    public void setDisplay(Event event) throws IOException{
        
        double radius = Double.parseDouble(input_radius.getText());
        String color = input_color.getText().toString();
            
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DrawCircle.fxml"));
        loader.load();
        Parent parent = loader.getRoot();

        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();                                                        

        stage.hide();
        stage.setScene(scene);

        DrawCircleController drawCircle = loader.getController();
        drawCircle.setCircleParams(color, radius);

        stage.setTitle("CIRCLE");                            
        stage.show();  
    } 
    
}
