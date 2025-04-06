package Lab1Testing;

public class Employee {
    String firstName;
    String lastName;
    int age;

    public Employee(String name,String lastName, int age){
        this.firstName=name;
        this.lastName=lastName;
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
