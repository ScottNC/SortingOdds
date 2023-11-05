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

    @org.junit.jupiter.api.Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @org.junit.jupiter.api.Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
}