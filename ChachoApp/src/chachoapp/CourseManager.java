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
public class CourseManager {
    private Hashtable<Integer, Course> courses = new Hashtable<Integer, Course>();
    
    public CourseManager() {
        
    }
    
    public Course NewCourse(int pID, String pName, String pDes) {
        Course lcourse = new Course(pID, pName, pDes);
        courses.put(pID, lcourse);
        return lcourse;              
    }
    
    public Student AddStudentToCourse(int pID, String pName, int pAge, Course pCourse) {
        return pCourse.addStudent(pID, pName, pAge);
    }
    
    public Course GetCourse(int pID) {
        return courses.get(pID);
    }
    
    public Hashtable<Integer, Course> GetCourses () {
        return courses;
    }   
    
}
