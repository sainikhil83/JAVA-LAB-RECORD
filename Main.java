class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Marks extends Student {
    int m1 = 80, m2 = 75, m3 = 90, m4 = 85, m5 = 70;

    Marks(int id, String name) {
        super(id, name);
    }
}

class Result extends Marks {
    Result(int id, String name) {
        super(id, name);
    }

    void display() {
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;
        String grade = avg >= 80 ? "A" : avg >= 60 ? "B" : "C";

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        new Result(101, "Ravi").display();
    }
}