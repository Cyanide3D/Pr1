package com.company;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(10),
                new Student(100),
                new Student(57),
                new Student(86)
        );

        boolean isPresentStudentWithMaxScore = studentPredicate().test(students);
        System.out.println(isPresentStudentWithMaxScore);
    }

    private static Predicate<List<Student>> studentPredicate() {
        return students -> students.stream().anyMatch(student -> student.getScore() == 100);
    }

//    private static Predicate<List<Student>> studentPredicateWithAnonClass() {
//
//        return new Predicate<List<Student>>() {
//            @Override
//            public boolean test(List<Student> students) {
//                for (Student student : students) {
//                    if (student.getScore() == 100) {
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
//
//    }
}
