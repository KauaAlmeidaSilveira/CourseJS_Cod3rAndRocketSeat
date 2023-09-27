package GenericsSetMap;

import Model.Entities.Course;
import Model.Entities.Instructor;
import Model.Entities.Student;

import java.util.*;

public class ExerciseCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java", "POO"));
        courses.add(new Course("Python", "Logic"));
        courses.add(new Course("BD", "UML"));

        Instructor instructor = new Instructor("Kaua", courses);

        System.out.print("How many students for course A? ");
        int qntStudentsA = sc.nextInt();

        for(int i= 0; i<qntStudentsA; i++){
            int code = sc.nextInt();
            instructor.getCourses().get(0).getStudents().add(new Student(code));
        }

        System.out.print("How many students for course B? ");
        int qntStudentsB = sc.nextInt();

        for(int i= 0; i<qntStudentsB; i++){
            int code = sc.nextInt();
            instructor.getCourses().get(1).getStudents().add(new Student(code));
        }

        System.out.print("How many students for course C? ");
        int qntStudentsC = sc.nextInt();

        for(int i= 0; i<qntStudentsC; i++){
            int code = sc.nextInt();
            instructor.getCourses().get(2).getStudents().add(new Student(code));
        }

        Set<Student> totalStudents = new HashSet<>();

        totalStudents.addAll(instructor.getCourses().get(0).getStudents());
        totalStudents.addAll(instructor.getCourses().get(1).getStudents());
        totalStudents.addAll(instructor.getCourses().get(2).getStudents());

        System.out.printf("Total students: %d", totalStudents.size());

        sc.close();
    }
}
