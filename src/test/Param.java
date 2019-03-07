import org.junit.Test;
import junit.framework.TestCase;

public class Param extends TestCase {

    private int count=0;
    @Test
    public void test1(){
        count++;
        assertEquals(1,count);
    }

    //    System.out.println("ss");
    @Test

    public void test2(){
        count++;
        assertEquals(1,count);
    }

}
