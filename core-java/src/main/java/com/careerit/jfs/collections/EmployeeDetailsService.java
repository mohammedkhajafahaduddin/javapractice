package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsService {

    List<EmployeeDetails> list = new ArrayList<>();

    public EmployeeDetailsService(String data) {
        String[] employeeData = data.split(",");
        for (String emp : employeeData) {
            String[] empDetails = emp.split("-");
            int id = Integer.parseInt(empDetails[0]);
            String name = empDetails[1];
            String designation = empDetails[2];
            double salary = Double.parseDouble(empDetails[3]);
            list.add(new EmployeeDetails(id, name, designation, salary));
        }
    }




    public double totalSalary() {
        double total = 0;
        for (EmployeeDetails employee : list) {
            total += employee.salary();
        }
        return total;
    }

    public double maxSalary() {
        double max = 0;
        for (EmployeeDetails employee : list) {
            max = Math.max(max, employee.salary());
        }
        return max;
    }

    public List<String> employeeNames() {
        List<String> names = new ArrayList<>();
        for (EmployeeDetails employee : list) {
            if (!names.contains(employee.name())) {
                names.add(employee.name());
            }
        }
        return names;
    }

    public List<Integer> employeeIds() {
        List<Integer> ids = new ArrayList<>();
        for (EmployeeDetails employee : list) {
            ids.add(employee.id());
        }
        return ids;
    }

    public List<EmployeeBasicDetails> employeeDetails() {
        List<EmployeeBasicDetails> basicDetails = new ArrayList<>();
        for(EmployeeDetails emp : list){
            basicDetails.add(new EmployeeBasicDetails(emp.id(), emp.name()));
        }
        return basicDetails;
    }

}
