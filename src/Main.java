import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Prius");
        car1.setYear(2006);
        car1.displayInfo();

        BankAccount account = new BankAccount();
        account.setAccountNumber(1234);
        account.setBalance(4000);
        account.setOwnerName("John Smith");
        account.deposit(100);
        account.withdraw(300);
        account.printAccountInfo();

        Circle circle = new Circle();
        circle.setRadius(3.5);
        double square = circle.getCircleArea();
        double length = circle.getCircleLength();
        System.out.println("square: "+square);
        System.out.println("length: "+length);

        Employee emp = new Employee();
        emp.employeeConstructor("John", "engineer", 3500);
        emp.raiseSalary(2.5);
        double newSalary = emp.getSalary();
        System.out.println("new Salary: "+ newSalary);
    }
}