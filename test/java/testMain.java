import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class testMain {

    @BeforeAll
    public static void started() {
        System.out.println("Тестирование началось");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Тестирование завершено");
    }

    @AfterEach
    public void finishedEachTests() {
        System.out.println("Тест пройден");
    }


    @Test
    public void testRotation90() {
        //arrange
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{3, 1}, {4, 2}};

        //act
        int[][] result = Main.rotation90(a);

        //assert
        assertArrayEquals(result, b);

    }

    @Test
    public void testDivideMatrix() {
        //arrange
        int[][] a = {{2, 4}, {6, 8}};
        int x = 0;

        //assert
        assertDoesNotThrow(() -> Main.divideMatrix(a, x));

    }

    @Test
    public void testEqualsMatrix() {
        //arrange
        int[][] a = {{2, 4}, {6, 8}};
        int[][] b = {{2, 4}, {6, 8}};

        //assert
        assertTrue(Main.equalsMatrix(a, b));
    }


}