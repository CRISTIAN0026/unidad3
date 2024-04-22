/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.unidad.pkg3;

import java.util.LinkedList;
/**
 *
 * @author crist
 */

public class Pila {
    private final LinkedList<Integer> pila;
    private int tamaño;

    public Pila() {
        pila = new LinkedList<>();
        tamaño = 0;
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int tamaño() {
        return tamaño;
    }

    public void push(int dato) {
        pila.addLast(dato);
        tamaño++;
    }

    public int pop() {
        if (estaVacia()) throw new RuntimeException("La pila está vacía");
        int dato = pila.removeLast();
        tamaño--;
        return dato;
    }

    public int peek() {
        if (estaVacia()) throw new RuntimeException("La pila está vacía");
        return pila.getLast();
    }
}

