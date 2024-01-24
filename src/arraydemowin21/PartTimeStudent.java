/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemowin21;

/**
 *
 * @author MITANSU BOGHARA
 */
public class PartTimeStudent extends Student{
    
    private int numOfCourses;

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public PartTimeStudent(int numOfCourses, int sID, String sName) {
        super(sID, sName);
        this.numOfCourses = numOfCourses;
    }

    public PartTimeStudent(int sID, String sName) {
        super(sID, sName);
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
}
