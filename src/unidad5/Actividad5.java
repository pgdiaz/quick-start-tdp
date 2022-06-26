package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import unidad5.actividad5.Calculadora;
import unidad5.actividad5.Series;

public class Actividad5 {

    public static void main(String[] args) throws IOException {
        showMenu();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.flush();
        switch (Integer.valueOf(input.readLine())) {
            case 1:
                resolverEcuacion(input);
                break;
            case 2:
                resolverOperacion(input);
                break;
            case 3:
                determinarMayorTemperatura(input);
                break;
            case 4:
                imprimirNumerosDivisibles(input);
                break;
            case 5:
                resolverSerieArmonica(input);
                break;
            default:
                break;
        }
    }

    private static void showMenu() {
        System.out.println("Listado de programas: ");
        System.out.println("\t1: Resolución de ecuación cuadrática");
        System.out.println("\t2: Calculadora");
        System.out.println("\t3: Determinar la mayor temperatura");
        System.out.println("\t4: Números divisibles");
        System.out.println("\t5: Serie armónica");
        System.out.println("\t6: Finalizar");
        System.out.print("Ingrese el número del programa a ejecutar: ");
    }

    private static void resolverEcuacion(BufferedReader input) throws IOException {
        System.out.print("Introduzca el primer coeficiente de la ecuación: ");
        System.out.flush();
        float a = Float.valueOf(input.readLine());
        System.out.print("Introduzca el segundo coeficiente de la ecuación: ");
        System.out.flush();
        float b = Float.valueOf(input.readLine());
        System.out.print("Introduzca el tercer coeficiente de la ecuación: ");
        System.out.flush();
        float c = Float.valueOf(input.readLine());
        Calculadora calculador = new Calculadora();
        calculador.resolverEcuacion(a, b, c);
    }

    private static void resolverOperacion(BufferedReader input) throws IOException {
        System.out.print("Introduzca un valor entero: ");
        System.out.flush();
        int a = Integer.valueOf(input.readLine());
        System.out.print("Introduzca un valor entero: ");
        System.out.flush();
        int b = Integer.valueOf(input.readLine());
        System.out.print("Introduzca el operador: ");
        System.out.flush();
        char operador = input.readLine().toCharArray()[0];
        Calculadora calculador = new Calculadora();
        calculador.resolverOperacion(a, b, operador);
    }

    private static void determinarMayorTemperatura(BufferedReader input) throws IOException {
        int limiteRegistros = 10;
        int[] temperaturas = new int[limiteRegistros];
        for (int i = 0; i < limiteRegistros; i++) {
            System.out.print(String.format("Introduzca el registro de temperatura[%d]: ", i + 1));
            System.out.flush();
            temperaturas[i] = Integer.valueOf(input.readLine());
        }
        Series serie = new Series();
        serie.determinarMayor(temperaturas);
    }

    private static void imprimirNumerosDivisibles(BufferedReader input) throws IOException {
        System.out.print("Introduzca el entero divisor: ");
        System.out.flush();
        int divisor = Integer.valueOf(input.readLine());
        Series serie = new Series();
        serie.imprimirDivisiblesPor(divisor);
    }

    private static void resolverSerieArmonica(BufferedReader input) throws IOException {
        System.out.print("Introduzca el valor limite (máximo 2 decimales): ");
        System.out.flush();
        double limite = Double.valueOf(input.readLine());
        Series serieArmonica = new Series();
        serieArmonica.determinarCantidadTerminos(limite);
    }

}
