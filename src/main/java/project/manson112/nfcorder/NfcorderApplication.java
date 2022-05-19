package project.manson112.nfcorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NfcorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NfcorderApplication.class, args);
	}

}
