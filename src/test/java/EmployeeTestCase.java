import org.example.Employee;
import org.example.FieldLengthLimitException;
import org.example.IncorrectSalaryException;
import org.junit.Test;

public class EmployeeTestCase {
    @Test(expected = IncorrectSalaryException.class)
    public void createTestIncorrectSalary() throws IncorrectSalaryException, FieldLengthLimitException {
        Employee worker = new Employee((short)1, "John", "Peterson", -3000);
    }

    @Test(expected = FieldLengthLimitException.class)
    public void createTestFieldLengthLimit() throws IncorrectSalaryException, FieldLengthLimitException {
        Employee worker = new Employee((short)1, "JohnJohnJohnJohnJohnJohnJohn", "Peterson", 3000);
    }
}