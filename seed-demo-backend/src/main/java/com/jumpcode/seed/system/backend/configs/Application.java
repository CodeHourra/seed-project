package com.jumpcode.seed.system.backend.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author jumpcode
 * 启动类
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jumpcode.seed.system")
@EntityScan(basePackages = {"com.jumpcode.seed.system"})
@ComponentScan({"com.jumpcode.seed.system.*"})
public class Application {
		
		public static void main(String[] args) {
				SpringApplication.run(Application.class, args);
		}
		
}
