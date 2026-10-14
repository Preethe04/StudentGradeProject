public class StudentGrade {
    public static String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int marks = 85;
        System.out.println("Marks = " + marks);
        System.out.println("Grade = " + calculateGrade(marks));
    }
}
