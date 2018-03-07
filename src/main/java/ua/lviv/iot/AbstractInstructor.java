package ua.lviv.iot;

import java.util.List;

public abstract class AbstractInstructor implements Instructor {
    
    private String courseName;
    
    private List<Student> students;
    
    public AbstractInstructor(String courseName, List<Student> student) {
        this.courseName = courseName;
    }


    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String doJob() {
        teachStudents(students);
        return "teaching students";
    }

}
