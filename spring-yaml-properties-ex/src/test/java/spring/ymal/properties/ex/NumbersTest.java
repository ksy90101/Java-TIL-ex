package spring.ymal.properties.ex;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumbersTest {

    @Autowired
    private Numbers numbers;

    @DisplayName("POJO ConfigurationProperties Test")
    @Test
    void pojoConfigurationPropertiesTest() {
        final List<Number> numberList = this.numbers.getNumbers();

        assertThat(numberList).hasSize(3);
        assertThat(numberList.get(0).getName()).isEqualTo("one");
        assertThat(numberList.get(0).getValue()).isEqualTo(1);
    }
}
