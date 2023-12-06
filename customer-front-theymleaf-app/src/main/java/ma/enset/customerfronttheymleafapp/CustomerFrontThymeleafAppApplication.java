package ma.enset.customerfronttheymleafapp;

import ma.enset.customerfronttheymleafapp.entities.Customer;
import ma.enset.customerfronttheymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("SOUFIANE").email("soufianerespect21@gmail.com").build());
            customerRepository.save(Customer.builder().name("MOHAMED").email("med@youssfi.net").build());
            customerRepository.save(Customer.builder().name("HANANE").email("hananehaisouni@gmail.com").build());

        };
    }
}
