package edu.ul.android.favorite;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.widget.CheckBox;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        this.activity = getActivity();
    }

    @SmallTest
    public void testCheckboxNotClickable() {
        final View decorView = activity.getWindow().getDecorView();
        CheckBox ip_check = (CheckBox) activity.findViewById(R.id.ip_check);

        ViewAsserts.assertOnScreen(decorView, ip_check);
        assertFalse("IP Checkbox is clickable", ip_check.isClickable());
    }
}
