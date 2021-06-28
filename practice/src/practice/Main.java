package practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@ComponentScan(value = {"practice.*"})
public class Main {
	
	public static void main(String s[])
	{
		SpringApplication.run(Main.class, s);
	}
}
