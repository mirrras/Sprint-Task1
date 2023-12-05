import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> number = new ArrayList<>();
//        int n = in.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            number.add(in.nextInt());
//        }
//        number.stream().filter(s -> s%2==0).forEach(s -> System.out.print(s + " "));
//        System.out.println();
//        number.stream().filter(s -> s>0).forEach(s -> System.out.print(s + " "));
//        System.out.println();
//        int sum = number.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//
//        int max = number.stream().reduce(Integer.MIN_VALUE,Integer::max);
//        System.out.println(max);


        Employee employee1 = new Employee("John", "Aikenov", 25, 747588.0);
        Employee employee2 = new Employee("Jane", "Doe", 27, 95874);
        Employee employee3 = new Employee("Bob", "Smith", 30, 70000.0);
        Employee employee4 = new Employee("Alice", "Johnson", 22, 45000.0);
        Employee employee5 = new Employee("Peter", "Lee", 55, 985000);
        Employee employee6 = new Employee("Sarah", "Garcia", 40, 90000.0);
        Employee employee7 = new Employee("Tom", "Amirov", 50, 745874);
        Employee employee8 = new Employee("Mike", "Wilson", 45, 74580);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);

        System.out.println(EmployeeStream.findMaximumSalaryOfEmployeesOlderThan50(employeeList));
    }
}