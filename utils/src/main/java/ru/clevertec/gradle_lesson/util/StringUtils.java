package ru.clevertec.gradle_lesson.util;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && NumberUtils.toScaledBigDecimal(str).compareTo(BigDecimal.ZERO) > 0;
    }
}
