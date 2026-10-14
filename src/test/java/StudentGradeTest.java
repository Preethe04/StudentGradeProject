import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {
    @Test void gradeA() { assertEquals("A", StudentGrade.calculateGrade(95)); }
    @Test void gradeB() { assertEquals("B", StudentGrade.calculateGrade(85)); }
    @Test void gradeC() { assertEquals("C", StudentGrade.calculateGrade(75)); }
    @Test void gradeD() { assertEquals("D", StudentGrade.calculateGrade(65)); }
    @Test void gradeF() { assertEquals("F", StudentGrade.calculateGrade(45)); }
    @Test void boundaries() {
        assertEquals("A", StudentGrade.calculateGrade(90));
        assertEquals("B", StudentGrade.calculateGrade(80));
        assertEquals("C", StudentGrade.calculateGrade(70));
        assertEquals("D", StudentGrade.calculateGrade(60));
        assertEquals("F", StudentGrade.calculateGrade(0));
        assertEquals("A", StudentGrade.calculateGrade(100));
    }
    @Test void invalidMarks() {
        assertThrows(IllegalArgumentException.class, () -> StudentGrade.calculateGrade(-1));
        assertThrows(IllegalArgumentException.class, () -> StudentGrade.calculateGrade(101));
    }
}
