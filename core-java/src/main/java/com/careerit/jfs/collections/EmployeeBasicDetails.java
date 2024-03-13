package com.careerit.jfs.collections;

public record EmployeeBasicDetails(int empno, String name) {

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + empno +
                ", name='" + name + '\'' +
                '}';
    }
}
