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

public class SistemaEmergencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ColaFifo colaPacientesFIFO = new ColaFifo();

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la prioridad del paciente" + i + " para la cola FIFO:");
            colaPacientesFIFO.enqueue(scanner.nextInt());
        }

        System.out.println(colaPacientesFIFO.toString());

        
        System.out.println("Atendiendo al paciente con prioridad: " + colaPacientesFIFO.dequeue());

        
        ColaLifo colaPacientesLIFO = new ColaLifo();

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la prioridad del paciente" + i + " para la cola LIFO:");
            colaPacientesLIFO.enqueue(scanner.nextInt());
        }

        System.out.println(colaPacientesLIFO.toString());

        
        System.out.println("Atendiendo al paciente con prioridad: " + colaPacientesLIFO.dequeue());

    }
}


