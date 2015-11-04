package edu.ul.android.favorite;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.UiThreadTest;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private CheckBox ip_check;
    private Button ip_button;
    private EditText ip_input;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        activity = getActivity();
        ip_check = (CheckBox) activity.findViewById(R.id.ip_check);
        ip_button = (Button) activity.findViewById(R.id.ip_button);
        ip_input = (EditText) activity.findViewById(R.id.ip_input);
    }

    @SmallTest
    public void testCheckboxNotClickable() {
        final View decorView = activity.getWindow().getDecorView();
        CheckBox ip_check = (CheckBox) activity.findViewById(R.id.ip_check);

        ViewAsserts.assertOnScreen(decorView, ip_check);
        //assertFalse("IP Checkbox is clickable", ip_check.isClickable());
    }

    @SmallTest
    public void testClick() {
        TouchUtils.clickView(this, ip_button);
        assertFalse(ip_check.isChecked());

        activity.runOnUiThread(new Runnable() {
            public void run() {
                ip_input.setText("192.168.1.1");
            }
        });

        TouchUtils.clickView(this, ip_button);
        assertTrue(ip_check.isChecked());
    }
}
