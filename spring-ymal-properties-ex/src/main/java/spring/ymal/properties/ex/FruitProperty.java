package spring.ymal.properties.ex;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("fruit")
public class FruitProperty {
    private final List<Map<String, String>> fruits;

    public FruitProperty(List<Map<String, String>> fruits) {
        this.fruits = fruits;
    }

    public List<Map<String, String>> getFruits() {
        return fruits;
    }
}
