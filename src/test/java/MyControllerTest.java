import org.example.MyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyControllerTest {
    MyController testClass;
    @BeforeEach
    public void setup() {
        testClass=new MyController();
    }

    @Test
    public void getUsersTableTest() {
        System.out.println(testClass.getUsersTable());
    }

}
