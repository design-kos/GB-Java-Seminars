package Seminars.Seminar9;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return this.students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public Iterator<Student> listIterator() {
        return new StudentGroupListIterator(0, this);
    }

}
