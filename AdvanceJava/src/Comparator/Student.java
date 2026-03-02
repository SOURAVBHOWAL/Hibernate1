//package Comparator;
//import java.time.LocalDate;
//
//public class Student {
//
//    private int id;
//    private String name;
//    private double cgpa;
//    private LocalDate dob;
//
//    public Student(int id, String name, double cgpa, LocalDate dob) {
//        this.id = id;
//        this.name = name;
//        this.cgpa = cgpa;
//        this.dob = dob;
//    }
//
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public double getCgpa() { return cgpa; }
//    public LocalDate getDob() { return dob; }
//
//    @Override
//    public String toString() {
//        return id + " " + name + " " + cgpa + " " + dob;
//    }
//}

import java.time.LocalDate;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;
    LocalDate dob;

    public Student(int id, String name, double cgpa, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.dob = dob;
    }

    @Override
    public int compareTo(Student other) {

        if (this.id != other.id)
            return this.id - other.id;

        int cgpaCompare = Double.compare(this.cgpa, other.cgpa);
        if (cgpaCompare != 0)
            return cgpaCompare;

        int dobCompare = this.dob.compareTo(other.dob);
        if (dobCompare != 0)
            return dobCompare;

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cgpa + " " + dob;
    }
}


