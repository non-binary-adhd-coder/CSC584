/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Animal {

    public String hairColor;

    public Animal() {
        hairColor = "unknown";
    }

    public Animal(String hc) {
        hairColor = hc;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String toString() {
        return "I am an Animal with " + hairColor + " hair color.";
    }
}
