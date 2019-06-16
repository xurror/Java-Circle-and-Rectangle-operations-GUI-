/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
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
    public void setSummaryButtonClicked(Event event){
        System.out.println("You Clicked Summary");
        
        if (input_radius.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{
            double radius = Double.parseDouble(input_radius.getText());
            String color = null;
            
            if (input_color.getText().isEmpty())
                color = "Black";
            else
                color = input_color.getText().toString();                         
            
            Circle circle = new Circle(radius, color);
            String area = String.valueOf(df.format(circle.area()));
            String circumference = String.valueOf(
                    df.format(circle.circumference()));
            
            show_results.setText("A "+color+" circle of circumference "
            +circumference+" and area "+area+".");
                    
        }
    } 
    
}
