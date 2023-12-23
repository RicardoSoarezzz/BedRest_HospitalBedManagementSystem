import org.example.MyController;
import org.example.TableBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TableBuilderTest {

    TableBuilder testClass;
    @BeforeEach
    public void setup() {
        testClass=new TableBuilder();
    }
    @Test
    public void bedsTableTest(){
        System.out.println(testClass.buildBedsTable());
    }

}
