package tif.java.bootcamp.streams.service.impl;


import tif.java.bootcamp.streams.entity.Employee;
import tif.java.bootcamp.streams.service.EmployeeService;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee empObj) {
        employeeList.add(empObj);
    }

    @Override
    public Employee readEmployeeById(int empID) {
        Predicate<Employee> verifyEmpId = empObj -> empObj.getEmpID() == empID;
        return filterFuncOnEmployeeList(verifyEmpId).get(0);
    }

    @Override
    public List<Employee> filterFuncOnEmployeeList(Predicate predicate) {
        return (List<Employee>) employeeList.stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public Stream<?> mapFuncOnEmployeeList(List<Employee> employeeList, Function<Employee, ?> employeeObjectFunction) {
        return employeeList.stream().map(employeeObjectFunction);
    }

    @Override
    public Map<Employee, Integer> getEmployeeAgesByDateOfBirth() {
        Function<Employee, Integer> getAgeFromDOB = emp -> LocalDate.now().getYear() - emp.getEmpDateOfBirth().getYear();
        return employeeList
                .stream()
                .collect(Collectors.toMap(emp -> emp, getAgeFromDOB));
    }

    @Override
    public OptionalDouble averageAgeOfAllEmployees(Map<Employee, Integer> empWithAge) {
        return empWithAge
                .values()
                .stream()
                .mapToInt(Integer::valueOf).average();
    }

    @Override
    public void printEmployees(Integer printLimit) {
        employeeList
                .stream()
                .limit(printLimit)
                .forEach(System.out::println);
    }

    public List<Employee> getListOfEmployee() {

        employeeList.addAll(Arrays.asList(
                new Employee(1010, "Ashish", "Tiwari", 'M', LocalDate.of(1991, 1, 11), LocalDate.of(2015, 4, 7), 50000, 6, "VP"),
                new Employee(1020, "Neha", "Mishra", 'F', LocalDate.of(1993, 7, 1), LocalDate.of(2020, 5, 15), 60000, 3, "Sr.Assoc"),
                new Employee(1021, "Lalit", "Chowdhary", 'M', LocalDate.of(1991, 9, 27), LocalDate.of(2019, 6, 17), 70000, 4, "Sr.Assoc"),
                new Employee(1023, "Urvish", "Bhatti", 'M', LocalDate.of(1992, 10, 8), LocalDate.of(2019, 6, 18), 50000, 3, "Assoc"),
                new Employee(1022, "Nayan", "Chouhan", 'M', LocalDate.of(1993, 8, 17), LocalDate.of(20018, 9, 11), 70000, 4, "VP"),
                new Employee(1025, "Satyapal", "Chouhan", 'M', LocalDate.of(1990, 8, 20), LocalDate.of(2019, 4, 13), 60000, 4, "Sr.Assoc"),
                new Employee(1024, "Vinod", "Badwal", 'M', LocalDate.of(1993, 7, 1), LocalDate.of(2016, 4, 12), 90000, 6, "VP"),
                new Employee(1027, "Rehsma", "Nahak", 'M', LocalDate.of(1995, 1, 3), LocalDate.of(2020, 4, 11), 60000, 6, "VP"),
                new Employee(1028, "Swapnali", "Parab", 'M', LocalDate.of(1995, 8, 11), LocalDate.of(2020, 4, 11), 60000, 3, "Assoc"),
                new Employee(1029, "Olympia", "D'Souza", 'M', LocalDate.of(1980, 7, 21), LocalDate.of(2020, 4, 11), 60000, 10, "Sr.VP"),
                new Employee(1026, "Vivek", "Mahamiya", 'M', LocalDate.of(1992, 7, 31), LocalDate.of(2020, 4, 11), 60000, 5, "Sr.Assoc"),
                new Employee(1030, "Shubhada", "Mulay", 'M', LocalDate.of(1992, 7, 11), LocalDate.of(2020, 4, 11), 60000, 4, "Assoc")
        ));
        return employeeList;
    }
}
