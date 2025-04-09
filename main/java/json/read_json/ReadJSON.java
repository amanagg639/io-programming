package json.read_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;

public class ReadJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            User user = objectMapper.readValue(new File("D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\json\\read_json\\user.json"), User.class);
            System.out.println("User Name: " + user.getName());
            System.out.println("User Email: " + user.getEmail());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
