package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad3 {

    /*
     * Desarrollar un programa que permita el ingreso de la calificación de un
     * alumno en una evaluación y muestre el concepto de la misma.
     */

    enum Calificacion {
        A, B, C, D, E;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca la calificación del alumno: ");
        System.out.flush();
        Calificacion nota = Calificacion.valueOf(input.readLine());
        String concepto = null;
        switch (nota) {
            case A:
                concepto = "Excelente";
                break;
            case B:
                concepto = "Notable";
                break;
            case C:
                concepto = "Aprobado";
                break;
            case D:
            case E:
                concepto = "Suspendido";
                break;
        }

        System.out.println(String.format("Asigno la siguiente calificación: %s", concepto));
    }

}
