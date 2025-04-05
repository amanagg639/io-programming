package csv_data_handling.intermediate_problems.modify_csv;

import java.io.*;

public class ModifyCSV {
    public static void main(String[] args) throws Exception{
        String employeesPath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\intermediate_problems\\modify_csv\\employee.csv";
        String updatedEmployeesPath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\intermediate_problems\\modify_csv\\new_employee.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(employeesPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(updatedEmployeesPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] columns = line.split(",");
                if(columns[2].equals("IT")){
                    int s = Integer.parseInt(columns[3]);
                    int updatedSalary = s/10 + s;
                    columns[3] = Integer.toString(updatedSalary);
                }
                writer.write(columns[0]+","+columns[1]+","+columns[2]+","+columns[3] + "\n");
            }
            System.out.println("new csv file updated successfully");
        }
        catch (IOException e){
           e.printStackTrace();
        }
    }
}
