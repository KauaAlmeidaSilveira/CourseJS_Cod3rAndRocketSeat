package GenericsSetMap;

import Model.Entities.Course;
import Model.Entities.Instructor;
import Model.Entities.Student;

import java.util.*;

public class ExerciseSetCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java", "POO"));
        courses.add(new Course("Python", "Logic"));
        courses.add(new Course("BD", "UML"));

        for (Course course : courses) {
            System.out.print("How many students for course " + course.getTitle() + "? ");
            int qntStudents = sc.nextInt();

            for (int i = 0; i < qntStudents; i++) {
                int code = sc.nextInt();
                course.getStudents().add(new Student(code));
            }
        }

        Instructor instructor = new Instructor("Kaua", courses);

        Set<Student> totalStudents = new HashSet<>();

        for (int i=0; i<instructor.getCourses().size(); i++) {
            totalStudents.addAll(instructor.getCourses().get(i).getStudents());
        }

        System.out.printf("Total students: %d", totalStudents.size());

        sc.close();
    }
}
