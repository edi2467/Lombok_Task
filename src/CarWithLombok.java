import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}

class CarDemoWithLombok {
    public static void main(String[] args) {

        CarWithLombok CarWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        CarWithLombok CarWithLombok2 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();

        System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());

        CarWithLombok1.setColor("black");
    }
}