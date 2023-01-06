package Inheritnce;

public class Employee extends Company {
    String empName;
    String empId;
    String empPosition;
    float empSal;

    public Employee(String empName, String empId, String empPosition, float empSal, String companyName,
            String companyId, String companyPlace, int CompanyStartYear) {
        this.empName = empName;
        this.empId = empId;
        this.empPosition = empPosition;
        this.empSal = empSal;
        this.companyName = companyName;
        this.companyId = companyId;
        this.companyPlace = companyPlace;
        this.CompanyStartYear = CompanyStartYear;
    }

    public void showEmplyeeDetils() {
        System.out.println(this.empName);
        System.out.println(this.empPosition);
        System.out.println(this.empId);
        System.out.println(this.empSal);
        // Employee obj1 = new Employee("empName", "empId", "empPosition", 100000);
    }

    public static void main(String args[]) {
        Employee obj1 = new Employee("sharath", "ax134", "software eng", 100000, "Axis", "Axis1997", "delhi", 1997);
        obj1.showEmplyeeDetils();
        obj1.showCompanyDetails();
    }

}
