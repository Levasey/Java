package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task12_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите наименование отдела");
        String dep_name = s.nextLine();
        Department a = dep_id(dep_name);
        Employee c = data(dep_name);
        if (a == null) {
            System.out.println("Отдел с наименованием " + dep_name + " не найден");
        } else {
            System.out.println("Код отдела " + a.department_name + " равен " + a.department_id);
        }
        if (c == null) {
            System.out.println("В данном отделе отсутвуют сотрудники");
        } else {
            System.out.println("Имя: " + c.first_name);
            System.out.println("фамилия: " + c.last_name);
            System.out.println("Телефонный номер: " + c.phone_number);
        }
    }

    public static Department dep_id(String dep_name) {
        File file1 = new File("./Task/files/task8665/departments.csv");
        Scanner departmentsReader;
        try {
            departmentsReader = new Scanner(file1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Department a = new Department();

        while (departmentsReader.hasNextLine()) {
            String str = departmentsReader.nextLine();
            String[] arr_dep = str.split(",");
            String department_name = arr_dep[1];
            if (dep_name.equals(department_name)) {
                a.department_id = arr_dep[0];
                a.department_name = arr_dep[1];
                departmentsReader.close();
                return a;
            }
        }
        departmentsReader.close();
        return null;
    }

    public static Employee data(String dep_name) {
        File file = new File("./Task/files/task6170/employees.csv");
        File file1 = new File("./Task/files/task8665/departments.csv");
        Scanner EmployeeReader;
        Scanner departmentsReader;
        try {
            departmentsReader = new Scanner(file1);
            EmployeeReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Employee c = new Employee();

        while (departmentsReader.hasNextLine()) {
            String str = departmentsReader.nextLine();
            String[] arr_dep = str.split(",");
            int departments_id = Integer.parseInt(arr_dep[0]);
            String department_name = arr_dep[1];
            if (dep_name.equals(department_name)) {
                while (EmployeeReader.hasNextLine()) {
                    String value = EmployeeReader.nextLine();
                    String[] arr = value.split(",");
                    int deps_id = 0;
                    try {
                        deps_id = Integer.parseInt(arr[10]);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                    if (departments_id == deps_id) {
                        c.first_name = arr[1];
                        c.last_name = arr[2];
                        c.phone_number = arr[4];
                        EmployeeReader.close();
                        departmentsReader.close();
                        return c;
                    }
                }
            }
        }
        EmployeeReader.close();
        departmentsReader.close();
        return null;
    }
}