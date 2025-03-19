package com.example.demo.catgory1.task1;

public class Student extends Person{
    private int studentId;

    public Student() {
        studentId=123344;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}



 class Factory<T> {
    public T create(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
