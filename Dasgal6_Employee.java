public class Dasgal6_Employee {
    String name;
    int age;
    double salary;
    
    Dasgal6_Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
    
    double calculateAnnualSalary() {
        return salary * 12;
    }
    
    public static void main(String[] args) {
        Dasgal6_Employee emp1 = new Dasgal6_Employee("John Doe", 30, 5000);
        Dasgal6_Employee emp2 = new Dasgal6_Employee("Jane Smith", 28, 5500);
        
        emp1.displayInfo();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());
        
        emp2.displayInfo();
        System.out.println("Annual Salary: " + emp2.calculateAnnualSalary());
    }
}