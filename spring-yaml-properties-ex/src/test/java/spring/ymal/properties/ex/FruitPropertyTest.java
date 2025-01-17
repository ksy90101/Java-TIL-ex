package spring.ymal.properties.ex;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FruitPropertyTest {

    @Autowired
    private FruitProperty fruitProperty;

    @DisplayName("Property ConfigurationProperty Test")
    @Test
    void configurationPropertyTest() {
        List<Map<String, String>> fruits = fruitProperty.getFruits();

        assertAll(
                () -> assertThat(fruits).hasSize(3),
                () -> assertThat(fruits.get(0).get("name")).isEqualTo("banana"),
                () -> assertThat(fruits.get(0).get("color")).isEqualTo("yellow")
        );
    }
}
