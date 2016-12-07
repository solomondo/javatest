/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachoapp;

import java.util.*;

/**
 *
 * @author pablo.mateos
 */
public class Course {
    private List<Student> students; 
    
    public int id;
    public String name;
    public String description;  
    
    public List<Student> getStudents() {
        return  students;
    }
    
    public Course(int pId, String pName, String pDescription) {
        id = pId;
        students = new ArrayList<Student>();
        name = pName;
        description = pDescription;                            
    }
    
    public void setId(int value) {
        id = value;        
    }
    
    public void setName(String value) {
        name = value;
    }
    
    public void setDescription(String value) {
        description = value;
    }
    
    public String getName() {
        return name;            
    }
    
    public String getDescription() {
        return description;            
    }
    
    public Student addStudent(int pId, String pName, int pAge) {
        Student student = new Student(pId, pName, pAge);
        students.add(student);        
        return student;
    }           
            
}
 
    
    
        
    
