package unidad5.actividad5;

public class Calculadora {

    /*
     * Diseñe un programa que lea una terna de números reales que representan los
     * coeficientes de una ecuación de segundo grado con una incógnita, y calcule e
     * imprima sus raíces en todos los casos posibles.
     */
    public void resolverEcuacion(float a, float b, float c) {
        float delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("La ecuación no tiene solución");
        } else if (delta == 0) {
            System.out.println(String.format("La solución única es %.2f", (-b) / (2 * a)));
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println(String.format("Las dos soluciones son %.2f y %.2f", x1, x2));
        }
    }

    /*
     * Escribir y ejecutar un programa que simule una calculadora simple.
     * Lee dos enteros y un carácter.
     * Si el carácter es un "+", se imprime la suma;
     * Si es un "-", se imprime la diferencia;
     * Si es un "*", se imprime el producto;
     * Si es "/", se imprime el cociente;
     * Si es "%", se imprime el resto.
     */
    public void resolverOperacion(int a, int b, char operador) {
        switch (operador) {
            case '+':
                System.out.print(String.format("Resultado: %d", a+b));
                break;
            case '-':
                System.out.print(String.format("Resultado: %d", a-b));
                break;
            case '*':
                System.out.print(String.format("Resultado: %d", a*b));
                break;
            case '/':
                System.out.print(String.format("Resultado: %d", a/b));
                break;
            case '%':
                System.out.print(String.format("Resultado: %d", a%b));
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }

}
