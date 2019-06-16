/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author xurror
 */
public class Circle {
    private int ID=0;
    private double radius;
    private String color;
    
    public Circle(){
        this.ID++;
        this.radius = 0;
        this.color = "Black";
    }
    
    public Circle(double radius, String color){
        this.ID++;
        this.radius = radius;
        this.color = color;
    }
    
    public double area(){        
        return 3.14 * (this.radius * this.radius);
    }
    
    public double circumference(){        
        return 3.14 * (this.radius * 2);
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
}
