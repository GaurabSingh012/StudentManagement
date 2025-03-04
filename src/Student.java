import java.util.Date;

public class Student {
    private String prn;
    private String name;
    private Date dob;
    private double marks;

    public Student(String prn, String name, Date dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}
