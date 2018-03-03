/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 * edit in netbeans
 * edited in GitHub again
 * edited in GitHub
 * @author Praisan.pad
 */
public class Student {
    private long id;
    private String name;

    public Student() {
    }

    public Student(long id) {
        this.id = id;
    }
    

    
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "\tname:  " + name ;
    }
    
    
    
}
