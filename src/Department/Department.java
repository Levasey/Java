package Department;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Department {
    private String department_id;
    private String department_name;
    private String manager_id;
    private String location_id;

    public String getDepartment_id() {
        File file1 = new File("./Task/files/task8665/departments.csv");
        try {
            Scanner departmentsReader = new Scanner(file1);
            while (departmentsReader.hasNextLine()) {
                String str = departmentsReader.nextLine();
                String[] arr_dep = str.split(",");
                department_id = arr_dep[0];
                departmentsReader.close();
            }
            departmentsReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return department_id;
    }
}
