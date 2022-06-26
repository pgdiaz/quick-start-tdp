package unidad5;

public class Actividad4 {

    /*
     * Desarrollar un programa Java que calcule y escriba en pantalla el factorial
     * de n, entre los valores 1 y 10.
     */

    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.println(String.format("%d! = %d", n, factorial(n)));
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        int cont = 1;
        while (cont++ < n) {
            fact *= cont;
        }

        return fact;
    }

}
