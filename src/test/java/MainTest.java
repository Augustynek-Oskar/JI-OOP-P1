import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest extends TestCase {


    public void shouldConvertTenMinutesToSeconds() {
            int minutes = 10;
            int result = minutes * 60;

            Assertions.assertEquals(600, result);
    }
}