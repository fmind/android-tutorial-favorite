package edu.ul.android.favorite;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.SmallTest;
import androidx.test.runner.AndroidJUnit4;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
@SmallTest
public class ValidatorsTest {
    private static Validators V;

    /**
     * Instantiate a static validator for the test class
     */
    @BeforeClass
    public static void setUpClass() {
        V = new Validators();
    }

    @Test
    public void isIpAddress() {
        // here are two simple test assertions, you should satisfy these assertions
        assertTrue(V.isIpAddress("192.168.100.100"));
        assertFalse(V.isIpAddress("A.B.C.D"));
        // TODO: if you think it's necessary, add more assertions !
    }

    @Test
    public void isBinaryValue() {
        // TODO: write test assertions for .isBinaryValue
        assertFalse("TODO", true);
    }

    @Test
    public void isHexadecimalValue() {
        // TODO: write test assertions for .isHexadecimalValue
        assertFalse("TODO", true);
    }
}