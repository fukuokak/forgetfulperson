package jp.co.fukuokak.forgetfulperson.util;

import android.test.MoreAsserts;

import junit.framework.TestCase;

public class CommonUtilitiesTest extends TestCase {
    public CommonUtilities comUtil = new CommonUtilities();

    public void testDebugToast() throws Exception {

    }

    public void testPrintString() throws Exception {

    }

    public void testPrintString_正常系() throws Exception {
        TestCase.assertEquals( "TestCase1", comUtil.printString("TestCase1"));
    }

    public void testPrintString_異常系() throws Exception {
        MoreAsserts.assertNotEqual("TestCase2", comUtil.printString("TestCase1"));
    }


    public void testSaveWeeklyRecord() throws Exception {

    }
}