package edu.ul.android.favorite;

import android.util.Log;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Log.class)
public class ValidatorTest {

    private static Log log;

    private static Validators v;

    @BeforeClass
    public static void setUpClass() {
        PowerMockito.mockStatic(Log.class);

        v = new Validators();
        v.setLog(log);
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
    }

    @Test
    public void isByte() {
    }
}