/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachoapp;

/**
 *
 * @author pablo.mateos
 */
public class Student {
    public int id;
    public String name;
    public int age;

    public Student(int pId, String pName, int pAge) {
        id = pId;
        name = pName;
        age = pAge;
    }    
    
    public void setName(String value) {
        name = value;
    }
    
    public void setAge(int value) {
        age = value;
    }                   
    
    public void setId(int value) {
        id = value;
    }
}
