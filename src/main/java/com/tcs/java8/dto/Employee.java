package com.tcs.java8.dto;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int empId;
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Employee(EmployeeBuider emp)
    {
    this.empId=empId;
    this.empName=empName;
    }
    @Component
    public static class EmployeeBuider{
        private int empId;
        private String empName;

        public EmployeeBuider setEmpId(int empId)
        {
            this.empId=empId;
            return this;
        }
        public EmployeeBuider setEmpName(String empName)
        {
            this.empName=empName;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }

}
