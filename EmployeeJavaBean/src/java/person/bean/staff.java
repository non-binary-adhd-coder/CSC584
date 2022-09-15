/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.bean;

/**
 *
 * @author hidayah
 */
public class staff implements java.io.Serializable {

    private String firstname;
    private String lastname;
    private int age;

    public staff() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //exercise 3
    public String getFullName() {
        String fullname;

        fullname = firstname.concat(" " + lastname);

        return fullname;
    }

}
