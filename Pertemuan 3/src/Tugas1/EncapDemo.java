/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setNama(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }

    public void status() {
        System.out.println("Name : " + getName());
        if (age > 18 && age < 30) {
            System.out.println("Age : " + getAge());
        } else {
            System.out.println("Age minimal 18 dam maksimal 30");
        }
        System.out.println();
    }
}
