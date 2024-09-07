package examples.java8;

// POJO - Plain Old Java Object
public class Student {
    private int rollno;
    private String name;
    private String city;
    private double marks;

    public Student(int rollno, String name, String city, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public void setRollno(int rollno) {
        if(rollno<=0)
        {
            System.out.println("ROLLNO CAN'T BE ZERO or NEGATIVE");
            return;
        }
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }
}
