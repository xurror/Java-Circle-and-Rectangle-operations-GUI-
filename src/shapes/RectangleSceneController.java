/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Stage;
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
    public void setDisplay(Event event) throws IOException{
        double length = Double.parseDouble(input_length.getText());
        double width = Double.parseDouble(input_width.getText());
        String color = input_color.getText().toString();
                
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DrawRectangle.fxml"));
        loader.load();
        Parent parent = loader.getRoot();

        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();                                                        

        stage.hide();
        stage.setScene(scene);

        DrawRectangleController drawRectangle = loader.getController();
        drawRectangle.setRectangleParams(color, length, width);

        stage.setTitle("RECTANGLE");                            
        stage.show();
        
    }
    
}
