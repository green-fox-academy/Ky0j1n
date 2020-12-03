package com.greenfoxacademy.teacher_student;

import java.sql.SQLOutput;

//- Create `Student` and `Teacher` classes
//        - `Student`
//        - `learn()` -> prints the student is learning something new
//        - `question(teacher)` -> calls the teachers answer method
//        - `Teacher`
//        - `teach(student)` -> calls the students learn method
//        - `answer()` -> prints the teacher is answering a question
//        - Instantiate a `Student` and `Teacher` object
//        - Call the student's `question()` method and the teacher's `teach()` method
public class Student {
    String name = "Luke";

    public static void learn() {
        System.out.println("The student is learning something new...");
    }

    public void question(Teacher toWho) {
        new Teacher();
        Teacher.answer();

    }


}
