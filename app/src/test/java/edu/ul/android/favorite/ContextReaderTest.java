package edu.ul.android.favorite;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContextReaderTest {
    @Mock
    private Context context;

    @Test
    public void testMyRestricted() {
        // mock the .isRestricted method of context to always return false
        when(context.isRestricted()).thenReturn(false);
        // construct a new context reader given the test class context
        ContextReader reader = new ContextReader(context);
        // as expected, the custom function will always returns false
        assertThat(reader.myRestricted(), is(false));
    }

    @Test
    public void testMyName() {
        // TODO: do the same thing here so myName always returns "com.google.search"
        assertThat("TODO", false);
    }

    @Test
    public void testMyPermitted() {
        // TODO: do the same thing here so myPermitted always returns 0 for any strings
        assertThat("TODO", false);
    }
}