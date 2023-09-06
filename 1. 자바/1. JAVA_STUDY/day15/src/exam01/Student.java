package exam01;

import java.util.Objects;

public class Student /*extends Object*/ {
    private int id;
    private String name;
    private String subject;

    public Student(){

    }

    public Student(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", str='" + name + '\'' +
                ", Subject='" + subject + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object obj) { // Object obj = new Student(...)
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(student.id == id && student.name.equals(name) && student.subject.equals(subject)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(id,name,subject);
        return hash;

    }
}
