package meng.liang.spring.hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestControler
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello Spring!";
	}
}
