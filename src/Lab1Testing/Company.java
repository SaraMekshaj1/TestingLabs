package Lab1Testing;

import java.util.Arrays;

public class Company {
    String name;
    Employee[] employees=new Employee[5];

    public Company(String name){
        this.name=name;

    }
    public void setEmployees(Employee[] employees) {
        //Simple check added to enforce the fact that a company should have only 5 members (or less)
        int noEmployeesInputted = Math.min(employees.length, 5);

        for (int i = 0; i < noEmployeesInputted; i++) {
            this.employees[i] = employees[i];
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + Arrays.toString(employees) +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAvgAge(){
        int sumAge=0;
        for (Employee employee:this.employees){
            sumAge+=employee.getAge();
        }
        return sumAge/this.employees.length;
    }
}
