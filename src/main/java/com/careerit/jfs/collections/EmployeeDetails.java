package com.careerit.jfs.collections;

public class EmployeeDetails {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public EmployeeDetails(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String designation() {
        return designation;
    }

    public double salary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

