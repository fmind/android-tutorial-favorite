package edu.ul.android.favorite;

import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void topAndBottomWidgetsAreDisplayed() {
        // these two test assertions verify that the top and the bottom view are displayed
        onView(withId(R.id.ip_label)).check(matches(isDisplayed()));
        onView(withId(R.id.hex_check)).check(matches(isDisplayed()));
    }

    @Test
    public void inputsAreEmpty() {
        // TODO: you should verify that the text of these views is empty by default
        onView(withId(R.id.ip_input)).check(matches(withText("")));
        onView(withId(R.id.bin_input)).check(matches(withText("")));
        onView(withId(R.id.hex_input)).check(matches(withText("")));
    }

    @Test
    public void checkboxesAreUnchecked() {
        // TODO: you should verify that these checkboxes are not checked by default
        onView(withId(R.id.ip_check)).check(matches(isNotChecked()));
        onView(withId(R.id.bin_check)).check(matches(isNotChecked()));
        onView(withId(R.id.hex_check)).check(matches(isNotChecked()));
    }

    @Test
    public void checkboxesAreNotClickable() {
        // TODO: you should verify that these checkboxes are not clickable by default
        onView(withId(R.id.ip_check)).check(matches(not(isClickable())));
        onView(withId(R.id.bin_check)).check(matches(not(isClickable())));
        onView(withId(R.id.hex_check)).check(matches(not(isClickable())));
    }

    @Test
    public void onIpAddress() {
        // TODO: you should write a complete scenario were:
        // - you set the text value of the ip_input view
        // - perform a click on the ip_button view
        // - verify that ip_check is checked if the IP Address is correct and the inverse as well
        // be sure to clean the state between the two assertions ! (look at the emulator to see what it means)
        onView(withId(R.id.ip_input)).perform(typeText("192.168.100.100"), closeSoftKeyboard());
        onView(withId(R.id.ip_button)).perform(click());
        onView(withId(R.id.ip_check)).check(matches(isChecked()));

        onView(withId(R.id.ip_input)).perform(replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.ip_input)).perform(typeText("A.B.C.D"), closeSoftKeyboard());
        onView(withId(R.id.ip_button)).perform(click());
        onView(withId(R.id.ip_check)).check(matches(isNotChecked()));
    }
}