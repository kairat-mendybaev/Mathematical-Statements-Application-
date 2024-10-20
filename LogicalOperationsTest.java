import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LogicalOperationsTest {

    @Test
    public void testAnd() {
        assertTrue(LogicalOperations.and(true, true));
        assertFalse(LogicalOperations.and(true, false));
        assertFalse(LogicalOperations.and(false, true));
        assertFalse(LogicalOperations.and(false, false));
    }

    @Test
    public void testOr() {
        assertTrue(LogicalOperations.or(true, true));
        assertTrue(LogicalOperations.or(true, false));
        assertTrue(LogicalOperations.or(false, true));
        assertFalse(LogicalOperations.or(false, false));
    }

    @Test
    public void testNot() {
        assertFalse(LogicalOperations.not(true));
        assertTrue(LogicalOperations.not(false));
    }

    @Test
    public void testImplies() {
        assertTrue(LogicalOperations.implies(true, true));
        assertTrue(LogicalOperations.implies(false, true));
        assertTrue(LogicalOperations.implies(false, false));
        assertFalse(LogicalOperations.implies(true, false));
    }

    @Test
    public void testIff() {
        assertTrue(LogicalOperations.iff(true, true));
        assertFalse(LogicalOperations.iff(true, false));
        assertFalse(LogicalOperations.iff(false, true));
        assertTrue(LogicalOperations.iff(false, false));
    }

    @Test
    public void testTruthTable() {
        assertTrue(true); // Placeholder test
    }
}
