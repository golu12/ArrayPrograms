
import java.util.Arrays;

public class functionTest {
    public static void main(String args[]) {
        int[] data = {3, 5, 4, 8, 11, 1, 4, 6};
        int [] reverse = new int[data.length];
        int firstElement = 0;
        int lastElement = data.length-1;

        while(firstElement < lastElement){
            int temp = data[firstElement];
            data[firstElement] = data[lastElement];
            data[lastElement] = temp;
            firstElement++;
            lastElement--;


        }
        System.out.println(Arrays.toString(data));
    }
}
