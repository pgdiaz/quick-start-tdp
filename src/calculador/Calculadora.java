package calculador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Proceso: Multiplicar dos enteros ingresados por teclado
 * Entradas: A y B números enteros.
 * Salida: producto de A y B.
 */
public class Calculadora {

    private BufferedReader reader;

    public Calculadora() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Integer leerEntrada() throws IOException {
        System.out.print("Ingrese un entero: ");

        return Integer.valueOf(this.reader.readLine());
    }

    public Integer multiplicar(int a, int b) {
        return a*b;
    }

}
