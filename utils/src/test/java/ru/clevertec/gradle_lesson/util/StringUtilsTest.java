package ru.clevertec.gradle_lesson.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @ParameterizedTest
    @CsvSource(value = {"10", "6.44", "21459075"})
    public void testIsPositiveNumber(String str) {
        assertTrue(StringUtils.isPositiveNumber(str), "Input value " + str + " is not positive");
    }
}
