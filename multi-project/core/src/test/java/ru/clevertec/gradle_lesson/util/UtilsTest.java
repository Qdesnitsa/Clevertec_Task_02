package ru.clevertec.gradle_lesson.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @ParameterizedTest(name = "All positive numbers")
    @CsvSource(value = {"10", "6.44", "21459075"})
    public void testIsAllPositiveNumbers(String str) {
        assertTrue(StringUtils.isPositiveNumber(str), "Input value " + str + " is not positive");
    }

    @ParameterizedTest(name = "Negative numbers and non-numeric input")
    @CsvSource(value = {"-10", "0", "abcdef"})
    public void testIsNotAllPositiveNumbers(String str) {
        assertFalse(StringUtils.isPositiveNumber(str), "Input value " + str + " is not positive");
    }
}
