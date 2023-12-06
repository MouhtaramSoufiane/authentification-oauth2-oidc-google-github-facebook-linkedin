package ma.enset.customerfronttheymleafapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private Long id;
    private String name;
    private Double price;
    private int quantity;
}
