package csv_data_handling.basic_problems.read_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV{
    public static void main(String[] args) {
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\basic_problems\\read_csv\\read_employees.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                System.out.println("ID: " + columns[0] + ", Name: " + columns[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

