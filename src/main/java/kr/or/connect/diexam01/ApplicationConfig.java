package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Configuration이 있어야 이 클래스가 Config파일인지 알 수 있다.
public class ApplicationConfig {
	@Bean
	// Bean 등록
	public Car car(Engine e) {
		Car c = new Car();
		c.setEngine(e);
		return c;
	}
	
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}
