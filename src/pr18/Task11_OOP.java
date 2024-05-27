package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11_OOP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id = 0;
        while (true) {
            try {
                System.out.println("Введите код сотрудника");
                id = Integer.parseInt(s.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введи число");
            }
        }

        Employee c = find_by_id(id);
        Department a = dep_id(id);

        if (c == null) {
            System.out.println("Сотрудник с кодом " + id + " не найден");
        } else if (a == null) {
            System.out.println("Имя: " + c.first_name);
            System.out.println("фамилия: " + c.last_name);
            System.out.println("Отдел: с кодом " + c.department_id + " не найден");
        } else {
            System.out.println("Имя: " + c.first_name);
            System.out.println("фамилия: " + c.last_name);
            System.out.println("Отдел: " + a.department_name);
        }
    }

    public static Employee find_by_id(int id) {
        String path = "./Task/files/task6170/employees.csv";
        File file = new File(path);
        try {
            Scanner EmployeeReader = new Scanner(file);
            Employee c = new Employee();
            while (EmployeeReader.hasNext()) {
                String value = EmployeeReader.nextLine();
                String[] arr = value.split(",");
                int employee_id = Integer.parseInt(arr[0]);
                if (id == employee_id) {
                    c.first_name = arr[1];
                    c.last_name = arr[2];
                    c.department_id = arr[10];
                    EmployeeReader.close();
                    return c;
                }
            }
            EmployeeReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Department dep_id(int id) {
        String path = "./Task/files/task6170/employees.csv";
        String path1 = "./Task/files/task6170/departments.csv";
        File file = new File(path);
        File file1 = new File(path1);
        try {
            Scanner departmentsReader = new Scanner(file1);
            Scanner EmployeeReader = new Scanner(file);
            Department a = new Department();
            while (EmployeeReader.hasNext()) {
                String value = EmployeeReader.nextLine();
                String[] arr = value.split(",");
                int employee_id = Integer.parseInt(arr[0]);
                int deps_id = 0;
                try {
                    deps_id = Integer.parseInt(arr[10]);
                } catch (NumberFormatException e) {

                }
                if (id == employee_id) {
                    while (departmentsReader.hasNextLine()) {
                        String str = departmentsReader.nextLine();
                        String[] arr_dep = str.split(",");
                        int departments_id = Integer.parseInt(arr_dep[0]);
                        if (deps_id == departments_id) {
                            a.department_name = arr_dep[1];
                            departmentsReader.close();
                            EmployeeReader.close();
                            return a;
                        }
                    }
                }
            }
            EmployeeReader.close();
            departmentsReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}