package csv_data_handling.intermediate_problems.search_record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\intermediate_problems\\search_record\\employees.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null){
                String[] columns = line.split(",");
                if(columns[1].equals(name)){
                    System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Department: " + columns[2] + ", Salary: " + columns[3]);
                }
            }
        }
    }
}
