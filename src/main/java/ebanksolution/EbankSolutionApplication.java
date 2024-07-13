package ebanksolution;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.PasswordAuthentication;

@SpringBootApplication
public class EbankSolutionApplication {

    public static void main(String[] args) {

        SpringApplication.run(EbankSolutionApplication.class, args);

//        StreamService sreamService = new StreamService();
//        System.out.println(sreamService.SommeCompte(2,100));

    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
}
