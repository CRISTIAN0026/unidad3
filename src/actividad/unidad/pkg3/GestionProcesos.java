/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.unidad.pkg3;

import java.util.Scanner;
/**
 *
 * @author crist
 */

public class GestionProcesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ColaFifo colaProcesosFIFO = new ColaFifo();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la prioridad de la tarea" + i + " para la cola FIFO:");
            colaProcesosFIFO.enqueue(scanner.nextInt());
        }

        System.out.println(colaProcesosFIFO.toString());
        System.out.println("La tarea con mayor prioridad: " + colaProcesosFIFO.dequeue());

        ColaLifo colaProcesosLIFO = new ColaLifo();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la prioridad de la tarea" + i + " para la cola LIFO:");
            colaProcesosLIFO.enqueue(scanner.nextInt());
        }

        System.out.println(colaProcesosLIFO.toString());
        System.out.println("Latarea con mayor prioridad: " + colaProcesosLIFO.dequeue());

        
    }
}



