import java.io.IOException;

import calculador.Calculadora;

public class App {

    public static void main(String[] args) throws IOException {
        Calculadora calculador = new Calculadora();
        Integer a = calculador.leerEntrada();
        Integer b = calculador.leerEntrada();
        Integer producto = calculador.multiplicar(a, b);
        System.out.println("Resultado: " + producto);
    }

}
