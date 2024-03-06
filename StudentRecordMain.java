import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
    private static Set<Integer> studentIds = new HashSet<>();
    private String name;
    private int id;
    private int age;
    private int totalMarks;
    private boolean isPresent;
	private boolean isPresent2;

    // Constructor
    public Student(String name, int age, int id, int totalMarks, boolean isPresent) {
        this.name = name.toUpperCase(); // Display name in Capital Letters
        if (validateStudentId(id)) {
            this.id = id;
            studentIds.add(id);
        } else {
            System.out.println("Invalid Student ID. Student with ID " + id + " already exists.");
            return;
        }
        this.age = age;
        this.totalMarks = totalMarks;
        this.isPresent = isPresent;
    }

    // Validation for unique student ID
    private boolean validateStudentId(int id) {
        return !studentIds.contains(id);
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public String getName() {
        return name;
    }
}

public class StudentRecordMain {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, 101, 85, true));
        students.add(new Student("Alice", 22, 102, 90, false));
        students.add(new Student("Bob", 21, 103, 78, true));
        students.add(new Student("Alice", 22, 104, 95, true)); // Duplicate name
        students.add(new Student("Charlie", 23, 105, 88, true));

        // Find the sum of total marks obtained by all students
        int sumTotalMarks = calculateSumTotalMarks(students);
        System.out.println("Sum of Total Marks: " + sumTotalMarks);

        // List unique names of students
        Set<String> uniqueNames = getUniqueNames(students);
        System.out.println("Unique Names: " + uniqueNames);

        // List student info sorted in descending order by age
        sortStudentsByAgeDescending(students);
        System.out.println("\nStudent Info Sorted in Descending Order by Age:");
        printStudentInfo(students);

        // List students that are present in class
        List<Student> presentStudents = getPresentStudents(students);
        System.out.println("\nStudents Present in Class:");
        printStudentInfo(presentStudents);

        // Number of students in the class that are present
        long countPresentStudents = countPresentStudents(students);
        System.out.println("\nNumber of Students Present in Class: " + countPresentStudents);
    }

    private static int calculateSumTotalMarks(List<Student> students) {
        int sumTotalMarks = 0;
        for (Student student : students) {
            sumTotalMarks += student.getTotalMarks();
        }
        return sumTotalMarks;
    }

    private static Set<String> getUniqueNames(List<Student> students) {
        Set<String> uniqueNames = new HashSet<>();
        for (Student student : students) {
            uniqueNames.add(student.getName());
        }
        return uniqueNames;
    }

    private static void sortStudentsByAgeDescending(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::getAge).reversed());
    }

    private static void printStudentInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }

    private static List<Student> getPresentStudents(List<Student> students) {
        List<Student> presentStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.isPresent()) {
                presentStudents.add(student);
            }
        }
        return presentStudents;
    }

    private static long countPresentStudents(List<Student> students) {
        long count = 0;
        for (Student student : students) {
            if (student.isPresent()) {
                count++;
            }
        }
        return count;
    }
}
