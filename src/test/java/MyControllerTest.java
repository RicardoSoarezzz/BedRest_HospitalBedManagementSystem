import org.example.MyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyControllerTest {
    MyController testClass;
    @BeforeEach
    public void setup() {
        testClass=new MyController();
    }
    // Para o teste apenas verifico se corresponde ao department da primeira linha da base de dados porque seria muito
    // estar a verificar com muita profundidade na BD
    @Test
    public void getUsersTableTest() {
        int count=0;
        for (String i: testClass.getUsersTable().split("<td>")) {
            if(count==1) {
                assertEquals("Emergency</td>",i);
                break;
            }
            count++;
        }
    }
    @Test
    public void getBedsTableTest() {
        int count=0;
        for (String i: testClass.getBedsTable().split("<td>")) {
            if(count==5) {
                assertEquals("Occupied</td>",i);
                break;
            }
            count++;
        }
    }
    @Test
    public void getHomepageTest() {
        assertNotNull(testClass.getHomepage());
    }
    @Test
    public void getLoginTest() {
        assertNotNull(testClass.getLogin());
    }
    @Test
    public void getMenuAdminTest() {
        assertNotNull(testClass.getMenuAdmin());
    }
    @Test
    public void getMenuGestaoTest() {
        assertNotNull(testClass.getMenuGestao());
    }
    @Test
    public void getMenuManutencaoTest() {
        assertNotNull(testClass.getMenuManutencao());
    }
    @Test
    public void getMenuBaseTest() {
        assertNotNull(testClass.getMenuBase());
    }
    @Test
    public void getAddUserTest() {
        assertNotNull(testClass.getAddUser());
    }
    @Test
    public void getRemoveUserTest() {
        assertNotNull(testClass.getRemoveUser());
    }
    @Test
    public void getUpdInfoUserTest() {
        assertNotNull(testClass.getUpdInfoUser());
    }
    @Test
    public void getUpdTypeUserTest() {
        assertNotNull(testClass.getUpdTypeUser());
    }
    @Test
    public void getOccupationTest() {
        assertNotNull(testClass.getOccupations());
    }
    @Test
    public void getMealsTest() {
        assertNotNull(testClass.getMeals());
    }
    @Test
    public void getMaintenanceTest() {
        assertNotNull(testClass.getMaintenance());
    }@Test
    public void getAddBedTest() {
        assertNotNull(testClass.getAddBed());
    }
    @Test
    public void getRemoveBedTest() {
        assertNotNull(testClass.getRemoveBed());
    }
    @Test
    public void getUpdBedTest() {
        assertNotNull(testClass.getUpdBed());
    }
    @Test
    public void getAddDepTest() {
        assertNotNull(testClass.getAddDEP());
    }
    @Test
    public void getRemoveDepTest() {
        assertNotNull(testClass.getRemoveDEP());
    }
    @Test
    public void getUpdateDepTest() {
        assertNotNull(testClass.getUpdateDEP());
    }
    @Test
    public void getAddStocksTest() {
        assertNotNull(testClass.getAddStocks());
    }
    @Test
    public void getRemoveStocksTest() {
        assertNotNull(testClass.getRemoveStocks());
    }
    @Test
    public void getUpdStocksTest() {
        assertNotNull(testClass.getUpdStocks());
    }
}
