public class Employee extends Person {
    
    int salary;

    Employee(String first, String last, int salary) {
        // Think of super() as Person() constructor
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
