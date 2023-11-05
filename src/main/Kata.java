import java.util.Arrays;
import java.util.Stack;

public class Kata {
    public static int[] sortArray(int[] array) {
        Stack <Integer> oddNumbers = new Stack<>();

        Arrays.stream(array)
                .filter(num -> num % 2 == 1)
                .map(num -> -num)
                .sorted()
                .forEach(oddNumbers::push);

        return Arrays.stream(array)
                .map(num -> num % 2 == 1 ? -oddNumbers.pop() : num)
                .toArray();
    }
}
