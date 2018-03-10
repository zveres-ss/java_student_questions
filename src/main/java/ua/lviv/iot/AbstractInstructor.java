package ua.lviv.iot;

import java.util.LinkedList;
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
    
    @Override
    public List<Student> expell() {
        List<Student> result = new LinkedList<>();
        
        // stream and lambda
        students.stream().filter((student) -> student.successRate() < 50).forEachOrdered(studentToExpel -> result.add(studentToExpel));
        students.removeAll(result);
        
        // equivalent to stream and lambda line
        //for(Student student : students) {
        //    if (student.successRate() < 50) {
        //        result.add(student);
        //    }
        //}
        
        return result;
    }
    
    public List<Student> getStudents() {
        return students;
    }

}
