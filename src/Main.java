import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9, 4};
        String[] cadenas = {"java", "python", "java", "c++", "python"};

        System.out.println("1. Media: " + EjerciciosArrays.calcularMedia(numeros));
        System.out.println("2. Segundo mayor: " + EjerciciosArrays.segundoMayor(numeros));
        System.out.println("3. Cantidad pares: " + EjerciciosArrays.contarPares(numeros));
        System.out.println("4. Sin duplicados: " + Arrays.toString(EjerciciosArrays.eliminarDuplicados(cadenas)));
        System.out.println("5. Está ordenado?: " + EjerciciosArrays.estaOrdenado(numeros));
        System.out.println("6. Multiplicar por 2: " + Arrays.toString(EjerciciosArrays.multiplicarElementos(numeros, 2)));
        System.out.println("7. Posición del 9: " + EjerciciosArrays.encontrarPosicion(numeros, 9));
        System.out.println("8. Concatenar arreglos: " + Arrays.toString(EjerciciosArrays.concatenarArreglos(cadenas, new String[]{"ruby", "go"})));
        System.out.println("9. Sin impares: " + Arrays.toString(EjerciciosArrays.eliminarImpares(numeros)));

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("10. Suma diagonal: " + EjerciciosArrays.sumaDiagonal(matriz));
    }
}