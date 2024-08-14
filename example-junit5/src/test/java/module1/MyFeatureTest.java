package module1;

import com.epam.reportportal.annotations.TestCaseId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFeatureTest {
    // @TestCaseId("TEST-123")
    @Test
    public void myFeature1Test() {
        Assertions.assertTrue(true, "Fake test");
    }

    // @TestCaseId("TEST-124")
    @Test
    public void myFeature2Test() {
        Assertions.fail("Test not implemented");
    }
}
