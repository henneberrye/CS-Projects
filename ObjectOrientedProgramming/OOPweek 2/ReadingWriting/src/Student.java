
public class Student {
    String name;
    String year;
    double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getgpa() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String year, double gpa) {
        this.name = name;
        this.year = year;
        this.gpa = gpa;
    }

    public void printStudent() {
        System.out.println(getName());
        System.out.println(getYear());
        System.out.println(getgpa());

    }

}
