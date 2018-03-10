package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student vladT = new Student() {

            @Override
            public int successRate() {
                return 51;
            }

            @Override
            public int getLanguageMark() {
                return 52;
            }
            
            @Override
            public String toString() {
                return "My name is Vlad, I like to drink beer instead of studing";
            }
            
        };
        
        Student angersity = new Student() {

            @Override
            public int successRate() {
                return 0;
            }

            @Override
            public int getLanguageMark() {
                return 0;
            }
            
            @Override
            public String toString() {
                return "I am Petro who was at university in September";
            }
            
        };
        
        Student ivan = new Student() {

            @Override
            public int successRate() {
                return 100;
            }

            @Override
            public int getLanguageMark() {
                return 100;
            }
            
            @Override
            public String toString() {
                return "I am Ivan I will work hard with my mentor";
            }
            
        };
        
        final List<Student> students = new LinkedList<>();
        students.add(angersity);
        students.add(ivan);
        students.add(vladT);
        
        Instructor englishLanguageInstructor = new LanguageInstructor("english", students);
        englishLanguageInstructor.doJob();
        System.out.println("Expelled:");
        englishLanguageInstructor.expell().forEach(System.out::println);
    }

}
