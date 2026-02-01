/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class PrintServices<T> {
    
    private final List<T> lista = new ArrayList<>();

    public List<T> getLista() {
        return Collections.unmodifiableList(lista);
    }
    
    public T getFirst() {
        return lista.getFirst();
    }
    
    public T getLast() {
        return lista.getLast();
    }
    
    public void remove(T value) {
        lista.remove(value);
    }
    
    public void add(T value) {
        lista.add(value);
    }
    
    public void print() {
        lista.forEach(obj -> {
            System.out.println(obj);
        });
    }
}
