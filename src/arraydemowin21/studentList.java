/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemowin21;

/**
 * added new comments on 24 january at 1:53PM
 * new comments
 * @author MITANSU BOGHARA
 * edit comments for fetch and merge
 */
public class studentList {
    public static void main(String[] main){
        Student s1 = new Student (1, "Mitansu");
        
        Student[] studentList = new Student[3];
        
        studentList[0] = s1;
        studentList[1] = new Student(2, "Lasan");
        studentList[2] = new Student(3, "Kenil");
        
        for(int i=0; i<studentList.length; i++){
            System.out.println(studentList[i].getsName());
        }

    }//end of main
    
}//end of class
