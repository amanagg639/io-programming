package csv_data_handling.basic_problems.read_and_count;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount{
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\basic_problems\\read_csv\\read_employees.csv";
         try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
             String line;
             int cnt = 0;
             while ((line = br.readLine()) != null){
                 cnt++;
                 String[] columns = line.split(",");
                 System.out.println("ID: " + columns[0] + ", Name: " + columns[1]);
             }
             System.out.println("No of rows: " + --cnt);
         } catch (IOException e){
             e.printStackTrace();
         }
    }
}
