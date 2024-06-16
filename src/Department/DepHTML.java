package Department;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//import com.opencsv.CSVReader;

public class DepHTML {
    public static void main(String[] args) {
        File department = new File("department.html");
        try {
            PrintWriter printWriter = new PrintWriter(department);
            printWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Департаменты </h1>\n" +
                    "\n" +
                    "<ol>\n");
            ArrayList<Department> deps = depData();
            ArrayList<Employee> emps = empData();
            for (int i = 0; i < deps.size(); i++) {
                Department dep = deps.get(i);
                printWriter.write("<li>" + " " + dep.getDepartment_name() + "</li>\n");
                printWriter.write("<ol>\n");
                for (int j = 0; j < emps.size(); j++) {
                    Employee emp = emps.get(j);
                    if (dep.getDepartment_id().equals(emp.department_id)) {
                        printWriter.write("<li>" + " " + emp.first_name + emp.last_name + "</li>\n");
                    }
                }
                printWriter.write("</ol>\n");
            }
            printWriter.write("</ol>\n" +
                    "</body>\n" +
                    "</html>");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден " + department.getAbsolutePath());
        }
    }

    public static ArrayList<Department> depData() {
        File file1 = new File("./Task/files/task8665/departments.csv");
        ArrayList<Department> deps = new ArrayList<>();
        try {
            Scanner departmentsReader = new Scanner(file1);
            while (departmentsReader.hasNextLine()) {
                Department dep = new Department();
                String str = departmentsReader.nextLine();
                String[] arr_dep = str.split(",");
                dep.setDepartment_id(arr_dep[0]);
                dep.setDepartment_name(arr_dep[1]);
                dep.setManager_id(arr_dep[2]);
                dep.setLocation_id(arr_dep[3]);
                deps.add(dep);
            }
            departmentsReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return deps;
    }

    public static ArrayList<Employee> empData() {
        File file = new File("./Task/files/task6170/employees.csv");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            Scanner EmployeeReader = new Scanner(file);

            while (EmployeeReader.hasNextLine()) {
                Employee emp = new Employee();
                String value = EmployeeReader.nextLine();
                String[] arr = value.split(",");
                emp.first_name = arr[1];
                emp.last_name = arr[2];
                emp.phone_number = arr[4];
                emp.department_id = arr[10];
                employees.add(emp);
            }
            EmployeeReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    /*public void DepReader(){
        CSVReader reader = new CSVReader(new FileReader("./Task/files/task8665/departments.csv"), ',');

        List<Department> deps = new ArrayList<>();

        List<String[]> records = reader.readAll();

        Iterator<String[]> iterator = records.iterator();

        while (iterator.hasNext()) {
            String[] record = iterator.next();
            Department dep = new Department();
            dep.setDepartment_id(record[0]);
            dep.setDepartment_name(record[1]);
            dep.setManager_id(record[2]);
            dep.setLocation_id(record[3]);
            deps.add(dep);
        }
    }*/
}
