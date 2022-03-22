import java.util.Arrays;
import java.util.stream.IntStream;

public class functionTest {
    public static void main(String args[]) {
        int[] data = {3, 5, 4, 8, 11, 1, 4, 6};
        int sum = IntStream.of(data).sum();
        int sum2 = Arrays.stream(data).sum();
        System.out.println(sum + "," +sum2);

    }
}
