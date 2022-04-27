package tif.java.bootcamp.streams.service;

import tif.java.bootcamp.streams.entity.Employee;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface EmployeeService {

    public void addEmployee(Employee empObj);

    public Employee readEmployeeById(int empID);

    public List<Employee> filterFuncOnEmployeeList(Predicate predicate);


    public Stream<?> mapFuncOnEmployeeList(List<Employee> employeeList, Function<Employee,?> employeeObjectFunction);

    public Map<Employee, Integer> getEmployeeAgesByDateOfBirth();

    public OptionalDouble averageAgeOfAllEmployees(Map<Employee,Integer> empWithAge);

    public void printEmployees(Integer printLimit);

    public List<Employee> getListOfEmployee();

}
