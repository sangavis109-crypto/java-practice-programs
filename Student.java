class Student {
    int id = 101;
    String name = "Sangavi";

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
