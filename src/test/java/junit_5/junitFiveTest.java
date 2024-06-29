package junit_5;
import org.junit.jupiter.api.*;
import Factorial.Factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junitFiveTest {

    @DisplayName("Проверка 0!")
    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
        System.out.println("Проверка 0!");
    }

    @DisplayName("Проверка 5!")
    @Test
    void testFactorialPositive() {
        assertEquals(6, Factorial.factorial(3));
        System.out.println("Проверка 3!");
    }

    @DisplayName("Проверка на неотрицательный аргумент")
    @Test
    void testFactorialNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-7));
        System.out.println("Число для рассчета факториала не может быть отрицательным");
    }
}