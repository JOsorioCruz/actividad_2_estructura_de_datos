import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class EjerciciosArrays {

    // 1. Calcular la media
    public static double calcularMedia(int[] arr) {
        int suma = 0;
        for (int num : arr) suma += num;
        return (double) suma / arr.length;
    }

    // 2. Segundo elemento más grande
    public static int segundoMayor(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("El arreglo debe tener al menos 2 elementos");
        int[] copia = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copia);
        return copia[copia.length - 2];
    }

    // 3. Contar pares
    public static int contarPares(int[] arr) {
        int count = 0;
        for (int num : arr) if (num % 2 == 0) count++;
        return count;
    }

    // 4. Eliminar duplicados en String[]
    public static String[] eliminarDuplicados(String[] arr) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toArray(new String[0]);
    }

    // 5. Verificar si está ordenado ascendentemente
    public static boolean estaOrdenado(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    // 6. Multiplicar cada elemento por un número dado
    public static int[] multiplicarElementos(int[] arr, int factor) {
        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length; i++) resultado[i] = arr[i] * factor;
        return resultado;
    }

    // 7. Encontrar posición de un elemento dado
    public static int encontrarPosicion(int[] arr, int elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) return i;
        }
        return -1;
    }

    // 8. Concatenar dos arreglos de String
    public static String[] concatenarArreglos(String[] arr1, String[] arr2) {
        String[] resultado = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, resultado, 0, arr1.length);
        System.arraycopy(arr2, 0, resultado, arr1.length, arr2.length);
        return resultado;
    }

    // 9. Eliminar elementos impares
    public static int[] eliminarImpares(int[] arr) {
        return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    }

    // 10. Sumar diagonal principal de una matriz cuadrada
    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) suma += matriz[i][i];
        return suma;
    }
}