/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xurror
 */
public class DrawCircleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Circle circle;
    
    private double radius;
    private String color;
    
    public void setCircleParams(String color, double radius) {
        
        this.radius = radius;
        this.color = color.toUpperCase();        
        drawCircle();
        
    }
    
    public void drawCircle(){
                
        circle.setRadius(this.radius);
        circle.setStrokeWidth(4);
        circle.setStroke(Color.DARKSLATEBLUE);
        try{
            circle.setFill(Color.valueOf(color));
        }        
        catch (IllegalArgumentException e){
            circle.setFill(Color.valueOf("BLACK"));
            JOptionPane.showMessageDialog(null, "Invalid color specification");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
        
    }       
    
}
