//package org.example;
//import FactorialCalculator;
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TestingFactorial {
//
//        @DisplayName("Проверка 0!")
//        @Test
//        void testFactorialZero() {
//            assertEquals(1, Factorial.factorial(0));
//            System.out.println("Проверка 0!");
//        }
//
//        @DisplayName("Проверка 3!")
//        @Test
//        void testFactorialPositive() {
//            assertEquals(6, Factorial.factorial(3));
//            System.out.println("Проверка 3!");
//        }
//
//        @DisplayName("Проверка на неотрицательный аргумент")
//        @Test
//        void testFactorialNegative() {
//            Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
//            System.out.println("Проверка на неотрицательный аргумент");
//        }
//    }
//
