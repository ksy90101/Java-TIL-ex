package jojoldu.aop.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import jojoldu.aop.ex.aop.Performance;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableJpaAuditing
public class AopApplication {
	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public Performance performance() {
		return new Performance();
	}
}

