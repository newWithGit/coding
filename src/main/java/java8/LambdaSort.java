package java8;

import Test.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSort {

    private static void testSort() {
        Employee employee = new Employee("Saurav", "Kumar", 1234, 10000);
        Employee employee1 = new Employee("Saurav", "Kumar", 1234, 20000);
        Employee employee2 = new Employee("Saurav", "Kumar", 1234, 30000);
        Employee employee3 = new Employee("Saurav", "Kumar", 1234, 40000);
        Employee employee4 = new Employee("Saurav", "Kumar", 1234, 50000);
        Employee employee5 = new Employee("Saurav", "Kumar", 1234, 60000);
        Employee employee6 = new Employee("Saurav", "Kumar", 1234, 70000);
        Employee employee7 = new Employee("Saurav", "Kumar", 1234, 80000);

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee, employee7, employee2, employee3,
                employee4, employee5, employee6, employee1));

        //Comparator<Employee> comparator = (e1, e2) -> e1.getSalary() - e2.getSalary();
        Comparator<Employee> comparator = Comparator.comparingInt(Employee::getSalary);

        List<Employee> employeeList = employees.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(employeeList);
    }

    public static void main(String[] args) {
        testSort();
    }
}
