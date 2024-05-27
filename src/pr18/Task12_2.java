package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Task12_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите наименование отдела");
        String dep_name = s.nextLine();
        dep_name = "'" + dep_name + "'";
        Department a = dep_id(dep_name);
        ArrayList<Employee> employees = data(a.department_id);
        if (a == null) {
            System.out.println("Отдел с наименованием " + dep_name + " не найден");
        } else {
            System.out.println("Код отдела " + a.department_name + " равен " + a.department_id);
        }
        if (employees.size() == 0) {
            System.out.println("В данном отделе отсутвуют сотрудники");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                Employee c = employees.get(i);
                System.out.println((i + 1) + " Имя: " + c.first_name);
                System.out.println("фамилия: " + c.last_name);
                System.out.println("Телефонный номер: " + c.phone_number);
            }
        }
    }

    public static Department dep_id(String dep_name) {
        File file1 = new File("./Task/files/task8665/departments.csv");
        try {
            Scanner departmentsReader = new Scanner(file1);
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static ArrayList<Employee> data(String department_id) {
        File file = new File("./Task/files/task6170/employees.csv");
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            Scanner EmployeeReader = new Scanner(file);
            Employee c = new Employee();
            while (EmployeeReader.hasNextLine()) {
                String value = EmployeeReader.nextLine();
                String[] arr = value.split(",");
                String deps_id = arr[10];

                if (department_id.equals(deps_id)) {
                    c.first_name = arr[1];
                    c.last_name = arr[2];
                    c.phone_number = arr[4];
                    employees.add(c);


                }
            }
            EmployeeReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return employees;
    }
}