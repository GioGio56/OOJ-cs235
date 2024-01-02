import java.util.Arrays;

class Student {
    private String usn;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(String usn, String name, int marks1, int marks2, int marks3) {
        this.usn = usn;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateAverage() {
        int[] marksList = {marks1, marks2, marks3};
        Arrays.sort(marksList);
        return (marksList[1] + marksList[2]) / 2.0;
    }

    public void displayInfo() {
        double averageMarks = calculateAverage();
        System.out.printf("USN: %s, Name: %s, Average Marks: %.2f%n", usn, name, averageMarks);
    }
}

public class AvgMarks {
    public static void main(String[] args) {
        int n = 3;  // Number of students
        Student[] students = new Student[n];

        // Creating objects for each student
        students[0] = new Student("USN1", "Student1", 80, 75, 90);
        students[1] = new Student("USN2", "Student2", 85, 92, 78);
        students[2] = new Student("USN3", "Student3", 70, 88, 95);

        // Displaying information for each student
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
