package json.object_to_json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("creta", "black", "2024");
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
