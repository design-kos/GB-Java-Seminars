package Seminars.Seminar9;

import java.time.LocalDate;

public class Student {
    
    public Student(String name, LocalDate dateOfBirth, float avgScore) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.avgScore = avgScore;
    }

    private String name;
    private LocalDate dateOfBirth;
    private float avgScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", avgScore=" + avgScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public float getAvgScore() {
        return avgScore;
    }

}
