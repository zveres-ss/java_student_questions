package ua.lviv.iot;

import java.util.List;

public interface Instructor extends Worker {

    void teachStudents(List<Student> students);
    
    Student expell();
    
    String getCourseName();
}
