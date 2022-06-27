package ao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Un estudiante realiza cuatro (4) exámenes durante el semestre,
* los cuales tienen ponderación (del 10 al 100).
* Realice el pseudocódigo y el diagrama de flujo que representen el algoritmo
* correspondiente para obtener el promedio de las calificaciones obtenidas.
* Al finalizar debe mostrar el promedio obtenido, y un mensaje de aprobado o reprobado.
* Se aprueba con 60 puntos o más
*/
public class PromedioAlumno {

    private static final int CANT_NOTAS = 4;

    public static void main(String[] a) throws IOException {
        int acumulador = 0;
        int contador = 1;
        boolean notaInvalida;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Introduzca la nota " + contador + ": ");
            int nota = Integer.parseInt(entrada.readLine());
            notaInvalida = nota < 10 || nota > 100;
            if (notaInvalida) {
                System.out.println("Nota inválida");
            } else {
                acumulador += nota;
            }
        } while (notaInvalida || contador++ < CANT_NOTAS);
        int promedio = acumulador / CANT_NOTAS;
        System.out.println("El promedio es igual a: " + promedio);
        System.out.println(promedio >= 60 ? "Alumno Aprobado" : "Alumno Desaprobado");
    }

}
