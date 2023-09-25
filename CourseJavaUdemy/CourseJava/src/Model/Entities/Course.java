package Model.Entities;

import java.util.List;
import java.util.Objects;

public class Course {

    private String title;
    private String subject;
    public List<Student> students;

    public Course(String title, String subject) {
        this.title = title;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(subject, course.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }
}
