import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car("yellow", "renault");
        try {
            // Java Object to JSON
            // writeValueAsString() of ObjectMapper class generate a JSON from a Java object and return the generated JSON as a string.
            String carAsString = objectMapper.writeValueAsString(car);
            System.out.println(carAsString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        try {
            // JSON to Java Object
            car = objectMapper.readValue(json, Car.class);
            System.out.println(car);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

class Car {
    private String color;
    private String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
