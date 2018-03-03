/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2.Lecture05;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    public static void main(String[] args) {
        String test_name="Ike";
        Person emp=new Employee(test_name);
        System.out.println(emp);
        
        Person std =new Student("Ike",Student.Status.freshman);
        System.out.println(std);
        System.out.println(std.getSignature());
        Person[] persons=new Person[5];
        persons[0]=new Employee("Tonggon");
        persons[1]=new Student("Ket",Student.Status.junior);
        persons[2]=new Student("Ket",Student.Status.sophomore);
        persons[3]=new Staff("Anne","Infra-structure");
        persons[4]=new Employee("AAAAAAAAA");
        
        if(persons[1].equals(persons[2])){
            System.out.println("*********std1==std2************");
        }
        
//        for(int i=0;i<persons.length;i++){
//            System.out.println("------------------------------");
//            System.out.println(persons[i].toString());
//        }
//        
//        System.out.println(persons[0] instanceof Student);
        
    }
    @Test
    public void setNameToEmployee(){
        String test_name="Ike";
        Employee emp=new Employee(test_name);
        assertEquals(test_name, emp.getName());
    }
    
}