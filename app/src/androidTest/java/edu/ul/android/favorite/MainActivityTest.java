package edu.ul.android.favorite;

import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.assertThat;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isNotChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
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

    }

    @Test
    public void checkboxesAreUnchecked() {
        // TODO: you should verify that these checkboxes are not checked by default
    }

    @Test
    public void checkboxesAreNotClickable() {
        // TODO: you should verify that these checkboxes are not clickable by default
    }

    @Test
    public void onIpAddress() {
        // TODO: you should write a complete scenario where:
        // - you set the text value of the ip_input view
        // - perform a click on the ip_button view
        // - verify that ip_check is checked if the IP Address is correct and the inverse as well
        // be sure to clean the state between the two assertions ! (look at the emulator to see what it means)
    }
}