class Employee {
    int id;
    String name;
    double basic;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
}

class PermanentEmployee extends Employee {
    double hra, da;

    PermanentEmployee(int id, String name, double basic, double hra, double da) {
        super(id, name, basic);
        this.hra = hra;
        this.da = da;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Salary: " + (basic + hra + da));
    }
}

class Main1 {
    public static void main(String[] args) {
        PermanentEmployee e =
            new PermanentEmployee(101, "Ravi", 20000, 5000, 3000);
        e.display();
    }
}