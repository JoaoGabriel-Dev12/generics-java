/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author Usuario
 */
public class Student extends Person{
    
    private String matricula;

    public Student() {
        super();
    }
    
    public Student(String name, int yearOld, String matricula) {
        super(name, yearOld);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "Aluno(a): " +getName()+ ", " +getYearOld()+ " anos | Matricula: " +getMatricula();
    }
}
