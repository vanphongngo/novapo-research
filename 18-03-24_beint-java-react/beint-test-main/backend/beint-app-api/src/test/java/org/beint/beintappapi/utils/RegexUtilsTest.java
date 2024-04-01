package org.beint.beintappapi.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RegexUtilsTest {
    @Test
    public void testGetStringRegex() {
        String num = RegexUtils.getString(
                "http-nio-8080-exec-90",
                "\\d+$"
        );



    }
}