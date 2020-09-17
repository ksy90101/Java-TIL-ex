package logback.profile.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExApplication {

    private final Logger logger = LoggerFactory.getLogger(ExApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ExApplication.class, args);
    }

    @GetMapping()
    public String index(){
        logger.error("hello world");

        return "hello world";
    }
}
