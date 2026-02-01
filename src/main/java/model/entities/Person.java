/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author Usuario
 */
public abstract class Person {
    
    private String name;
    private int yearOld;

    public Person() {
    }

    public Person(String name, int yearOld) {
        this.name = name;
        this.yearOld = yearOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    @Override
    public String toString() {
        return name+ ", " +yearOld+ " anos";
    }
    
    
}
