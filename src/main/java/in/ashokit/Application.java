package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		boolean isSaved=false;
		boolean isUpdated=true;
		String name="ashokit";
		double pric=123.09;
	}

}
