package com.example.moneyyappapplication;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import kotlin.jvm.JvmField;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.moneyyappapplication", appContext.getPackageName());
    }

    @Test
    public void numberAddition1() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 30.0")));
    }

    @Test
    public void numberAddition2() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 10.0")));
    }

    @Test
    public void numberAddition3() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -10.0")));
    }

    @Test
    public void numberAddition4() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -30.0")));
    }

    @Test
    public void numberAddition5() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(20.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 30.1")));
    }


    @Test
    public void numberAddition6() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(20.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 10.1")));
    }

    @Test
    public void numberAddition7() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -10.1")));
    }

    @Test
    public void numberAddition8() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -30.1")));
    }

    @Test
    public void numberAddition9() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 30.1")));
    }

    @Test
    public void numberAddition10() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 9.9")));
    }

    @Test
    public void numberAddition11() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -9.9")));
    }

    @Test
    public void numberAddition12() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -30.1")));
    }

    @Test
    public void numberAddition13() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 20.2")));
    }

    @Test
    public void numberAddition14() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 0.0")));
    }
    @Test
    public void numberAddition15() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is 0.0")));
    }

    @Test
    public void numberAddition16() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("The sum is -20.2")));
    }

    @Test
    public void numberAdditionWithString1() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString2() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString3() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(20.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString4() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-20.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString5() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString6() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString7() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString8() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }

    @Test
    public void numberAdditionWithString9() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("hello")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Input values cannot be string type")));
    }


    @Test
    public void numberAdditionWithNullValues1() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(20)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues2() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-20)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues3() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(20.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues4() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf(-20.1)));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues5() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues6() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues7() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues8() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf(-10.1)));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }

    @Test
    public void numberAdditionWithNullValues9() {

        onView(withId(R.id.input1)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.input2)).perform(typeText(String.valueOf("")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Null values cannot be accepted")));
    }


}