package my.examples.businesscard;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class JUnitTest {
    private Random random; // test 할 객체.
    @Before
    public void init(){
        random = new Random(); // test할 객체를 초기화.
        System.out.println("init");
    }

    @Test
    public void test1() throws Exception{
        System.out.println(random.nextInt());
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception{
        System.out.println(random.nextInt());
        System.out.println("test2");
    }
}
