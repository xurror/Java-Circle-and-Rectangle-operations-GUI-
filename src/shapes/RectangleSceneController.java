/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xurror
 */
public class RectangleSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label show_area;
    @FXML
    private Label show_perimeter;
    @FXML
    private Label show_results;
    
    @FXML
    private TextField input_length;
    @FXML
    private TextField input_width;
    @FXML
    private TextField input_color;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
    }

    @FXML
    public void setPerimeterButtonClicked(Event event){
        System.out.println("You Clicked Perimeter");
        
        if (input_length.getText().isEmpty() && input_width.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{
            double length = Double.parseDouble(input_length.getText());
            double width = Double.parseDouble(input_width.getText());
            String color = input_color.getText().toString(); 
            
            Rectangle rectangle = new Rectangle(length, width, color);
            String perimeter = String.valueOf(rectangle.perimeter());
            show_perimeter.setText(perimeter);
                    
        } 
        
    }
    
    @FXML
    public void setAreaButtonClicked(Event event){
        System.out.println("You Clicked Area");
        
        if (input_length.getText().isEmpty() && input_width.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{
            double length = Double.parseDouble(input_length.getText());
            double width = Double.parseDouble(input_width.getText());
            String color = input_color.getText().toString(); 
            
            Rectangle rectangle = new Rectangle(length, width, color);
            String area = String.valueOf(rectangle.area());
            show_area.setText(area);
                    
        } 
    }
    
    @FXML
    public void setSummaryButtonClicked(Event event){
        System.out.println("You Clicked Summary");
        
        if (input_length.getText().isEmpty() 
                && input_width.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        else{
            double length = Double.parseDouble(input_length.getText());
            double width = Double.parseDouble(input_width.getText());
            String color = null;
            
            if (input_color.getText().isEmpty())
                color = "Black";
            else
                color = input_color.getText().toString(); 
            
            Rectangle rectangle = new Rectangle(length, width, color);
            String area = String.valueOf(rectangle.area());
            String perimeter = String.valueOf(rectangle.perimeter());
            
            show_results.setText("A "+color+" rectangle of perimenter "
                    +perimeter+" and "+" area "+area);
                    
        }
    }
    
}
