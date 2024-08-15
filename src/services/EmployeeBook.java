package services;

import model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employeesMap;

    public EmployeeBook() {
        employeesMap = new HashMap<>();
        initializeEmployees();
    }

    private void initializeEmployees() {
        Employee[] employees = {
                new Employee("Павел", "Александрович", "Никитин", 1, 22400),
                new Employee("Евгений", "Юрьевич", "Романов", 2, 44700),
                new Employee("Кирилл", "Федорович", "Донцов", 3, 78250),
                new Employee("Николай", "Васильевич", "Нелюбов", 4, 45780),
                new Employee("Денис", "Сергеевич", "Прищепа", 5, 68900),
                new Employee("Иван", "Юрьевич", "Пяткин", 1, 98200),
                new Employee("Илья", "Сергеевич", "Сафронов", 2, 75600),
                new Employee("Милана", "Юрьевна", "Елисеева", 3, 98700),
                new Employee("Алевтина", "Ивановна", "Пестерева", 4, 99900)
        };

        for (Employee employee : employees) {
            addEmployee(employee);
        }
    }

    public void addEmployee(Employee employee) {
        employeesMap.put(employee.getFirstName() + employee.getMiddleName() + employee.getLastName(), employee);
    }

    public Employee getEmployeeById(int id) {
        return employeesMap.values().stream()
                .filter(employee -> employee.getId() == id)
                .findFirst().orElse(null);
    }

    public void removeEmployee(int id) {
        employeesMap.values().removeIf(employee -> employee.getId() == id);
    }
}

