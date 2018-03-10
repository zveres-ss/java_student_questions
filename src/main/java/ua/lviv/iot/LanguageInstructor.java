package ua.lviv.iot;

import java.util.List;

public class LanguageInstructor extends AbstractInstructor {

    public LanguageInstructor(String courseName, List<Student> student) {
        super(courseName, student);
    }

    @Override
    public void teachStudents(List<Student> students) {
        students.forEach(
                s -> System.out.println("Language instructor teaching " + getCourseName() + ":" + s.toString()));
    }

    @Override
    public List<Student> expell() {
        List<Student> studentsToExpel = super.expell();

        getStudents().stream().filter(student -> student.getLanguageMark() < 60)
                .forEachOrdered(studentToExpel -> studentsToExpel.add(studentToExpel));

        return studentsToExpel;
    }

}
