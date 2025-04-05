package csv_data_handling.advance_problems.csv_from_database;

import java.io.*;

public class CSVFromDatabase {
    public static void main(String[] args) {
        String employeesPath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\advance_problems\\csv_from_database\\employee";
        String csvEmployeesPath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\advance_problems\\csv_from_database\\employee.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(employeesPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvEmployeesPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] columns = line.split(",");
                writer.write(columns[0]+","+columns[1]+","+columns[2]+","+columns[3] + "\n");
            }
            System.out.println("new csv file updated successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
