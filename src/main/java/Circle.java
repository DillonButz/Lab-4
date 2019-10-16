

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class Circle 
{
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double Radius)
    {
        this.radius = Radius;
    }
    public Circle()
    {
        this.radius = 0;
    }
    
    public double area()
    {
        double answer;
        answer = this.PI * this.radius * this.radius; 
        return answer; 
        
    }
    
    public double circumference()
    {
        double answer; 
        answer = 2 * this.PI * this.radius;
        return answer;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }
}
