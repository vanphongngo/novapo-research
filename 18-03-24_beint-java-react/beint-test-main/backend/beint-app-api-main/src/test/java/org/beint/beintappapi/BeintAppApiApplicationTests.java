package org.beint.beintappapi;

import org.beint.beintappapi.utils.RegexUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeintAppApiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetStringRegex() {
        String num = RegexUtils.getString(
                "http-nio-8080-exec-90",
                "\\d+$"
        );
    }

}
