public class Employee extends Person{

    double salary;

    Employee(String first, String last, double salary){
        super(first, last);
        this.salary = salary;
    }
    
    void showSalary(){
        System.out.printf("%s`s salary is $%.2f\n", this.first, this.salary);
    }
   
}
