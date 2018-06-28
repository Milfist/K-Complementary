package exercise;

import org.junit.Assert;
import org.junit.Test;

public class ExerciseTest {

    static final int[] ARRAY_1 = new int[]{9,7,3,6,8,6,1,2,5,4,0};
    static final int[] ARRAY_2 = new int[]{1,1,2,3,5,7,8,8};
    static final int[] ARRAY_3 = new int[]{8, 6, 2, -4, 5, -3, 0, 9, 12, -3, -12, 21};
    static final int K = 9;

    @Test
    public void test_algorithm_with_ARRAY_1() {
        int pairs = Exercise.complementaryKPairs(ARRAY_1, K);
        Assert.assertTrue(12 == pairs);
    }

    @Test
    public void test_algorithm_with_ARRAY_2() {
        int pairs = Exercise.complementaryKPairs(ARRAY_2, K);
        Assert.assertTrue(10 == pairs);
    }

    @Test
    public void test_algorithm_with_ARRAY_3() {
        int pairs = Exercise.complementaryKPairs(ARRAY_3, K);
        Assert.assertTrue(8 == pairs);
    }
}
