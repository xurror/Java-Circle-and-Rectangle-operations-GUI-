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
import javafx.scene.shape.Rectangle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xurror
 */
public class DrawRectangleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Rectangle rectangle;
    
    private double length;
    private double width;
    private String color;
    
    public void setRectangleParams(String color, double length, double width) {
        
        this.length = length;
        this.width = width;
        this.color = color.toUpperCase();        
        drawRectangle();
        
    }
    
    public void drawRectangle(){
                
        rectangle.setHeight(this.width);
        rectangle.setWidth(this.length);
        rectangle.setStrokeWidth(4);
        rectangle.setStroke(Color.DARKSLATEBLUE);        
        try{
            rectangle.setFill(Color.valueOf(color));
        }
        catch (IllegalArgumentException e){
            rectangle.setFill(Color.valueOf("BLACK"));
            JOptionPane.showMessageDialog(null, "Invalid color specification");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
        
    }    
    
}
