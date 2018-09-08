import org.junit.*;

public class TestSuite_1 extends TestRules {

    @BeforeClass
    public static void beforeClass(){
        Skip.IF(true);
    }

    @Test
    public void test1() {
        Skip.IF(true);
        System.out.println("I'm test 1 from TestSuite_1!");
    }

    @Test
    public void test2(){
        Skip.IF(false);
        System.out.println("I'm test 2 from TestSuite_2!");
    }
}