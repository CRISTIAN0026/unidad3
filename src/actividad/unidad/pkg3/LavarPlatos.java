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

public class LavarPlatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pilaDePlatos = new Pila();

        System.out.println("¿Cuántos platos vas a lavar?");
        int cantidadPlatos = scanner.nextInt();

        for (int i = 1; i <= cantidadPlatos; i++) {
            System.out.println("Lavando el plato " + i);
            pilaDePlatos.push(i);
            System.out.println("Se colocó el plato " + i);
        }

        System.out.println("Todos los platos se han lavado y colocado en la pila.");

        while (!pilaDePlatos.estaVacia()) {
            int platoSacado = pilaDePlatos.pop();
            System.out.println("Se sacó el plato " + platoSacado);
        }

    }
}

