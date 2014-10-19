package jp.co.fukuokak.forgetfulperson.util;

import android.app.Activity;

import junit.framework.TestCase;

import java.util.Calendar;

import jp.co.fukuokak.forgetfulperson.TopFrameActivity;

public class ScreenInformationGeneratorTest extends TestCase {
    private Activity activity= new TopFrameActivity();

    private final ScreenInformationGenerator sig = new ScreenInformationGenerator();

    //To Do NullPointer Exception Now
    public void testGenerateWeekList() throws Exception {
        Calendar calendar = Calendar.getInstance();

        System.out.print(sig.generateWeekList(calendar).toString());
        assertNotNull(sig.generateWeekList(calendar));
    }

    public void testGetWeekDay() throws Exception {
        Calendar calendar = Calendar.getInstance();
        System.out.print(sig.getWeekDay(calendar));
        assertNotNull(sig.getWeekDay(calendar));

    }
}