package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {
    @Test
    void testAdd() {
        assertEquals(5, MathUtil.add(2, 3));
    }
}
