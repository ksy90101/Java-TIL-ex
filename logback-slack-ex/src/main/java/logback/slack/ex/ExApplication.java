package logback.slack.ex;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ExApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExApplication.class, args);
        log.error("테스트");
    }

}
