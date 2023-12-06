package ma.esnet.inventoryservice;

import ma.esnet.inventoryservice.entities.Product;
import ma.esnet.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .price(12000.0)
                    .name("Lenovo Pc")
                    .quantity(3)
                    .build());
            productRepository.save(Product.builder()
                    .price(22000.0)
                    .name("MacBook Pro")
                    .quantity(23)
                    .build());
            productRepository.save(Product.builder()
                    .price(10000.0)
                    .name("IPhone 16Pro")
                    .quantity(1)
                    .build());
            productRepository.save(Product.builder()
                    .price(2000.0)
                    .name("Printer Dell")
                    .quantity(5)
                    .build());
        };

    }

}
