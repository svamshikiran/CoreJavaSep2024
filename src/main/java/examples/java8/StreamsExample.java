package examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "JAVA", "HYDERABAD", 98));
        studentList.add(new Student(2, "SQL", "CHENNAI", 96));
        studentList.add(new Student(3, "MAVEN", "PUNE", 89));
        studentList.add(new Student(4, "NOSQL", "MUMBAI", 90));
        studentList.add(new Student(5, "GIT", "HYDERABAD", 88));
        studentList.add(new Student(6, "SPRING", "CHENNAI", 96));
        studentList.add(new Student(7, "ANGULAR", "BENGALURU", 91));
        studentList.add(new Student(8, "REACT", "HYDERABAD", 86));
        studentList.add(new Student(9, "MIROSERVICES", "MUMBAI", 99));
        studentList.add(new Student(10, "DOCKER", "PUNE", 85));

        //WHAT WE HAVE TO DO & HOW WE HAVE TO DO
        studentList.forEach(student->{
            if(student.getMarks()>90){
                System.out.println("STUDENT NAME: "+student.getName());
            }
        });

        Stream<Student> studentStream = studentList.stream(); // WHAT WE HAVE TO DO
        /*Stream<Student> filteredStudents = studentStream.filter(student -> student.getMarks() > 90);
        filteredStudents.forEach(student -> {
            System.out.println("FILTERED STUDENT NAME: "+student.getName());
        });*/

        List<String> studentNames = studentStream.filter(student -> student.getMarks() > 90)
                .map(student -> student.getName())
                .collect(Collectors.toList());

        studentNames.forEach(name-> System.out.println("NAME: "+name));
    }
}
