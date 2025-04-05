package csv_data_handling.intermediate_problems.sort_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SortCSV {

    public static void main(String[] args) throws Exception {

    String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\employees.csv";
    try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
    {
       String line;
        List<Employee> list = new ArrayList<>();
        reader.readLine();
        while ((line = reader.readLine()) != null){
            String[] columns = line.split(",");
            list.add(new Employee(columns[0], columns[1], columns[2], Integer.parseInt(columns[3])));
        }
        list.sort((a,b) -> b.salary- a.salary);
        int i=0;
        while(i<5 && i<list.size()){
            System.out.println("ID: " + list.get(i).id + ", Name: " + list.get(i).name + ", Department: " + list.get(i).department + ", Salary: " + list.get(i).salary);
            i++;
        }
    }
}
}
