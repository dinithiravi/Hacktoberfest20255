import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;
    double bonus;

    // Constructor
    Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Method to calculate total salary
    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("---------------------------");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();
        input.nextLine(); // consume newline

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Basic Salary: ");
            double salary = input.nextDouble();
            System.out.print("Bonus: ");
            double bonus = input.nextDouble();
            input.nextLine(); // consume newline

            employees[i] = new Employee(name, salary, bonus);
        }

        // Display employee details
        System.out.println("\n===== Employee Salary Details =====");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        input.close();
    }
}
