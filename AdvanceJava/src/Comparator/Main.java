package Comparator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(2,"Ram",8.5,LocalDate.of(2000,5,10)));
        list.add(new Student(1,"Amit",9.1,LocalDate.of(1999,3,15)));
        list.add(new Student(1,"Zara",9.1,LocalDate.of(1999,3,15)));
        list.add(new Student(1,"Amit",8.0,LocalDate.of(2001,1,1)));

        list.sort(
                Comparator.comparing(Student::getId)
                          .thenComparing(Student::getCgpa)
                          .thenComparing(Student::getDob)
                          .thenComparing(Student::getName)
        );

        list.forEach(System.out::println);
    }
}