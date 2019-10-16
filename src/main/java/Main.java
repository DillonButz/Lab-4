
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class Main 
{
    public static void main(String[] args)
    {
        Scanner makeNewScanner = new Scanner(System.in);
        
        System.out.println("please enter the radius of the circle: ");
        double askForInput = makeNewScanner.nextDouble();
        Circle circleObj = new Circle(askForInput);
        
        System.out.println("The Area of the Circle is: "+ circleObj.area());
        System.out.println("The Circumfrance of the Circle is: "+ circleObj.circumference());
    }
}
