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

public class ColaLifo {

    private final LinkedList<Integer> cola;

    public ColaLifo() {
        cola = new LinkedList<>();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void enqueue(int dato) {
        if (cola.isEmpty()) {
            cola.add(dato);
        } else {
            int i = 0;

            while (i < cola.size() && dato < cola.get(i)) {
                i++;
            }
            
            cola.add(i, dato);
        }
    }

    public int dequeue() {
        return cola.removeLast();
    }

    @Override
    public String toString() {
        return "ColaLifo{" + "cola=" + cola + '}';
    }

    public int peek() {
        return cola.getLast();
    }
}

