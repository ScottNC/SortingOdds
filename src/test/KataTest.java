import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @org.junit.jupiter.api.Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }

    @org.junit.jupiter.api.Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 7 }, Kata.sortArray(new int[]{ 1, 7 }));
    }
}