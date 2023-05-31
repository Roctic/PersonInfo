package com.mycompany.pootest;

/**
 *
 * @author Roctic
 */
public class POOTest {

    public static void main(String[] args) {
       
       
       Person p1 = new Person("V", 19, 'H');
       
       p1.setAge(50);
       
       System.out.println("Name: " + p1.getName());
       System.out.println("Age:" + p1.getAge());
       System.out.println("Gender " + p1.getGender());
       
    }
}
