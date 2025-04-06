package Lab1Testing;

/*
In the last step, please create a test class named CompanyTest.
In the main() method, create 5 instances of Employee type, which
will be a representation of 5 employees working in the company.
Then add them to the table and create an instance of type Company
using one-argument constructor.

Set employees field values using previously created setter.
Next, please display all company data on the standard output
 (hint: toString() methods will be helpful) and average age computed
  by calling getAverageAge() method on Company type instance.


 */
public class CompanyTest {
    public static void main (String[]args){
        Employee e1=new Employee("Sara","Mek", 23);
        Employee e2=new Employee("Lela","Ndr", 25);
        Employee e3=new Employee("Megu","Nar", 24);
        Employee e4=new Employee("Kiara","Flr", 22);
        Employee e5=new Employee("Alba","End", 29);

        Employee []employees=new Employee[10];

        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;

        Company kompani1=new Company("Company 1");
        kompani1.setEmployees(employees);
        System.out.println(kompani1.toString());
        int a=kompani1.getAvgAge();
        System.out.println(a);







    }

}
