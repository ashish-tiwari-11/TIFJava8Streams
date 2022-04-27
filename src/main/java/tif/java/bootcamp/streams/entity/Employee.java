package tif.java.bootcamp.streams.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private int empID;
    private String empFirstName;
    private String empLastName;
    private char empGender;
    private LocalDate empDateOfBirth;
    private LocalDate empDateOfJoining;
    private int empSalary;
    private float empExperience;

    private String empDesignation;

    public Employee(int empID, String empFirstName, String empLastName, char empGender, LocalDate empDateOfBirth, LocalDate empDateOfJoining, int empSalary, float empExperience, String empDesignation) {
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empGender = empGender;
        this.empDateOfBirth = empDateOfBirth;
        this.empDateOfJoining = empDateOfJoining;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
        this.empDesignation = empDesignation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public LocalDate getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public void setEmpDateOfBirth(LocalDate empDateOfBirth) {
        this.empDateOfBirth = empDateOfBirth;
    }

    public LocalDate getEmpDateOfJoining() {
        return empDateOfJoining;
    }

    public void setEmpDateOfJoining(LocalDate empDateOfJoining) {
        this.empDateOfJoining = empDateOfJoining;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public float getEmpExperience() {
        return empExperience;
    }

    public void setEmpExperience(float empExperience) {
        this.empExperience = empExperience;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpGender() == employee.getEmpGender() && getEmpSalary() == employee.getEmpSalary() && Float.compare(employee.getEmpExperience(), getEmpExperience()) == 0 && getEmpFirstName().equals(employee.getEmpFirstName()) && getEmpLastName().equals(employee.getEmpLastName()) && getEmpDateOfBirth().equals(employee.getEmpDateOfBirth()) && getEmpDateOfJoining().equals(employee.getEmpDateOfJoining()) && getEmpDesignation().equals(employee.getEmpDesignation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpID(), getEmpFirstName(), getEmpLastName(), getEmpGender(), getEmpDateOfBirth(), getEmpDateOfJoining(), getEmpSalary(), getEmpExperience(), getEmpDesignation());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empGender=" + empGender +
                ", empDateOfBirth=" + empDateOfBirth +
                ", empDateOfJoining=" + empDateOfJoining +
                ", empSalary=" + empSalary +
                ", empExperience=" + empExperience +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}
