package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise {

    /**
     * El algoritmo tiene una complegidad lineal O(n). Realiza n operaciones en el bucle para crear el Map, n operaciones
     * recorriendo nuevamente el array para buscar en el map las correspondencias y la suma final. Si no me confundo,
     * O(3n) -> O(n)
     * Devolverá el número de pares "duplicados" ya que siendo K = 5 y la lista [1, 4] las parejas son 1-4 y 4-1.
     * @param arr
     * @param k
     * @return
     */
    public static int complementaryKPairs(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(k - arr[i], 1, Integer::sum);
        }
        return Arrays.stream(arr).map(element -> map.getOrDefault(element, 0)).sum();
    }
}