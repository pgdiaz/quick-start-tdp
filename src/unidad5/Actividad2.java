package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad2 {

    /*
     * Desarrollar un programa Java que permita el ingreso de tres números enteros
     * distintos desde el teclado, y determine e imprima el menor.
     */

    public static void main(String[] args) throws IOException {
        int x, y, z, min;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        x = getValueFrom(input);
        y = getValueFrom(input);
        z = getValueFrom(input);

        if (x <= y) {
            min = x <= z ? x : z;
        } else {
            min = y <= z ? y : z;
        }

        System.out.println(String.format("El menor valor es %d", min));
    }

    private static int getValueFrom(BufferedReader input) throws IOException {
        System.out.print("Introduzca un valor entero: ");
        System.out.flush();

        return Integer.valueOf(input.readLine());
    }

}
