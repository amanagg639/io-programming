package csv_data_handling.advance_problems.csv_to_objects;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class CSVToObjects {
    public static void main(String[] args) {
        String filePath = "D:\\bridgelabz-workspace\\io-programming\\src\\main\\java\\csv_data_handling\\advance_problems\\csv_to_objects\\employees.csv";
        try {
            FileReader reader = new FileReader(filePath);
            CsvToBean<Employee> csvToBean = new CsvToBeanBuilder<Employee>(reader)
                    .withType(Employee.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Employee> employees = csvToBean.parse();
            for(Employee emp : employees){
                System.out.println(emp.getName() + " works in " + emp.getDepartment());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
