package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> numbers = exercise.Implementations.right(numbers1, 4);
        Integer[] expected = {1,2,3,4};

        assertThat(numbers).contains(expected);
        // END
    }

    @Test
    void testTake2() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> numbers = exercise.Implementations.right(numbers1, 0);
        Integer[] expected = {};

        assertThat(numbers).contains(expected);
        // END
    }
}
