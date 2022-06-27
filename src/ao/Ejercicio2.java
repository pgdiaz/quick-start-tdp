package ao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese los lados del triángulo: ");
        System.out.flush();
        int lado1 = Integer.valueOf(reader.readLine());
        int lado2 = Integer.valueOf(reader.readLine());
        int lado3 = Integer.valueOf(reader.readLine());
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triángulo equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno");
        }
    }

}
