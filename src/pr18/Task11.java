package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11 {
    String department_name = " ";

    public static void main(String[] args) {
        String path = "./Task/files/task6170/departments.csv";
        String path1 = "./Task/files/task6170/employees.csv ";
        File file = new File(path);
        File file1 = new File(path1);
        Scanner departmentsReader;
        Scanner employeesReader;
        try {
            departmentsReader = new Scanner(file);
            employeesReader = new Scanner(file1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Task11 key = new Task11();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите код сотрудника.");
        int id = Integer.parseInt(s.nextLine());
        while (employeesReader.hasNext() || departmentsReader.hasNextLine()) {
            String value = employeesReader.nextLine();
            String[] arr = value.split(",");
            int employee_id = Integer.parseInt(arr[0]);
            int department_id = Integer.parseInt(arr[10]);

                String str = departmentsReader.nextLine();
            String[] arr1 = str.split(",");
            int department_id1 = Integer.parseInt(arr1[0]);

            if (department_id == department_id1) {
                key.department_name = arr1[1];
            }
            if (id == employee_id) {
                System.out.println("Имя: " + arr[1]);
                System.out.println("фамилия: " + arr[2]);
                System.out.println("Отдел: " + key.department_name);
            }
        }
        employeesReader.close();
        departmentsReader.close();
    }
}
