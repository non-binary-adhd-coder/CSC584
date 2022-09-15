/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Cat extends Animal{

    protected int tagNumber;

    public Cat(int tn) {
        tagNumber = tn;
        if (hairColor.equals("unknown")) {
            hairColor = "brown";
        }
    }

    public int getTagNumber() {
        return tagNumber;
    }

    public String toString() {
        return "I am a Cat with " + hairColor + " hair color and tag number "
                + tagNumber;
    }
}
