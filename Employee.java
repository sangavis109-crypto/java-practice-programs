class Employee {
    int empId = 1001;
    String empName = "Arun";

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}
