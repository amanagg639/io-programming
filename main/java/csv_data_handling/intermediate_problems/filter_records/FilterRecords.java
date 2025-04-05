package csv_data_handling.intermediate_problems.filter_records;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\intermediate_problems\\filter_records\\student_record.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] columns = line.split(",");
                if(columns[2].equals("Score"))continue;
                int s = Integer.parseInt(columns[2]);
                if(s>80){
                    System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Score: " + columns[2]);
                }
            }
        }
    }
}
