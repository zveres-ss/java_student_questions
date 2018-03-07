package ua.lviv.iot;

import java.util.List;

public abstract class AbstractInstructor implements Instructor {
    
    private String courseName;
    
    private List<Student> students;
    
    public AbstractInstructor() {}
    
    public AbstractInstructor(String courseName) {
        this(courseName, null);
    }
    
    public AbstractInstructor(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
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
