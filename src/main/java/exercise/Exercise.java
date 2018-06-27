package exercise;

import java.util.Arrays;

public class Exercise {

    /**
     * Recorremos el array con un bucle anidado para ir emparejando los valores que cumplen la condición, su suma debe
     * ser igual a k.
     * La notación Big-O del algoritmo es O(n^2) debido al primer buble, con el que recorro la lista hasta el final.
     * La ordenación del array es O(nlogn).
     * En el bucle anidado, cortamos la ejecución si el valor de la suma es menor que K, de esta manera evitamos O(n^2).
     * El resto es O(n)
     *
     * @param arr Data array
     * @param k   Reference number
     * @return
     */
    public static StringBuffer kComplementarySorted(int arr[], int k) {

        int n = arr.length;

        int result = 0;
        StringBuffer sb = new StringBuffer();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[i] + arr[j] == k) {
                    sb.append("[" + arr[i] + " - " + arr[j] + "], ");
                    result++;
                } else if (arr[i] + arr[j] < k) {
                    break;
                }
            }
        }
        System.out.println(result);

        return sb;
    }
}