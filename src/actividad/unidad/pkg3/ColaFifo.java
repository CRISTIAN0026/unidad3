/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.unidad.pkg3;

import java.util.LinkedList;
/**
 *
 * @author crist
 */

public class ColaFifo {

    private final LinkedList<Integer> cola;

    public ColaFifo() {
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
          
            while (i < cola.size() && dato > cola.get(i)) { 
                i++;
            }
            
            cola.add(i, dato);
        }
    }

    public int dequeue() {
        return cola.removeFirst();
    }

    public int peek() {
        return cola.getFirst();
    }

    @Override
    public String toString() {
        return "ColaFifo{" + "cola=" + cola + '}';
    }
}

