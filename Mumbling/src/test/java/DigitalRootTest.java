import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by claudio on 05/02/17.
 */
public class DigitalRootTest {

        @Test
        public void Tests() {
            //assertEquals( "Nope!" , DigitalRoot.digital_root(16), 7);
            assertEquals( "Nope!" , DigitalRoot.digital_root(132189), 6);
        }
}
