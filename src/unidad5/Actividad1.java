package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1 {

    /*
     * Desarrollar un programa Java que permita el ingreso de dos números enteros
     * distintos desde el teclado, y determine e imprima el menor.
     */

    public static void main(String[] args) throws IOException {
        int x, y;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca un valor entero: ");
        System.out.flush();
        x = Integer.valueOf(input.readLine());
        System.out.print("Introduzca un valor entero: ");
        System.out.flush();
        y = Integer.valueOf(input.readLine());
        System.out.println(String.format("El menor valor es %d", x < y ? x : y));
    }

}
