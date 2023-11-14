import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest extends TestCase {
    public void testShouldResultInTrue() {
        boolean result = Main.isItRectangularTriangle(3,4,5);
        Assertions.assertTrue(result);
    }
    public void testShouldResultInFalse(){
        boolean result = Main.isItRectangularTriangle(5,6,8);
        Assertions.assertFalse(result);
    }
}