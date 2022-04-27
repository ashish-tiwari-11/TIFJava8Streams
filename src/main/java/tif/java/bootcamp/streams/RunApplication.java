package tif.java.bootcamp.streams;

import tif.java.bootcamp.streams.entity.Employee;
import tif.java.bootcamp.streams.service.EmployeeService;
import tif.java.bootcamp.streams.service.impl.EmployeeServiceImpl;

import java.util.List;

public class RunApplication {

    public static void main(String[] args) {

        EmployeeService employeeService =new EmployeeServiceImpl();

        List<Employee> employees = employeeService.getListOfEmployee();
//        Employee emp = employeeService.readEmployeeById(1021);
//        System.out.println(emp.toString());
//        System.out.println(employeeService.averageAgeOfAllEmployees(employeeService.getEmployeeAgesByDateOfBirth()).getAsDouble());
//
//        employeeService.printEmployees(5);



    }

}
