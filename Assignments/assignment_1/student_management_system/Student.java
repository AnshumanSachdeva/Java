package assignment_1.student_management_system;


public class Student {
    private String name;
    private int roll;
    private String grade;
    private String department;

    public Student(String name, int roll, String grade, String department) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getGrade() {
        return grade;
    }
    public String getDepartment() {
        return department;
    }
}