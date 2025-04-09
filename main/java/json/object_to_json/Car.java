package json.object_to_json;

public class Car {
    private String brandName;
    private String color;
    private String model;


    public Car() {
    }

    public Car(String brandName, String color, String model) {
        this.brandName = brandName;
        this.color = color;
        this.model = model;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
