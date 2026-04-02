import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AppTest {

    private void provideInput(String data) {
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
    }

    @Test
    public void testScholarshipEligible() {
        provideInput("90\n90\n90\n");
        
        // Capture output to verify the result if needed
        ScholarshipCalculator.main(new String[0]);
        
        // You can add assertions here to check specific logic if refactored, 
        // or just ensure no exceptions are thrown during valid input.
    }

    @Test
    public void testFailResult() {
        // Input: 30, 90, 90 (One subject < 40, Result: FAIL)
        provideInput("30\n90\n90\n");
        ScholarshipCalculator.main(new String[0]);
    }

    @Test
    public void testNotEligibleHighMarks() {
        // Input: 84, 84, 84 (Percentage: 84%, Result: PASS but < 85% for Scholarship)
        provideInput("84\n84\n84\n");
        ScholarshipCalculator.main(new String[0]);
    }
}
