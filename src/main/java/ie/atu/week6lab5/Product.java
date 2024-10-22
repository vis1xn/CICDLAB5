package ie.atu.week6lab5;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @PositiveOrZero(message = "Must have an id")
    private int id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @PositiveOrZero(message = "Must have a price")
    private double price;
}
