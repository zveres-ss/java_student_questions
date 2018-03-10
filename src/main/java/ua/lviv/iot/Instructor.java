package ua.lviv.iot;

import java.util.List;

public interface Instructor extends Worker {

    void teachStudents(List<Student> students);

    List<Student> expell();

    String getCourseName();

    default String getName() {
        return "Vassia";
    }
}
