package Seminars.Seminar11.model;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private int course;
    private Attendance attendance;

    public Student(String name, String surname, int course, Attendance attendance) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return student.getAttendance().attendanceCount() - attendance.attendanceCount();
    }

}
