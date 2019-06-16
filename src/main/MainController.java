/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author xurror
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */ 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML 
    public void setRectangleButtonClicked(Event event) throws IOException{
        System.out.println("You Clicked Rectangle");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/shapes/rectangleScene.fxml"));
        loader.load();
        Parent p = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
                            
        stage.setTitle("RECTANGLE PANE");
        stage.show();
    }
    
    @FXML public void setRecAreaButtonClicked(Event event){
        
    }    
    
    @FXML public void setRecPerimeterButtonClicked(Event event){
        
    }        
    
    @FXML public void setCircleButtonClicked(Event event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/shapes/CircleScene.fxml"));
        loader.load();
        Parent p = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
                            
        stage.setTitle("CIRCLE PANE");
        stage.show();
        
    }
    
    @FXML public void setCircAreaButtonClicked(Event event){
        
    }    
    
    @FXML public void setCircHomeButtonClicked(Event event){
        
    }
    
    @FXML public void setRecHomeButtonClicked(Event event){
        
    }
    
}
