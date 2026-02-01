/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author Usuario
 */
public class Teacher extends Person{
    
    private String code;

    public Teacher() {
        super();
    }
    
    public Teacher(String name, int yearOld, String code) {
        super(name, yearOld);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return "Professor(a): " +getName()+ ", " +getYearOld()+ " anos | Codigo: " +getCode();
    }
}
