import java.util.Random;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Список сотрудников:");
        fillEmployees();
        printFullInfo();
        System.out.println(" ");
        System.out.println("Сумма всей зар.платы сотрудников: " + totalSalaries());
        System.out.println(" ");
        System.out.println("Сотрудник с минимальной зар.платой: " + findEmployeeWithMinSalary());
        System.out.println(" ");
        System.out.println("Сотрудник с максимальной зар.платой: " + findEmployeeWithMaxSalary());
        System.out.println(" ");
        System.out.println("Средняя зар.плата всех сотрудников: " + findAverageSalary());
        System.out.println(" ");
        printFullNameInfo();
    }
    private static void fillEmployees() {
        Random random = new Random();
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = new Employee(
                    "Сотрудник " + (i + 1),
                    random.nextInt(6),
                    random.nextInt(100000)
            );

        }
    }
    public static void printFullInfo () {
        for (Employee employee: EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee: EMPLOYEES) {
            sum+=employee.getSalary();
        }
        return sum;
    }
    private static Employee findEmployeeWithMinSalary () {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee employee1: EMPLOYEES) {
            if (employee1.getSalary() < min) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }
    private static Employee findEmployeeWithMaxSalary () {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee employee1: EMPLOYEES) {
            if (employee1.getSalary() > max) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }
    private static double findAverageSalary () {
        return totalSalaries() / EMPLOYEES.length;

    }
    public static void printFullNameInfo () {
        for (Employee employee: EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }





}