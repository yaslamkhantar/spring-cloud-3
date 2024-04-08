package me.elmoukhantar.customerservie;

import me.elmoukhantar.customerservie.entities.Customer;
import me.elmoukhantar.customerservie.repository.Customerrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServieApplication.class, args);
    }
    @Bean
    CommandLineRunner start(Customerrepository customerrepository){
        return args->{
            customerrepository.save(new Customer(null,"yassine","elmoukhantar","yassine.rwx@gmail.com"));
            customerrepository.save(new Customer(null,"soukaina","fraules","soukaina@gmail.com"));
            customerrepository.save(new Customer(null,"hajar","hachim","hajar@gmail.com"));
            customerrepository.save(new Customer(null,"souad","bahij","bahij.rwx@gmail.com"));
        };
    }

}
