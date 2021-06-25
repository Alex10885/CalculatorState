package Calculator;

import static org.junit.Assert.*;

public class ContextTest {

    @org.junit.Test
    public void run() throws Exception {
        Context context = new Context();
//        int actual = context.run("C2+3=");
//        int expect = 5;
//        assertEquals(expect, actual);
        assertEquals(0, context.run("C"));
        assertEquals(2, context.run("C2"));
        assertEquals(25754, context.run("C25754"));
        assertEquals(100, context.run("C125-25="));
        assertEquals(20, context.run("C100/5="));
        assertEquals(56, context.run("C7*8="));
        assertEquals(2025, context.run("C45*45="));
        assertEquals(10, context.run("C5+="));
        assertEquals(20, context.run("C2+2*5="));

    }
}