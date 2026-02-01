/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudando.generics;

import model.entities.Person;
import model.entities.Student;
import model.entities.Teacher;
import model.service.PrintServices;

/**
 *
 * @author Usuario
 */
public class Generics {

    public static void main(String[] args) {
        PrintServices<Person> ps = new PrintServices<>();
        
        ps.add(new Student("Joao Gabriel", 17, "8903-44"));
        ps.add(new Teacher("Flavio", 50, "1230-90"));
        ps.add(new Student("Bianca", 16, "5622-94"));
        Person pessoa = new Student("Teste para remover", 90, "5422");
        ps.add(pessoa);
        
        ps.print();
        System.out.println("Primeiro da lista: " +ps.getFirst());
        System.out.println("Ultimo: " +ps.getLast());
        ps.remove(pessoa);
        ps.print();
    }
}
