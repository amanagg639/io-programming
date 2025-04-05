package csv_data_handling.basic_problems.write_csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\basic_problems\\write_csv\\write_employees.csv";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("ID,Name,Department,Salary\n");
            writer.write("104,Alice Williams,Finance,62000\n");
            writer.write("105,Bob Johnson,Sales,58000\n");
            System.out.println("CSV file written successfully");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
