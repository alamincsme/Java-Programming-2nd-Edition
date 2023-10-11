package com.alamin.practice;

import java.util.Arrays;

public class StudentDatabase {
    private Student[] students;
    private int size;

    private StudentDatabase() {
        students = new Student[10];
        size = 0 ;
    }

    public void addStudent(Student student) throws DuplicateStudentException {
        int id = student.getId();
        for (int i = 0 ; i < size; i++) {
            if (students[i].getId() == id ) {
                throw new DuplicateStudentException("A student with ID " + id + " already exists.");
            }
        }
        if (isFull()) {
            grow();
        }
        students[size++] = student;
        System.out.println("Added successfully.");
    }

    private void grow() {
        int newCapacity = students.length * 2 ;
        Arrays.copyOf(students, newCapacity);
    }

    private boolean isFull() {
        return size == students.length;
    }

    public int size() {
        return size;
    }
    public void deleteStudent(int id) throws StudentNotFoundException{
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                index = i ;
                break;
            }
        }

        if (index == -1) {
            throw new StudentNotFoundException("A student with ID " + id + " does not exist.");
        }

        for (int i = index; i < size - 1; i++) {
            students[i] = students[i+1];
        }
        size--;
        System.out.println("Deleted successfully.");
    }


    public Student searchStudent(int id) throws StudentNotFoundException {

        for (int i = 0 ; i < size ; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("A student with ID " +  id + " does not exist.");
    }



    public static void main(String[] args) throws DuplicateStudentException {

        StudentDatabase db = new StudentDatabase();

        try {
            db.addStudent(new Student("ANM Bazlur Rahman", 101));
            db.addStudent(new Student("Mukit Chowdhory", 102));
            db.addStudent(new Student("Mohammad Alamin", 103));
        } catch (DuplicateStudentException duplicateStudentException) {
            System.out.println("Duplicate student found.");
        }

        try {
            db.deleteStudent(101);
        } catch (StudentNotFoundException e ) {
            System.out.println("Student not found.");
        }

        System.out.println(db.size);


    }
}

class DuplicateStudentException extends Throwable {
    public DuplicateStudentException(String message) {
        super(message);
    }
}
class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String message) {
        super(message);
    }
}


class Student {
    private String name;
    private int Id;

    public Student(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }
}
