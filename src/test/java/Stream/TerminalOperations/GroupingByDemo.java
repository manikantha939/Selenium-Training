package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class GroupingByDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", "HR", 3000),
				new Employee("Bob", "IT", 4500),
				new Employee("Charlie", "HR", 3500),
				new Employee("Dave", "IT", 4500),
				new Employee("Eve", "Finance", 3000)
		);

        //group employees by department
        Map<String, List<Employee>> employeesBydepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employees);

        System.out.println("-------------------------------------------------------------");

        //group employees by salary
        Map<Integer, List<Employee>> employeesBySalary = employees.stream()
                .collect(Collectors.groupingBy(Employee -> Employee.getSalary()));
        System.out.println(employeesBySalary);

        System.out.println("-------------------------------------------------------------");

        Map<Boolean, List<Employee>> partionedBySalary = employees.stream()
                .collect(Collectors.partitioningBy(Employee -> Employee.getSalary() > 4000));
        System.out.println("Employee with salry >4000");
        partionedBySalary.get(true).forEach(System.out::println);

        System.out.println("Employee with salry <4000");
        partionedBySalary.get(false).forEach(System.out::println);
        //Print the grouped employees

//        employeesBydepartment.forEach((department, employeesList) -> {
//            System.out.println("Department: "+department);
//            employeesList.forEach(System.out::println);
//        } );

        employeesBySalary.forEach((salary, employeesList)->{
            System.out.println("salary: "+ salary);
            employeesList.forEach(System.out::println);
        });
    }
}
