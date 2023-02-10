package ru.clevertec.gradle_lesson.util;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(s -> StringUtils.isPositiveNumber(s));
    }
}
