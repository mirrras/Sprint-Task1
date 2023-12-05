import java.util.List;

public class EmployeeStream {
    static void printUniqueLastNames(List<Employee> employees){
        employees.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);
    }
    static double calculateAverageSalaryOfEmployeesYoungerThan30( List<Employee> employees){
        double average = employees.stream().filter(s->s.getAge()<30).mapToDouble(Employee::getSalary).average().orElseThrow();
        return average;
    }
    static double findMaximumSalaryOfEmployeesOlderThan50( List<Employee> employees){
        double max = employees.stream().filter(s -> s.getAge() > 50).mapToDouble(Employee::getSalary).max().orElseThrow();
        return max;
    }
}
