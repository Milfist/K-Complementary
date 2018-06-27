package exercise;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class ExerciseTest {

    static final int[] ARRAY2 = new int[]{ 9,7,3,6,8,6,1,2,5,4};
    static final int[] ARRAY3 = new int[]{ 1,1,2,3,5,7,8,8};
    static final int K_ = 9;

    int[] ARRAY = new int[10000];
    int K_2 = 0;

    @Before
    public void setup() {
        Random r = new Random();

        for (int i = 0; i < 10000; i++) {
            ARRAY[i] = r.nextInt((100 - 0) + 1) + 0;
        }

        K_2 = r.nextInt((100 - 0) + 1) + 0;

    }

    @Test
    public void test_algorithm_sorted_array() {
        StringBuffer sb = Exercise.kComplementarySorted(ARRAY3, K_);
//        System.out.println(sb);
    }

    @Test
    public void test_algorithm_super_sort_array() {
        int sb = Exercise.noOfComplementaryPairs(ARRAY3, K_);
        System.out.println(sb);
    }
}
