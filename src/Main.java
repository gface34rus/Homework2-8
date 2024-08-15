import model.Employee;
import services.EmployeeBook;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee retrievedEmployee = employeeBook.getEmployeeById(2);
        if (retrievedEmployee != null) {
            System.out.println("Полученный сотрудник: " + retrievedEmployee);
        }
    }
}