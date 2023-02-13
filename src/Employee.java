public class Employee {
    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    private static int idCounter = 1;


    //Constructor

    public Employee(String fullName, int department, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    //Setters


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Getters
    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    //ToString

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника- " + fullName + '\'' +
                ", id: " + id +
                ", зар.плата: " + salary +
                ", отдел: " + department;
    }


}
