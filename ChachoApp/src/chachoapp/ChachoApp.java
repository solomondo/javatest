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
public class ChachoApp {                 
    /**
     * @param args the command line arguments
    */   
    
    public static void main(String[] args) {               
        // TODO code application logic here              
        PrintMenu();
    }    
    
    public static CourseManager lManager = new CourseManager();        
    
    public static void PrintMenu() {
        System.out.println("*******************************************");
        System.out.println("0.- Add new Course");                
        System.out.println("1.- List Available Courses");        
        System.out.println("2.- Add students to a course");                
        System.out.println("3.- List the Students available in a course");                        
        System.out.println("*******************************************");                
        System.out.println("Select option: ");                
        Scanner sc = new Scanner(System.in);
        int intNum = sc.nextInt();   
        SelectOption(intNum);        
    }  
    
    public static String GetFieldValueFromConsole(String pField) {
        System.out.println(pField + ": ");
        Scanner sc = new Scanner(System.in);
        String intStr = sc.next();
        return intStr;
    }
    
    public static void SelectOption(int pOption) {
        String lID;
        String lName;
        String lDes;        
        switch (pOption) {
            case 0:  
                lID = GetFieldValueFromConsole("ID");                
                lName = GetFieldValueFromConsole("Name");                
                lDes = GetFieldValueFromConsole("Description");
                lManager.NewCourse(Integer.valueOf(lID), lName, lDes);                
                break;                   
            
            case 1: 
                Course lCourse;
                int lIdCourse;
                Hashtable<Integer, Course> lCourses = lManager.GetCourses();                
                Set<Integer> keys = lCourses.keySet();                 
                Iterator<Integer> itr = keys.iterator();                 
                while (itr.hasNext()) {                     
                    lIdCourse = itr.next();       
                    //lCourse = lManager.GetCourse(lIdCourse);
                    lCourse = lCourses.get(lIdCourse);
                    System.out.println("Key: " + lIdCourse + "  Name: " + lCourse.name);
                }
                break;
/**                     
            case 2:  monthString = "March";
                     break;
            case 3:  monthString = "April";
                     break;
                     */
            default: break;
        } 
        PrintMenu();
    }
}
