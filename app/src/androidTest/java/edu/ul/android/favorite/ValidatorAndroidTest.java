package edu.ul.android.favorite;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ul.android.favorite.Validators;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ValidatorAndroidTest {
    private static Validators v;

    @BeforeClass
    public static void setUpClass() {
        v = new Validators();
    }

    @Test
    public void isIp() {
        String ip1 = "192.168.1.1";
        assertTrue(ip1, v.isIp(ip1));

        String ip2 = "A.B.C.D";
        assertFalse(ip2, v.isIp(ip2));
    }

    @Test
    public void isPrime() {
        assertTrue("7 is a prime", v.isPrime("7"));
        assertFalse("8 is not a prime", v.isPrime("8"));
    }

    @Test
    public void isByte() {
    }
}