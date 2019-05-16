package java8;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Geeta", 28, 60000));
        emp.add(new Employee("Kumari", 29, 50000));
        emp.add(new Employee("Seeta", 27, 40000));
        emp.add(new Employee("Sumar", 30, 70000));

        //emp.stream().sorted((e,e1) -> e.age - e1.age).forEach(System.out::println);
        emp.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        //System.out.println(args[0]);
        //Collections.sort(emp);

        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM":"puchu";
        System.out.println(amPm);
        //System.out.println("Output is: " + 10 != 5);

    }

}



class Employee {
    String name;
    int age;
    double salary;

    public Employee() {}

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
