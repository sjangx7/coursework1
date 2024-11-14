import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testDecimalToHexadecimal() {
        // Test case for converting a decimal to hexadecimal
        Dec2Hex dec2Hex = new Dec2Hex();
        String result = dec2Hex.convertToHex(255); // Expected: "FF"
        assertEquals("FF", result);
    }

    @Test
    public void testZeroToHexadecimal() {
        // Test case for zero
        Dec2Hex dec2Hex = new Dec2Hex();
        String result = dec2Hex.convertToHex(0); // Expected: "0"
        assertEquals("0", result);
    }

    @Test
    public void testNegativeToHexadecimal() {
        // Test case for negative input (if handled by your code)
        Dec2Hex dec2Hex = new Dec2Hex();
        String result = dec2Hex.convertToHex(-1); // Expected: "-1"
        assertEquals("-1", result);
    }
}
