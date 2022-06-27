package ao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca dos valores entero: ");
        System.out.flush();
        int a = Integer.valueOf(input.readLine());
        int b = Integer.valueOf(input.readLine());
        System.out.print("Introduzca el operador: ");
        System.out.flush();
        char operador = input.readLine().toCharArray()[0];
        resolverOperacion(a, b, operador);
    }

    private static void resolverOperacion(int a, int b, char operador) {
        switch (operador) {
            case '+':
                System.out.print(String.format("Resultado: %d", a + b));
                break;
            case '-':
                System.out.print(String.format("Resultado: %d", a - b));
                break;
            case '*':
                System.out.print(String.format("Resultado: %d", a * b));
                break;
            case '/':
                System.out.print(String.format("Resultado: %d", a / b));
                break;
            case '%':
                System.out.print(String.format("Resultado: %d", a % b));
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }

}
