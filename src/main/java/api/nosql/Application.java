package api.nosql;

import com.oracle.nosql.spring.data.repository.config.EnableNosqlRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableNosqlRepositories
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
