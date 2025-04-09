package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJSON {
    public static void main(String[] args) {
        JSONArray subject = new JSONArray();
        subject.put("Maths");
        subject.put("English");
        subject.put("IT");

        JSONObject user = new JSONObject();
        user.put("name", "Aman");
        user.put("Age", 22);
        user.put("subjects", subject);

        System.out.println(user.toString());
    }
}
