package ao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    private static final String TEMPLATE_FORMAT = "%d x %d = %d";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valor;
        do {
            System.out.print("Ingrese un valor entero mayor que cero: ");
            System.out.flush();
            valor = Integer.valueOf(reader.readLine());
        } while (valor <= 0);
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(TEMPLATE_FORMAT, valor, i, valor * i);
            System.out.println();
        }
    }

}
