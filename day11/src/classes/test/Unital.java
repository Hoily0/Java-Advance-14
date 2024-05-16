package classes.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 30391
 */
public class Unital {

    @Before
    public void fse() {
        System.out.println("123");
    }

    @Test
    public void testGetLen() {
        int feast = getLen("423d");
        Assert.assertEquals("错误", 4, feast);
        System.out.println("执行语句");
    }

    @After
    public void test2() {
        System.out.println("这是语句前");
        int i = 10 / 1;
        System.out.println("这是语句后");
    }


    public int getLen(String s) {
        return s.length();
    }
}
