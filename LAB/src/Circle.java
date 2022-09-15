/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Circle {
    
    public double radius = 1.0;
    
    double getArea(){
    return radius*radius * Math.PI;
    }
    
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("radius is " + myCircle.radius);
    }

            }
