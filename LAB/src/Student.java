/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Student {
    private String studentName;
    private String studentID;
    private String program;// e.g. CS233 
    private double test;
    private double assignment;
    private double finalM;

    public Student() {        
    }

    public Student(String studentName, String studentID, String program, double test, double assignment, double finalM) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.program = program;
        this.test = test;
        this.assignment = assignment;
        this.finalM = finalM;
    }  

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public double getAssignment() {
        return assignment;
    }

    public void setAssignment(double assignment) {
        this.assignment = assignment;
    }

    public double getFinalM() {
        return finalM;
    }

    public void setFinalM(double finalM) {
        this.finalM = finalM;
    }
    
    public String toString(){
        return getStudentName() + " " + getStudentID() + " " + getProgram() + " " + getTest() + " " + getAssignment() + " " + getFinalM();
    }
    
    public double calculateFinalMarks(){
        finalM = (test*0.3) + (assignment*0.2) + finalM*0.5;
        
        return finalM;
    }
    
        public static void main(String args[]){
            Student s1 = new Student("Lalisa", "0001","CS230",99.0,89.0,85.5);
            Student s2 = new Student("Chaeyoung Park", "0002","CS240",95.0,95.0,85.9);
            Student s3 = new Student("Jenny Kim", "0003","CS264",90.0,90.9,90.0);           
            Student s4 = new Student("Jisoo Kim", "0004","CS253",99.5,88.8,95.0);
            
            System.out.println(s1.getStudentName());
            System.out.println(s1.getStudentID());
            System.out.println(s1.calculateFinalMarks());
            
            System.out.println(s2.getStudentName());
            System.out.println(s2.getStudentID());
            System.out.println(s2.calculateFinalMarks());
            
            System.out.println(s3.getStudentName());
            System.out.println(s3.getStudentID());
            System.out.println(s3.calculateFinalMarks());
            
            System.out.println(s4.getStudentName());
            System.out.println(s4.getStudentID());
            System.out.println(s4.calculateFinalMarks());
            System.out.println();
            
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println(s3.toString());
            System.out.println(s4.toString());
        }
        

}
