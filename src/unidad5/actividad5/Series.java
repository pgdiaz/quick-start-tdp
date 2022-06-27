package unidad5.actividad5;

import java.math.BigDecimal;
import java.util.Arrays;

public class Series {

    /*
     * Diseñe un programa que permita ingresar una serie de n temperaturas tomadas
     * en una determinada región. Determinar e imprimir la mayor de ellas.
     */
    public void determinarMayor(int[] temperaturas) {
        int maxima = Integer.MIN_VALUE;
        for (int temperatura : temperaturas) {
            if (temperatura > maxima) {
                maxima = temperatura;
            }
        }
        System.out.println(String.format("La mayor temperatura registrada fue %d", maxima));
    }

    /*
     * Dado un conjunto n de números enteros, imprimir aquellos que sean
     * divisibles por k, ingresado desde el teclado.
     */
    public void imprimirDivisiblesPor(int divisor) {
        int[] conjunto = { 5, 8, 12, 15, 20, 25, 32, 40, 55, 60 };
        System.out.println("El conjunto a analizar es: " + Arrays.toString(conjunto));
        System.out.print(String.format("El subconjunto divisible por %d es: [ ", divisor));
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] % divisor == 0) {
                System.out.printf(i == conjunto.length - 1 ? "%d" : "%d, ", conjunto[i]);
            }
        }
        System.out.println(" ]");
    }

    /*
     * Desarrolle un programa que permita conocer cuántos términos de
     * la serie armónica se necesitan para satisfacer la desigualdad
     * 1 + ½ + 1/3 + . . . + 1/n > límite.
     * El valor de límite debe ingresarse desde el teclado.
     */
    public void determinarCantidadTerminos(double limite) {
        int limiteTerminos = 10000;
        System.out.println(String.format(
            "El límite de términos pre-establecido es %d", limiteTerminos));
        double resultado = 0;
        int contador = 0;
        do {
            contador++;
            resultado += (1d / contador);
        } while (comparar(resultado, limite) <= 0 && contador < limiteTerminos);
        System.out.println(String.format(
                "Se necesitan %d término(s) de la serie armónica para superar el límite %.2f",
                contador,
                limite));
    }

    /*
     * Compara dos valores de tipo double con precisión 2
     * usando el método de redondeo ROUND_HALF_EVEN.
     * Retorna -1 si x es menor que y
     * Retorna 0 si x es igual que y
     * Retorna 1 si x es mayor que y
     */
    private int comparar(double x, double y) {
        BigDecimal xRound = BigDecimal.valueOf(x).setScale(2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal yRound = BigDecimal.valueOf(y).setScale(2, BigDecimal.ROUND_HALF_EVEN);

        return xRound.compareTo(yRound);
    }

}
