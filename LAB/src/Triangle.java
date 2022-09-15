/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Triangle {
    
    private double side1,side2,side3;

    public Triangle() { //default constructor
        this.side1 =1;
        this.side2 =1;
        this.side3 =1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;     //normal constructor
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
     
    public double calcArea(){
        double sum=0.0;
        
        return sum = side1*side2*side3;
    }
    
    public double calcPerimeter(){
        double sum=0.0;
        
        return sum = (side1*side2)/2;
    }
    
    public static void main(String args[]){
    
       Triangle t1 = new Triangle(4,5,6);
       
       Triangle t2 = new Triangle(1.5,2.5,3.5);
       
        System.out.println(t1.getSide1()); 
        System.out.println(t1.getSide2());
        System.out.println(t1.getSide3());
        System.out.println(t1.calcArea());
        System.out.println(t1.calcPerimeter());
        
        System.out.println(t2.getSide1()); 
        System.out.println(t2.getSide2());
        System.out.println(t2.getSide3());
        System.out.println(t2.calcArea());
        System.out.println(t2.calcPerimeter());
    }
}
