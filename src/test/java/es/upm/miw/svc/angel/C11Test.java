package es.upm.miw.svc.angel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 myClass;
    
    @Before
    public void before() {
        myClass = new C11();
    }

    @Test
    public void testM1() {
        myClass = new C11();
        assertEquals( "C11.m1()", myClass.m1() );
    }

    @Test
    public void testM2() {
        myClass = new C11();
        assertEquals( "C11.m2()", myClass.m2() );
    }


}
